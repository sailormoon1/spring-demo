package com.example.springdemo.wytest.demowytest.test;


import com.example.springdemo.wytest.demowytest.util.AttributeComparator;
import com.example.springdemo.wytest.demowytest.util.SortUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test1 {

    public static void main(String[] args) {

        List<Map> inpMedInfoList = new ArrayList<>();
        AttributeComparator attributeComparator = new AttributeComparator(new String[]{"ptd_id", "indetails_id"});
        List<Map> tempMedInfoList = attributeComparator.removeDuplication(inpMedInfoList, (x, y) -> {
            double x_qty = Double.parseDouble(x.get("qty").toString());
            double y_qty = Double.parseDouble(y.get("qty").toString());
            if (x_qty > 0) {
                x.put("qty", x_qty + y_qty);
                return x;
            } else {
                y.put("qty", x_qty + y_qty);
                return y;
            }
        });
        List<PatientSheetInfo> patientSheetDtoList = new ArrayList<>();
        patientSheetDtoList.add(new PatientSheetInfo("01"));
        patientSheetDtoList.add(new PatientSheetInfo(""));

        patientSheetDtoList.add(new PatientSheetInfo("02"));
        log.info("排序前：{}", JSONUtil.toJsonStr(patientSheetDtoList));
        List<PatientSheetInfo>  patientSheetDtoListNew = patientSheetDtoList.stream().sorted(Comparator.comparing(SortUtil::getBedNo, Comparator.nullsFirst(Integer::compareTo))).collect(Collectors.toList());
        log.info("排序后：{}", JSONUtil.toJsonStr(patientSheetDtoListNew));
    }
}
