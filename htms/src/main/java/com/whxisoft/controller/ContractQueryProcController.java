package com.whxisoft.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.whxisoft.constant.ContractOperConstants;
import com.whxisoft.datatables.DataTables;
import com.whxisoft.pojo.CmContract;
import com.whxisoft.pojo.proc.ContractAndItem;
import com.whxisoft.pojo.proc.ContractAndItemSearch;
import com.whxisoft.pojo.proc.ContractQueryProc;
import com.whxisoft.service.ContractQueryProcService;
import com.whxisoft.util.XMLUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/services/contract_query")
public class ContractQueryProcController extends BaseContoller {
    private static final Logger log = LoggerFactory.getLogger(ContractQueryProcController.class);

    @Autowired
    private ContractQueryProcService contractQueryProcService;

    @PostMapping("/query")
    public Map<String, Object> query(@ModelAttribute DataTables dataTables, @ModelAttribute ContractQueryProc contractQueryProc) {
        String contractInfo = contractQueryProc.getContractInfo();

        if (!StringUtils.isEmpty(contractInfo)) {
            log.debug("\n\n{}\n", contractInfo);

            CmContract contract = JSON.parseObject(contractInfo, CmContract.class);
//            contract.setStrBisectionUnit(StringUtil.removeLastComma(contract.getStrBisectionUnit()));

            Map<String, List<?>> map = new LinkedHashMap<>();
            map.put("CmContract", Collections.singletonList(contract));

            Map<String, String> xmls = XMLUtil.map2Xml(map);

            log.debug("\n\nset @info='{}'\n", xmls.get("CmContract"));

            contractQueryProc.setContractInfo(xmls.get("CmContract"));
        } else {
            contractQueryProc.setContractInfo(ContractOperConstants.EMPTY_XML);
        }

        log.debug("startRowNumber -> {}", dataTables.getStart());
        contractQueryProc.setStartRowNumber(dataTables.getStart());
        List<CmContract> contracts = contractQueryProcService.getContract(contractQueryProc);

        for (CmContract contract : contracts) {
            if (!StringUtils.isEmpty(contract.getDblTotalCurrency())) {
                String dblTotalCurrency = contract.getDblTotalCurrency(); //合同总金额
                double dblTotal = Double.parseDouble(dblTotalCurrency);
                String dblTotalFormat = parseFormat(dblTotal);  //转换为科学记数法
                contract.setDblTotalCurrency(dblTotalFormat);
            }
        }

        log.debug("total -> {}", contractQueryProc.getResInfo());

        return procList2Map(contracts, contractQueryProc.getResInfo(), dataTables);
    }

    @PostMapping("/queryItem")
    public Map<String, Object> queryItem(@ModelAttribute DataTables dataTables, String search) {
        String sql = "";

        if (!StringUtils.isEmpty(search)) {
            ContractAndItemSearch contractAndItemSearch = JSON.parseObject(search, ContractAndItemSearch.class);

            log.debug("ContractAndItemSearch -> {}", contractAndItemSearch);

            if (!StringUtils.isEmpty(contractAndItemSearch.getStrContractID())) {
                sql += " and t1.strContractID like '%" + contractAndItemSearch.getStrContractID() + "%'";
            }

            if (!StringUtils.isEmpty(contractAndItemSearch.getStrContractName())) {
                sql += " and t1.strContractName like '%" + contractAndItemSearch.getStrContractName() + "%'";
            }
        }

        PageHelper.startPage(dataTables.getCurrentPage(), dataTables.getLength());
        List<ContractAndItem> items = contractQueryProcService.getContractAndItem(sql);
        return list2Map(items, dataTables);
    }

    private String parseFormat(double data) {
        int count = 0;
        DecimalFormat decimalFormat = new DecimalFormat("0.##########");
        while (((int) data) != 0) {
            data /= 10;
            count++;
        }
        return decimalFormat.format(data).replace(",", ".") + " x10^ " + count;
    }

}
