package com.lf.controller.bac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lf.entity.SysParms;
import com.lf.entity.SysParmsMore;
import com.lf.entity.easyui.DataGrid;
import com.lf.service.daoservice.i.SysParmsService;



/** 
* @Title: JKGateWay 
* @Description: TODO(这里用一句话描述这个方法的作用)   
* @author LiuFei
* @2017年6月2日 下午7:18:35
* @throws 
*/
@Controller
public class SysParmsConreoller {
	
	
	
	@Autowired
	private SysParmsService sysParmsService;
	
	
	@ResponseBody
	@RequestMapping(value="/searchSysParmsAll.htm" , method=RequestMethod.POST)
	public DataGrid searchSysParmsAll(SysParmsMore example){
		DataGrid dg= new DataGrid();
		List<SysParms> selectByExample = sysParmsService.selectByExample(example);
		dg.setTotal(selectByExample.size());
		dg.setRows(selectByExample);
		return dg;
	}

}
