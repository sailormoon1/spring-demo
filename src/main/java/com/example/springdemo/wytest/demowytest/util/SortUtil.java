package com.example.springdemo.wytest.demowytest.util;


import com.example.springdemo.wytest.demowytest.test.PatientSheetInfo;

import java.util.Map;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author guomengmeng
 * @Version 1.0.0
 * @date 2020/12/4 11:06 上午
 * @description 排序转换工具类
 */
@Slf4j
public class SortUtil {

    public static Integer getBedNo(PatientSheetInfo o){
        if (ObjectUtil.isNull(o)) {
            return null;
        }
        try {
            log.info("床位转换之后：{},元素信息为：{}",Integer.valueOf(o.getCbedNo()), JSONUtil.toJsonStr(o));
            return Integer.valueOf(o.getCbedNo());

        } catch (Exception e) {
            return null;
        }
    }

}
