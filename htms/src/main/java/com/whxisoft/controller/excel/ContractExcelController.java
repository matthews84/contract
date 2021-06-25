package com.whxisoft.controller.excel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.whxisoft.constant.ContractOperConstants;
import com.whxisoft.constant.SystemConstants;
import com.whxisoft.controller.BaseContoller;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.CmContractItem;
import com.whxisoft.pojo.excel.ContractExcel;
import com.whxisoft.pojo.excel.ContractItemExcel;
import com.whxisoft.pojo.proc.ContractOperProc;
import com.whxisoft.service.ContractOperProcService;
import com.whxisoft.util.ImportUtil;
import com.whxisoft.util.XMLUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/contract")
public class ContractExcelController extends BaseContoller {
    private static final Logger log = LoggerFactory.getLogger(ContractExcelController.class);

    @Autowired
    private ContractOperProcService contractOperProcService;

    @RequestMapping("/downTemp")
    public void downTemp(HttpServletResponse response) {
        String fileName = "合同模板.xlsx";

        String name = "excel/" + fileName;
        try (InputStream in = this.getClass().getClassLoader().getResourceAsStream(name);
             OutputStream out = new BufferedOutputStream(response.getOutputStream())) {

            fileName = new String(fileName.getBytes("GBK"), "ISO8859-1");// 防止中文乱码
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);

            byte[] buf = new byte[1024];
            int len = 0;
            assert in != null;
            while ((len = in.read(buf)) != -1) {
                out.write(buf, 0, len);
            }
        } catch (Exception e) {
            log.debug("exception -> {}", e.getMessage());
        }
    }

    @RequestMapping("/importExcel")
    public Map<String, Object> importExcel(@RequestParam("file") MultipartFile file) {
        log.debug("filename -> {}", file.getOriginalFilename());

        List<ContractExcel> contracts = ImportUtil.readExcel(file, 0, ContractExcel.class);
        List<ContractItemExcel> contractItems = ImportUtil.readExcel(file, 1, ContractItemExcel.class);

        log.debug("\n\n{}\n{}\n", contracts, contractItems);

        String result = "";
        if (!CollectionUtils.isEmpty(contracts) && !CollectionUtils.isEmpty(contractItems)) {
            Map<String, Object> map = checkContractId(contracts.get(0).getStrContractID());
            if (SystemConstants.FAIL.equals(map.get("code"))) {
                return map;
            }

            result = dataHandler(contracts, contractItems);
        }

        return saveResult(!StringUtils.isEmpty(result) ? 1 : 0);
    }

    private String dataHandler(List<ContractExcel> contracts, List<ContractItemExcel> contractItems) {
        List<ContractItemExcel> items = ImportUtil.dataHandler(contractItems);
        String contractInfo = JSON.toJSONString(contracts);
        String contractItem = JSON.toJSONString(items);

        log.debug("\n\n{}\n{}\n", contractInfo, contractItem);

        List<CmContract> contractList = JSON.parseObject(contractInfo, new TypeReference<List<CmContract>>() {
        });
        List<CmContractItem> contractItemList = JSON.parseObject(contractItem, new TypeReference<List<CmContractItem>>() {
        });

        Map<String, List<?>> map = new LinkedHashMap<>();
        map.put("CmContract", contractList);
        map.put("CmContractItem", contractItemList);

        Map<String, String> xmls = XMLUtil.map2Xml(map);

        ContractOperProc contractOper = new ContractOperProc();

        log.debug("\n\nset @info='{}'\nset @item='{}'\nset @pay='{}'\nset @caluse='{}'\nset @memo='{}'\nset @ext='{}'\n",
                xmls.get("CmContract"),
                xmls.get("CmContractItem"),
                ContractOperConstants.EMPTY_XML,
                ContractOperConstants.EMPTY_XML,
                ContractOperConstants.EMPTY_XML,
                ContractOperConstants.EMPTY_XML);

        contractOper.setOperType(ContractOperConstants.SAVE);
        contractOper.setContractInfo(xmls.get("CmContract"));
        contractOper.setContractItem(xmls.get("CmContractItem"));
        contractOper.setContractPay(ContractOperConstants.EMPTY_XML);
        contractOper.setContractCaluse(ContractOperConstants.EMPTY_XML);
        contractOper.setContractMemo(ContractOperConstants.EMPTY_XML);
        contractOper.setContractExt(ContractOperConstants.EMPTY_XML);

        contractOper.setReqInfo("");

        contractOperProcService.operContract(contractOper);
        String resInfo = contractOper.getResInfo();
        log.debug("resInfo -> {}", resInfo);

        return resInfo;
    }

    private Map<String, Object> checkContractId(String contractId) {
        int count = contractOperProcService.checkContractId(contractId);
        Map<String, Object> map = new HashMap<>();

        if (count > 0) {
            map.put("code", SystemConstants.FAIL);
            map.put("msg", "合同编码重复！");
            map.put("count", count);
        } else {
            map.put("code", SystemConstants.SUCCESS);
        }

        return map;
    }
}
