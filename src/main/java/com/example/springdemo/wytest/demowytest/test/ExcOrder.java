package com.example.springdemo.wytest.demowytest.test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Yestin
 * @description:
 * @date 2020/11/11 3:14 下午
 */
@Data
//@Builder
@Accessors(chain = true)
@NoArgsConstructor
public class ExcOrder implements Serializable {
    private String hosNum;
    private String nodeCode;
    private String wardNo;
    //性别
    private String gender;

    //医嘱序号
    private String orderSn;
    //todo 待定
    private String newOrderSn;
    //住院号
    private String inpNo;
    //医嘱编号
    private String orderNo;
    //收费类别 费别名称：自费、重庆医保、异地医保
    private String insType;
    //用药时间
    private Date useTime;
    private Date planExcTime;
    //发送科室编码
    private String sendDeptCode;
    //执行科室编码
    private String excDeptCode;
    //执行（职能）科室名称
    private String excDeptName;
    //病人姓名
    private String patientName;
    //病人年龄
    private String yearsOld;
    //病人Id
    private String patientId;
    //医嘱类型 1:长期医嘱，2:临时医嘱
    private String orderClass;
    //医嘱状态 1:新开,2:延续,3:取消,4:停止,5:退费
    private String orderFlag;
    //0:待复核,1:待执行,2:已执行
    private String orderAuditStatus;
    //病区
    private String wardName;
    //开嘱时间
    private Date orderTime;
    //医嘱名称（内容）
    private String orderName;
    //医嘱编号
    private String orderCode;
    //父医嘱编号
    private String porderNo;
    //组号 (group id) todo
    private String groupId;
    //医生嘱托
    private String doctorAdvice;
    //使用频次
    private String freq;
    //床号
    private String bedNo;
    //西药、中成药、中草药、卫生材料、检验、检查、嘱托、其他
    private String orderType;
    //药品一次剂量
    private BigDecimal medDoes;
    //药品一次剂量单位
    private String medDoesUnit;
    //用法
    private String medUseMethod;
    //给药方式
    private String wayName;
    //给药方式编码
    private String wayCode;
    //当日总量
    private String dayQty;
    //总量
    private String totalQty;
    //执行人(发送人)
    private String sendManName;
    //发送时间(执行时间)
    private Date sendTime;
    //滴速
    private String medFlowRate;
    //打印状态
    private String printStatus;
    //组药标记 first middle last
    private String groupMedFlag;

    private String orderAuditNo;

    public ExcOrder(String hosNum, String nodeCode) {
        this.hosNum = hosNum;
        this.nodeCode = nodeCode;
    }
}
