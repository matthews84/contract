package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.whxisoft.constant.ContractOperConstants;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.log.Log;
import com.whxisoft.pojo.*;
import com.whxisoft.pojo.proc.ContractOperForm;
import com.whxisoft.pojo.proc.ContractOperProc;
import com.whxisoft.service.ContractOperProcService;
import com.whxisoft.service.CustomerService;
import com.whxisoft.service.SmUserService;
import com.whxisoft.util.StringUtil;
import com.whxisoft.util.XMLUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@RequestMapping("/services/contract_oper")
public class ContractOperProcController extends BaseContoller {
    private static final Logger log = LoggerFactory.getLogger(ContractOperProcController.class);

    @Value("${file.upload-folder}")
    private String uploadFolder;

    @Autowired
    private ContractOperProcService contractOperProcService;

    @Autowired
    private SmUserService userService;

    @Autowired
    private CustomerService customerService;

    @Log(module = "添加合同")
    @PostMapping("/add")
    public Map<String, Object> add(@ModelAttribute ContractOperForm contractOperForm,
                                   @RequestParam("files") MultipartFile[] files) {

        String result = dataHandler(contractOperForm, files, ContractOperConstants.SAVE);
        if (!StringUtils.isEmpty(result)) {
            String[] arr = result.split("&");
            JSONObject object = new JSONObject();
            object.put("guid", arr[0]);
            object.put("contractId", arr[1]);
            result = object.toString();
        }

        return saveResult(result);
    }


    @Log(module = "修改合同")
    @PostMapping("/update")
    public Map<String, Object> update(@ModelAttribute ContractOperForm contractOperForm,
                                      @RequestParam("files") MultipartFile[] files) {

        String result = dataHandler(contractOperForm, files, ContractOperConstants.UPDATE);

        return updateResult(result.contains("123456") ? 1 : 0);
    }

    private String dataHandler(ContractOperForm contractOperForm, MultipartFile[] files, String operType) {
        String contractInfo = contractOperForm.getContractInfo();
        String contractCaluse = contractOperForm.getContractCaluse();
        String contractExt = contractOperForm.getContractExt();
        String contractItem = contractOperForm.getContractItem();
        String contractMemo = contractOperForm.getContractMemo();
        String contractPay = contractOperForm.getContractPay();

        log.debug("\n\n{}\n{}\n{}\n{}\n{}\n{}\n",
                contractInfo,
                contractCaluse,
                contractExt,
                contractItem,
                contractMemo,
                contractPay);

        CmContract contract = JSON.parseObject(contractInfo, CmContract.class);
//        contract.setStrBisectionUnit(StringUtil.removeLastComma(contract.getStrBisectionUnit()));

        List<CmContract> contracts = Collections.singletonList(contract);

        List<CmContractCaluse> contractCaluses = JSON.parseObject(contractCaluse, new TypeReference<List<CmContractCaluse>>() {
        });
        List<CmContractExt> contractExts = JSON.parseObject(contractExt, new TypeReference<List<CmContractExt>>() {
        });
        List<CmContractItem> contractItems = JSON.parseObject(contractItem, new TypeReference<List<CmContractItem>>() {
        });
        List<CmContractMemo> contractMemos = JSON.parseObject(contractMemo, new TypeReference<List<CmContractMemo>>() {
        });
        List<CmContractPay> contractPays = JSON.parseObject(contractPay, new TypeReference<List<CmContractPay>>() {
        });

        if (!CollectionUtils.isEmpty(contractExts)) {
            int fileIndex = 0;
            for (CmContractExt ext : contractExts) {
                try {
                    if (StringUtils.isEmpty(ext.getContractRowId())) {
                        MultipartFile file = files[fileIndex];

                        log.debug("{} -> {}", file.getOriginalFilename(), file.getSize());

                        String fileName = StringUtil.getUUID() + file.getOriginalFilename();

                        String separator = File.separator;

                        if (!StringUtils.isEmpty(uploadFolder)) {
                            if (separator.equals("\\") && (!uploadFolder.contains(separator) || uploadFolder.contains("/"))) {
                                uploadFolder = uploadFolder.replace("/", "\\");
                            } else if (separator.equals("/") && (!uploadFolder.contains(separator) || uploadFolder.contains("\\"))) {
                                uploadFolder = uploadFolder.replace("\\", "/");
                            }

                            if (!uploadFolder.endsWith(File.separator)) {
                                uploadFolder += File.separator;
                            }
                        }

                        ext.setStrFileOnServer(fileName);
                        ext.setStrPath(uploadFolder + fileName);

                        File dest = new File(uploadFolder, fileName);

                        if (dest.exists()) {
                            boolean flag = dest.mkdirs();
                            if (!flag) {
                                log.debug("folder creation failed!");
                            }
                        }

                        file.transferTo(dest);
                        fileIndex++;
                    }
                } catch (Exception e) {
                    log.debug("file upload: ", e.getMessage());
                }
            }
        }

        Map<String, List<?>> map = new LinkedHashMap<>();
        map.put("CmContract", contracts);
        map.put("CmContractItem", contractItems);
        map.put("CmContractPay", contractPays);
        map.put("CmContractCaluse", contractCaluses);
        map.put("CmContractMemo", contractMemos);
        map.put("CmContractExt", contractExts);

        Map<String, String> xmls = XMLUtil.map2Xml(map);

        ContractOperProc contractOper = new ContractOperProc();

//        log.debug("\n{}\n{}\n{}\n{}\n{}\n{}",
//                xmls.get("CmContract"),
//                xmls.get("CmContractItem"),
//                xmls.get("CmContractPay"),
//                xmls.get("CmContractCaluse"),
//                xmls.get("CmContractMemo"),
//                xmls.get("CmContractExt"));


        log.debug("\n\nset @info='{}'\nset @item='{}'\nset @pay='{}'\nset @caluse='{}'\nset @memo='{}'\nset @ext='{}'\n",
                xmls.get("CmContract"),
                xmls.get("CmContractItem"),
                xmls.get("CmContractPay"),
                xmls.get("CmContractCaluse"),
                xmls.get("CmContractMemo"),
                xmls.get("CmContractExt"));

        contractOper.setOperType(operType);
        contractOper.setContractInfo(xmls.get("CmContract"));
        contractOper.setContractItem(xmls.get("CmContractItem"));
        contractOper.setContractPay(xmls.get("CmContractPay"));
        contractOper.setContractCaluse(xmls.get("CmContractCaluse"));
        contractOper.setContractMemo(xmls.get("CmContractMemo"));
        contractOper.setContractExt(xmls.get("CmContractExt"));

        contractOper.setReqInfo("");

        contractOperProcService.operContract(contractOper);
        String resInfo = contractOper.getResInfo();
        log.debug("resInfo -> {}", resInfo);

        return resInfo;
    }

