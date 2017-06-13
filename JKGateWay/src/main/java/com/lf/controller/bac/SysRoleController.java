package com.lf.controller.bac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lf.entity.Detail;
import com.lf.entity.SysRole;
import com.lf.entity.SysRoleMore;
import com.lf.entity.easyui.DataGrid;
import com.lf.service.daoservice.i.SysRoleService;
import com.lf.util.CommMethod;

@Controller
public class SysRoleController {

	@Autowired
	private SysRoleService  sysRoleService;
	
	
	
	@ResponseBody
	@RequestMapping(value="/getSysRoleAll.htm", method = RequestMethod.POST)
	public DataGrid getSysRoleAll(SysRoleMore sysRoleMore){
		DataGrid dg = new DataGrid();
		
		
		sysRoleMore.setPageInfo();
		List<SysRole> selectSysRolePage = sysRoleService.selectSysRolePage(sysRoleMore);
		dg.setTotal(sysRoleService.countByExample(new SysRoleMore()));
		dg.setRows(selectSysRolePage);
		return dg;
	}
	@ResponseBody
	@RequestMapping(value="/updateRoleRights.htm", method = RequestMethod.POST)
	public Detail updateRoleRights(String roleNo , String rights){
		
		SysRole sysRoleVal = new SysRole();
		sysRoleVal.setRights(rights);
		SysRoleMore sysRoleWhere = new SysRoleMore();
		sysRoleWhere.setRoleNo(roleNo);
		sysRoleWhere.setSerialid(roleNo);
		sysRoleService.updateByExample(sysRoleVal, sysRoleWhere);
		return CommMethod.success(null);
	}
}
