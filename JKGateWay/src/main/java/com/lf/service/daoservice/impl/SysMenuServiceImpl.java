package com.lf.service.daoservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lf.entity.SysMenu;
import com.lf.entity.SysMenuMore;
import com.lf.entity.SysMenuMore.Criteria;
import com.lf.mapper.SysMenuMapper;
import com.lf.service.daoservice.i.SysMenuService;


@Service
public class  SysMenuServiceImpl implements SysMenuService {

	@Autowired
	private SysMenuMapper sysMenuMapper;
	
	@Override
	public int countByExample(SysMenuMore example) {
		return sysMenuMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysMenuMore example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String serialid) {
		return sysMenuMapper.deleteByPrimaryKey(serialid);
	}

	@Override
	public int insert(SysMenu record) {
		return sysMenuMapper.insert(record);
	}

	@Override
	public List<SysMenu> selectByExample(SysMenuMore example) {
		
		SysMenuMore sysMenuMore = new SysMenuMore();
		Criteria createCriteria = sysMenuMore.createCriteria();
		if(!StringUtils.isEmpty(example.getMenuNo())){
			createCriteria.andMenuNoEqualTo(example.getMenuNo());
		}
		if(!StringUtils.isEmpty(example.getMenuName())){
			createCriteria.andMenuNameEqualTo(example.getMenuName());
		}
		if(!StringUtils.isEmpty(example.getMenuParentNo())){
			createCriteria.andMenuParentNoEqualTo(example.getMenuParentNo());
		}
		return sysMenuMapper.selectByExample(sysMenuMore);
	}

	@Override
	public int updateByExample(SysMenu record, SysMenuMore example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SysMenu> selectSysMenuMorePage(SysMenuMore example) {
		
		
		Criteria createCriteria = example.createCriteria();
		
		if(!StringUtils.isEmpty(example.getUseFlag())){
			createCriteria.andUseFlagEqualTo(example.getUseFlag());
		}
		if(!StringUtils.isEmpty(example.getMenuName())){
			createCriteria.andMenuNameLike("%"+example.getMenuName().replaceAll(" ", "")+"%");
		}
		if(!StringUtils.isEmpty(example.getMenuUrl())){
			createCriteria.andMenuUrlLike("%"+example.getMenuUrl().replaceAll(" ","")+"%");
		}
		return sysMenuMapper.selectByExample(example);
	}

}