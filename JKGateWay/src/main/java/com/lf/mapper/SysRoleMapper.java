package com.lf.mapper;

import com.lf.entity.SysRole;
import com.lf.entity.SysRoleMore;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    int countByExample(SysRoleMore example);

    int deleteByExample(SysRoleMore example);

    int deleteByPrimaryKey(String serialid);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleMore example);

    SysRole selectByPrimaryKey(String serialid);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleMore example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleMore example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}