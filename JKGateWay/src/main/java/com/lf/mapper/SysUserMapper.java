package com.lf.mapper;

import com.lf.entity.SysUser;
import com.lf.entity.SysUserMore;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    int countByExample(SysUserMore example);

    int deleteByExample(SysUserMore example);

    int deleteByPrimaryKey(String serialid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserMore example);

    SysUser selectByPrimaryKey(String serialid);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserMore example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserMore example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}