    @Log(module = "删除合同")
    @PostMapping("/del")
    public Map<String, Object> del(@RequestBody Map<String, String> map) {
        String guids = map.get("guids");

        log.debug("guids -> {}", guids);

        int rows = 0;
        CmContract contract = null;
        if (!StringUtils.isEmpty(guids)) {
            String[] guid = guids.split(",");

            for (String id : guid) {
                contract = new CmContract();
                contract.setGUID(id);
                ContractOperProc contractOper = new ContractOperProc();
                contractOper.setOperType(ContractOperConstants.DELETE);
                contractOper.setContractInfo(XMLUtil.bean2Xml(contract));
                contractOper.setContractItem("");
                contractOper.setContractPay("");
                contractOper.setContractCaluse("");
                contractOper.setContractMemo("");
                contractOper.setContractExt("");
                contractOper.setReqInfo("");

                log.debug("contractInfo -> {}", contractOper.getContractInfo());

                contractOperProcService.operContract(contractOper);
                log.debug("rows -> {}", contractOper.getResInfo());
                rows++;
            }
        }

        return deleteResult(rows);
    }

    @PostMapping("/queryContract")
    public CmContract queryContract(@RequestParam("guid") String guid) {
        return contractOperProcService.queryContract(guid);
    }

    @PostMapping("/queryContractMemo")
    public String queryContractMemo(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryContractMemo(guid), filter);
    }

    @PostMapping("/queryContractPay")
    public String queryContractPay(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryContractPay(guid), filter);
    }

    @PostMapping("/queryContractExt")
    public String queryContractExt(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryContractExt(guid), filter);
    }

    @PostMapping("/queryContractCaluse")
    public String queryContractCaluse(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryContractCaluse(guid), filter);
    }

    @PostMapping("/queryContractItem")
    public String queryContractItem(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryContractItem(guid), filter);
    }

    // 查询历史合同
    @PostMapping("/queryOldContract")
    public CmContract queryOldContract(@RequestParam("guid") String guid) {
        return contractOperProcService.queryOldContract(guid);
    }

    @PostMapping("/queryOldContractMemo")
    public String queryOldContractMemo(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryOldContractMemo(guid), filter);
    }

    @PostMapping("/queryOldContractPay")
    public String queryOldContractPay(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryOldContractPay(guid), filter);
    }

    @PostMapping("/queryOldContractExt")
    public String queryOldContractExt(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryOldContractExt(guid), filter);
    }

    @PostMapping("/queryOldContractCaluse")
    public String queryOldContractCaluse(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryOldContractCaluse(guid), filter);
    }

    @PostMapping("/queryOldContractItem")
    public String queryOldContractItem(@RequestParam("guid") String guid) {
        PropertyFilter filter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return !StringUtils.isEmpty(value);
            }
        };

        return JSON.toJSONString(contractOperProcService.queryOldContractItem(guid), filter);
    }

    @PostMapping("/updateContractStatus")
    public Map<String, Object> updateContractStatus(@RequestBody Map<String, String> map) {
        String contractStatus = map.get("contractStatus");
        String guids = map.get("guids");

        int rows = 0;
        if (!StringUtils.isEmpty(guids)) {
            String[] guid = guids.split(",");

            for (String id : guid) {
                rows += contractOperProcService.updateContractStatus(contractStatus, id);
            }
        }

        return updateResult(rows);
    }

    @PostMapping("/getCustomer")
    public JSONArray getCustomer() {
        List<Customer> customers = customerService.getAll();

        JSONArray array = new JSONArray();
        JSONObject object;
        for (Customer customer : customers) {
            object = new JSONObject();
            object.put("id", customer.getcCusCode());
            object.put("name", customer.getcCusName());
            array.add(object);
        }

        return array;
    }

    @PostMapping("/getUser")
    public JSONArray getUser() {
        List<SmUser> users = userService.getAll();

        JSONArray array = new JSONArray();
        JSONObject object;
        for (SmUser user : users) {
            object = new JSONObject();
            object.put("id", user.getPk_user());
            object.put("name", user.getRealname());
            array.add(object);
        }

        return array;
    }

    @PostMapping("/getSource")
    public JSONArray getSource() {
        List<String> sources = Arrays.asList("以院（公司）名义自签", "原勘测局项目");

        return list2array(sources);
    }

    private JSONArray list2array(List<String> list) {
        JSONArray array = new JSONArray();

        JSONObject object;
        for (String str : list) {
            object = new JSONObject();
            object.put("name", str);
            array.add(object);
        }
        return array;
    }

    @PostMapping("/getType")
    public JSONArray getType() {
        List<String> types = Arrays.asList("安全监测施工", "工程勘测项目", "科研项目", "地理信息");

        return list2array(types);
    }

    @PostMapping("/checkContractId")
    public JSONObject checkContractId(String contractId) {
        int count = contractOperProcService.checkContractId(contractId);
        JSONObject object = new JSONObject();

        if (count > 0) {
            object.put("code", SystemConstants.FAIL);
            object.put("msg", "合同编码重复！");
            object.put("count", count);
        } else {
            object.put("code", SystemConstants.SUCCESS);
        }

        return object;
    }

    @PostMapping("/getContractKind")
    public JSONArray getContractKind(String contractType) {
        List<CmType> types = contractOperProcService.getContractKind(contractType);

        JSONArray array = new JSONArray();
        JSONObject object = null;
        for (CmType type : types) {
            object = new JSONObject();
            object.put("name", type.getcCharacter());
            object.put("cCode", type.getcCode());
            array.add(object);
        }

        return array;
    }

    @PostMapping("/getContractType")
    public JSONArray getContractType(String contractKind) {
        List<CmType> types = contractOperProcService.getContractType(contractKind);

        JSONArray array = new JSONArray();
        JSONObject object = null;
        for (CmType type : types) {
            object = new JSONObject();
            object.put("id", type.getcTypeCode());
            object.put("name", type.getcTypeName());
            object.put("cCode", type.getcCode());
            array.add(object);
        }

        return array;
    }

    @PostMapping("/getContractId")
    public JSONObject getContractId() {
        String contractId = contractOperProcService.getContractId();
        String prefix = DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDateTime.now());
        String no = "001";
        JSONObject object = new JSONObject();
        if (!StringUtils.isEmpty(contractId)) {
            no = String.valueOf(Integer.parseInt(contractId) + 1);

            for (int i = no.length(); i < 3; i++) {
                no = "0" + no;
            }

        }
        object.put("no", no);
        object.put("prefix", prefix);
        return object;
    }



}
