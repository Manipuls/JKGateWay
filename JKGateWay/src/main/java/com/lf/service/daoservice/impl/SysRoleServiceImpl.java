package com.lf.service.daoservice.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lf.entity.SysRole;
import com.lf.entity.SysRoleMore;
import com.lf.entity.SysRoleMore.Criteria;
import com.lf.mapper.SysRoleMapper;
import com.lf.service.daoservice.i.SysRoleService;


@Service
public class SysRoleServiceImpl implements SysRoleService {

	
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Override
	public int countByExample(SysRoleMore example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(SysRoleMore example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(String serialid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(SysRole record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SysRole> selectByExample(SysRoleMore example) {
		
		
		SysRoleMore sysRoleMore = new SysRoleMore();
		
		
		
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysRole selectByPrimaryKey(String serialid) {
		return sysRoleMapper.selectByPrimaryKey(serialid);
	}

	@Override
	public int updateByExample(SysRole record, SysRoleMore example) {
		
		
		SysRoleMore  sysRoleMore= new SysRoleMore();
		Criteria createCriteria = sysRoleMore.createCriteria();
		
		if(!StringUtils.isEmpty(example.getRoleNo())){
			createCriteria.andRoleNoEqualTo(example.getRoleNo());
		}
		if(!StringUtils.isEmpty(example.getSerialid())){
			createCriteria.andSerialidEqualTo(example.getSerialid());
		}
		return sysRoleMapper.updateByExample(record, sysRoleMore);
	}

	@Override
	public List<SysRole> selectSysRolePage(SysRoleMore example) {
		Criteria createCriteria = example.createCriteria();
		if(!StringUtils.isEmpty(example.getRoleName())){
			createCriteria.andRoleNameLike("%"+example.getRoleName().replaceAll(" ", "")+"%");
		}
		return sysRoleMapper.selectByExample(example);
	}
	
}