package com.example.springdemo.wytest.demowytest.test;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Yestin
 * @description: 执行单据左侧病人列表
 * @date 2020/11/10 9:49 上午
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class PatientSheetInfo {

    /**
     * 当前床位号
     */
    private String cbedNo;

    /**
     * 医疗优惠类别 如果不为空，则说明是优惠打折患者
     */
    private String discount;

    private String discountName;

    /**
     * 住院号
     */
    private String inpNo;
    //预交金总金额
    private String money;

    // 0-欠费 1-不欠费
    private String arrears;
    //提醒金额 老系统后台写死的-1000, 这里去掉
//    private String txMoney;

    private String patientName;

    //地址
    private String address;
    //病案号
    private String medrcdNo;
    //实际费用
    private Integer inpActualTotalFee;
    //患者ID
    private String patientId;
    //交易类型 自费、重庆医保等
    private String insType;
    //就诊科室
    private String deptName;
    //主治医生
    private String doctorName;
    //入院日期
    private Date admissionDate;
    //出院日期
    private Date outDate;
    //入院诊断
    private String inDiseaseName;
    //出院诊断
    private String outDiseaseName;
    //类型 自费、医保
    private String feeType;

    /**
     * 医生预出院时间
     */
    private Date dPreoutDate;

    //病区
    private String wardName;
    private String wardCode;
    private String hosType;

    //单病种标志 如果为Y，则说明是单病种患者
    private String singleDisease;

    private Integer warnLevel;

    public PatientSheetInfo(String cbedNo) {
        this.cbedNo = cbedNo;
    }
}
