package com.lf.entity;

import java.util.List;

import com.lf.entity.easyui.Attributes;

public class SysMenuTree extends SysMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id ; 
	private String text ; 
	private boolean checked = false; 
	private String state ;
	private Attributes attributes;
	private List<SysMenuTree> children ;
	
	
	

	public Attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	public List<SysMenuTree> getChildren() {
		return children;
	}
	public void setChildren(List<SysMenuTree> children) {
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
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	} 
}
