package com.lf.service.daoservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lf.entity.SysParms;
import com.lf.entity.SysParmsMore;
import com.lf.entity.SysParmsMore.Criteria;
import com.lf.mapper.SysParmsMapper;
import com.lf.service.daoservice.i.SysParmsService;
import com.mysql.jdbc.StringUtils;




@Service
public class SysParmsServiceImpl  implements SysParmsService {
	
	
	@Autowired
	private SysParmsMapper sysParmsMapper;

	@Override
	public int countByExample(SysParmsMore example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(SysParmsMore example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(SysParms record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SysParms> selectByExample(SysParmsMore example) {
		
		SysParmsMore sysParmsMore = new SysParmsMore();
		Criteria createCriteria = sysParmsMore.createCriteria();
		if(!StringUtils.isNullOrEmpty(example.getSysKey())){
			createCriteria.andSysKeyEqualTo(example.getSysKey());
		}
		if(!StringUtils.isNullOrEmpty(example.getSysParentNo())){
			createCriteria.andSysParentNoEqualTo(example.getSysParentNo());
		}
		if(!StringUtils.isNullOrEmpty(example.getUseFlag())){
			createCriteria.andUseFlagEqualTo(example.getUseFlag());
		}
		return sysParmsMapper.selectByExample(example);
	}

	@Override
	public int updateByExample(SysParms record, SysParmsMore example) {
		// TODO Auto-generated method stub
		return 0;
	}
    

}