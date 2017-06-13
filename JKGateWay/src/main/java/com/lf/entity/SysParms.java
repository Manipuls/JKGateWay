package com.lf.entity;

import java.io.Serializable;

import com.lf.entity.easyui.PageUtil;

public class SysParms extends PageUtil implements Serializable {
    private String sysId;

    private String sysNo;

    private String sysKey;

    private String sysValue;

    private String sysDesc;

    private String sysKey1;

    private String sysValue1;

    private String sysDesc1;

    private String sysParentNo;

    private String sysSequ;

    private String createTime;

    private String updateTime;

    private String useFlag;

    private static final long serialVersionUID = 1L;

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId == null ? null : sysId.trim();
    }

    public String getSysNo() {
        return sysNo;
    }

    public void setSysNo(String sysNo) {
        this.sysNo = sysNo == null ? null : sysNo.trim();
    }

    public String getSysKey() {
        return sysKey;
    }

    public void setSysKey(String sysKey) {
        this.sysKey = sysKey == null ? null : sysKey.trim();
    }

    public String getSysValue() {
        return sysValue;
    }

    public void setSysValue(String sysValue) {
        this.sysValue = sysValue == null ? null : sysValue.trim();
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc == null ? null : sysDesc.trim();
    }

    public String getSysKey1() {
        return sysKey1;
    }

    public void setSysKey1(String sysKey1) {
        this.sysKey1 = sysKey1 == null ? null : sysKey1.trim();
    }

    public String getSysValue1() {
        return sysValue1;
    }

    public void setSysValue1(String sysValue1) {
        this.sysValue1 = sysValue1 == null ? null : sysValue1.trim();
    }

    public String getSysDesc1() {
        return sysDesc1;
    }

    public void setSysDesc1(String sysDesc1) {
        this.sysDesc1 = sysDesc1 == null ? null : sysDesc1.trim();
    }

    public String getSysParentNo() {
        return sysParentNo;
    }

    public void setSysParentNo(String sysParentNo) {
        this.sysParentNo = sysParentNo == null ? null : sysParentNo.trim();
    }

    public String getSysSequ() {
        return sysSequ;
    }

    public void setSysSequ(String sysSequ) {
        this.sysSequ = sysSequ == null ? null : sysSequ.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sysId=").append(sysId);
        sb.append(", sysNo=").append(sysNo);
        sb.append(", sysKey=").append(sysKey);
        sb.append(", sysValue=").append(sysValue);
        sb.append(", sysDesc=").append(sysDesc);
        sb.append(", sysKey1=").append(sysKey1);
        sb.append(", sysValue1=").append(sysValue1);
        sb.append(", sysDesc1=").append(sysDesc1);
        sb.append(", sysParentNo=").append(sysParentNo);
        sb.append(", sysSequ=").append(sysSequ);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}