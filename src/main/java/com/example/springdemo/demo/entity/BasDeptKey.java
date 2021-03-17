package com.example.springdemo.demo.entity;

public class BasDeptKey {
    private String hosnum;

    private String deptcode;

    public BasDeptKey(String hosnum, String deptcode) {
        this.hosnum = hosnum;
        this.deptcode = deptcode;
    }

    public BasDeptKey() {
        super();
    }

    public String getHosnum() {
        return hosnum;
    }

    public void setHosnum(String hosnum) {
        this.hosnum = hosnum == null ? null : hosnum.trim();
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }
}