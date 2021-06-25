package com.whxisoft.util;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.whxisoft.pojo.excel.ContractItemExcel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class ImportUtil {
    private static final Logger log = LoggerFactory.getLogger(ImportUtil.class);

    public static void main(String[] args) {
        String id = "1.1.2";
        getPid(id);
    }

    public static <T> List<T> readExcel(MultipartFile file, int startSheetIndex, Class<T> clazz) {
        List<T> list = new ArrayList<>();

        ImportParams params = new ImportParams();
        params.setStartSheetIndex(startSheetIndex);
        params.setSheetNum(1);
        params.setTitleRows(0);
        params.setHeadRows(1);
        params.setKeyIndex(0);
        try {
            list = ExcelImportUtil.importExcel(file.getInputStream(), clazz, params);
        } catch (Exception e) {
            log.debug("import -> {}", e.getMessage());
        }

        return list;
    }

    public static List<ContractItemExcel> dataHandler(List<ContractItemExcel> items) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0, size = items.size(); i < size; i++) {
            ContractItemExcel item = items.get(i);
            int lev = (item.getStrCode().split("\\.").length) - 1;
            item.setLev(lev);
            item.setCid(System.currentTimeMillis() + i);
            item.setPid(0L);

            set.add(lev);
        }

        List<Integer> list = new ArrayList<>(set);
        for (int i = 0, size = (list.size() - 1); i < size; i++) {
            List<ContractItemExcel> list1 = getListByLev(items, list.get(i));
            List<ContractItemExcel> list2 = getListByLev(items, list.get(i + 1));

            int lev1 = (list1.get(0).getLev()) + 1;
            int lev2 = list2.get(0).getLev();
            if (lev1 == lev2) {
                for (ContractItemExcel excel1 : list1) {
                    for (ContractItemExcel excel2 : list2) {
                        if (excel2.getStrCode().startsWith(excel1.getStrCode())) {
                            excel2.setPid(excel1.getCid());
                        }
                    }
                }
            }

        }

        return items;
    }

    private static List<ContractItemExcel> getListByLev(List<ContractItemExcel> items, Integer lev) {
        List<ContractItemExcel> list = new ArrayList<>();

        for (ContractItemExcel item : items) {
            if (Objects.equals(item.getLev(), lev)) {
                list.add(item);
            }
        }

        return list;
    }

    private static void getPid(String str) {
        if (str.contains(".")) {
            String pid = str.substring(0, str.lastIndexOf("."));
            System.out.println("id:" + str + " -> " + "pid:" + pid);
            getPid(pid);
        } else {
            if (!str.equalsIgnoreCase("0")) {
                System.out.println("id:" + str + " -> " + "pid:0");
            }
        }
    }
}