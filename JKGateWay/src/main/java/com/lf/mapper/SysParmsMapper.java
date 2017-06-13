package com.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lf.entity.SysParms;
import com.lf.entity.SysParmsMore;

public interface SysParmsMapper {
    int countByExample(SysParmsMore example);

    int deleteByExample(SysParmsMore example);

    int deleteByPrimaryKey(String sysId);

    int insert(SysParms record);

    int insertSelective(SysParms record);

    List<SysParms> selectByExample(SysParmsMore example);

    SysParms selectByPrimaryKey(String sysId);

    int updateByExampleSelective(@Param("record") SysParms record, @Param("example") SysParmsMore example);

    int updateByExample(@Param("record") SysParms record, @Param("example") SysParmsMore example);

    int updateByPrimaryKeySelective(SysParms record);

    int updateByPrimaryKey(SysParms record);
}