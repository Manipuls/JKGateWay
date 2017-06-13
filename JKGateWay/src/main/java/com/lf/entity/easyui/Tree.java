package com.lf.entity.easyui;

import java.util.List;

public class Tree {
	
	private String id ; 
	private String text ; 
	private String checked ; 
	private String state ;
	private List<TreeChild> children;
	
	
	
	
	public List<TreeChild> getChildren() {
		return children;
	}
	public void setChildren(List<TreeChild> children) {
		this.children = children;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getChecked() {
		return checked;
	}
	public void setChecked(String checked) {
		this.checked = checked;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	} 

}
