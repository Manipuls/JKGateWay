package com.lf.entity;

import java.io.Serializable;

public class RecProduct implements Serializable {
    private String serialId;

    private String productTypeNo;

    private String productTypeName;

    private String productTypeImg;

    private String productNo;

    private String productName;

    private String productImg;

    private String reqUrl;

    private String markImg;

    private String useFlag;

    private String markDec;

    private static final long serialVersionUID = 1L;

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId == null ? null : serialId.trim();
    }

    public String getProductTypeNo() {
        return productTypeNo;
    }

    public void setProductTypeNo(String productTypeNo) {
        this.productTypeNo = productTypeNo == null ? null : productTypeNo.trim();
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName == null ? null : productTypeName.trim();
    }

    public String getProductTypeImg() {
        return productTypeImg;
    }

    public void setProductTypeImg(String productTypeImg) {
        this.productTypeImg = productTypeImg == null ? null : productTypeImg.trim();
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    public String getReqUrl() {
        return reqUrl;
    }

    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl == null ? null : reqUrl.trim();
    }

    public String getMarkImg() {
        return markImg;
    }

    public void setMarkImg(String markImg) {
        this.markImg = markImg == null ? null : markImg.trim();
    }

    public String getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(String useFlag) {
        this.useFlag = useFlag == null ? null : useFlag.trim();
    }

    public String getMarkDec() {
        return markDec;
    }

    public void setMarkDec(String markDec) {
        this.markDec = markDec == null ? null : markDec.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialId=").append(serialId);
        sb.append(", productTypeNo=").append(productTypeNo);
        sb.append(", productTypeName=").append(productTypeName);
        sb.append(", productTypeImg=").append(productTypeImg);
        sb.append(", productNo=").append(productNo);
        sb.append(", productName=").append(productName);
        sb.append(", productImg=").append(productImg);
        sb.append(", reqUrl=").append(reqUrl);
        sb.append(", markImg=").append(markImg);
        sb.append(", useFlag=").append(useFlag);
        sb.append(", markDec=").append(markDec);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}