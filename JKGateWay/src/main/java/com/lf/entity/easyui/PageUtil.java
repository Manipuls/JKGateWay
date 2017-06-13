package com.lf.entity.easyui;

public class PageUtil {
	
	private int page;
	private int rows;
	private int start;
	private int end;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public void setPageInfo() {
		if(page>0){
			setStart((page-1)*rows);
			setEnd(rows);
		}
	}
	
	
	
	
	

}
