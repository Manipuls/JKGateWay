package com.lf.entity;

public class Detail {
	
	
	private String code;
	private String msg;
	
	
	public Detail(String code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Detail [code=" + code + ", msg=" + msg + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

}
