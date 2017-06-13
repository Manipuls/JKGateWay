package com.lf.controller.bac;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lf.entity.SysMenu;
import com.lf.entity.SysMenuMore;
import com.lf.entity.SysMenuTree;
import com.lf.entity.SysRole;
import com.lf.entity.easyui.Attributes;
import com.lf.entity.easyui.DataGrid;
import com.lf.service.daoservice.i.SysMenuService;
import com.lf.service.daoservice.i.SysRoleService;

/**
 * @author Administrator
 *
 */

@Controller
public class SysMenuConreoller {
	
	@Autowired
	private SysMenuService sysMenuService;
	@Autowired
	private SysRoleService sysRoleService;
	
	
	@ResponseBody
	@RequestMapping(value="/searchSysMenuAll.htm" , method=RequestMethod.POST)
	public DataGrid searchSysMenuAll(SysMenuMore sysMenuMore){
		DataGrid dg = new DataGrid();
		sysMenuMore.setPageInfo();
		List<SysMenu> selectByExample = sysMenuService.selectSysMenuMorePage(sysMenuMore);
//		dg.setTotal(sysMenuService.countByExample(new SysMenuMore()));
		int size = 0;
		if(selectByExample!=null){
			size = selectByExample.size();
		}
		dg.setTotal(size);
		dg.setRows(selectByExample);
		return dg;
	}
	
	@ResponseBody
	@RequestMapping(value="/selectNavMenuTree.htm" , method=RequestMethod.POST)
	public List<SysMenuTree> selectNavMenuTree(@RequestParam(required=false) String roleNo){
		
		List<SysMenuTree> navMenu = new ArrayList<SysMenuTree>();
		List<SysMenuTree> childMenu = new ArrayList<SysMenuTree>();
		
		//查询角色权限
		SysRole selectByPrimaryKey = sysRoleService.selectByPrimaryKey(roleNo);
		//查询全部权限
		List<SysMenu> selectByExample = sysMenuService.selectByExample(new SysMenuMore());
		
		if(selectByExample!=null && selectByExample.size()>0 && selectByPrimaryKey!=null &&  !StringUtils.isEmpty(selectByPrimaryKey.getRights())){
			String userRights = selectByPrimaryKey.getRights();
			
			//过滤出父级/子类全部权限
			if(userRights.contains("@")){
				String[] split = userRights.split("\\@");
				for (String str : split) {
					String parentNo = str.split("\\-")[0];
					for (SysMenu menu : selectByExample) {
						if(parentNo.equals(menu.getMenuNo())){
							navMenu.add(SysMenuToTree(menu));
						}
					}
					String[] childArr = str.split("\\-")[1].split("\\,");
					for (String string : childArr) {
						for (SysMenu menu : selectByExample) {
							if(string.equals(menu.getMenuNo())){
								childMenu.add(SysMenuToTree(menu));
							}
						}
					}
					
				}
			}else{
				String parentNo = userRights.split("\\-")[0];
				for (SysMenu menu : selectByExample) {
					if(parentNo.equals(menu.getMenuNo())){
						navMenu.add(SysMenuToTree(menu));
					}
				}
				String[] childArr = userRights.split("\\-")[1].split("\\,");
				for (String string : childArr) {
					for (SysMenu menu : selectByExample) {
						if(string.equals(menu.getMenuNo())){
							childMenu.add(SysMenuToTree(menu));
						}
					}
				}
			}
			
			for (SysMenuTree parentMenuTree : navMenu) {
				List<SysMenuTree> childMenuEr = new ArrayList<SysMenuTree>();
				for (SysMenuTree childMenuTree : childMenu) {
					if(parentMenuTree.getMenuNo().equals(childMenuTree.getMenuParentNo())){
						childMenuEr.add(childMenuTree);
					}
				}
				parentMenuTree.setChildren(childMenuEr);
			}
		}			
		return navMenu;
		
	}

	private SysMenuTree SysMenuToTree(SysMenu menu) {
		SysMenuTree  sysMenuParent = new SysMenuTree();
		sysMenuParent.setMenuNo(menu.getMenuNo());
		sysMenuParent.setMenuName(menu.getMenuName());
		sysMenuParent.setText(menu.getMenuName());
		sysMenuParent.setMenuParentNo(menu.getMenuParentNo());
		sysMenuParent.setMenuUrl(menu.getMenuUrl());
		if(!StringUtils.isEmpty(menu.getMenuUrl())){
			Attributes attributes = new Attributes();
			attributes.setUrl(menu.getMenuUrl());
			sysMenuParent.setAttributes(attributes);
		}
		
		return  sysMenuParent;
	}
	
	
	
	/**
	 * 角色权限管理
	 * @param roleNo
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/selectSysMenuTree.htm" , method=RequestMethod.POST)
	public List<SysMenuTree> selectSysMenuTree(@RequestParam(required=false) String roleNo){
		//查询全部权限
		List<SysMenu> selectByExample = sysMenuService.selectByExample(new SysMenuMore());
		//查询角色权限
		SysRole selectByPrimaryKey = sysRoleService.selectByPrimaryKey(roleNo);
		
		List<SysMenuTree> parentMenu = new ArrayList<SysMenuTree>();
		
		
		if(selectByExample!=null && selectByExample.size()>0){
			for (SysMenu sysMenu : selectByExample) {
				if(StringUtils.isEmpty(sysMenu.getMenuParentNo())){
					SysMenuTree  sysMenuParent = new SysMenuTree();
					sysMenuParent.setState("open");
					sysMenuParent.setMenuNo(sysMenu.getMenuNo());
					sysMenuParent.setMenuName(sysMenu.getMenuName());
					sysMenuParent.setText(sysMenu.getMenuName());
					parentMenu.add(sysMenuParent);
				}
			}
			
			for (SysMenuTree sysMenuTree : parentMenu) {
				List<SysMenuTree> childMenu = new ArrayList<SysMenuTree>();
				
				for (SysMenu sysMenu : selectByExample) {
					if(sysMenuTree.getMenuNo().equals(sysMenu.getMenuParentNo())){
						SysMenuTree  sysMenuChild = new SysMenuTree();
						sysMenuChild.setMenuNo(sysMenu.getMenuNo());
						sysMenuChild.setMenuName(sysMenu.getMenuName());
						sysMenuChild.setText(sysMenu.getMenuName());
						
						if(selectByPrimaryKey!=null){
							
							if((!StringUtils.isEmpty(selectByPrimaryKey.getRights())) && selectByPrimaryKey.getRights().contains("-")){
								String[] split = selectByPrimaryKey.getRights().split("\\,");
								String rights = selectByPrimaryKey.getRights();
								if(rights.contains("@")){
									String[] split2 = rights.split("@");
									for (String string : split2) {
										String[] split3 = string.split("\\-")[1].split("\\,");
										for (int i = 0; i < split3.length; i++) {
											if(sysMenu.getMenuNo().equals(split3[i])){
												sysMenuChild.setChecked(true);
											}
										}
									}
								}else{
									String[] split3 = rights.split("\\-")[1].split("\\,");
									for (int i = 0; i < split3.length; i++) {
										if(sysMenu.getMenuNo().equals(split3[i])){
											sysMenuChild.setChecked(true);
										}
									}
								}
								/*for (int i = 0; i < split.length; i++) {
									if(sysMenu.getMenuNo().equals(split[i])){
										sysMenuChild.setChecked(true);
									}
								}*/
							}
						}
						childMenu.add(sysMenuChild);
					}
				}	
				sysMenuTree.setChildren(childMenu);
			}
		}
		return parentMenu;
		
	}
	
	
	
	public String updateUserRights(){
		return null;
	}
	
	

}
