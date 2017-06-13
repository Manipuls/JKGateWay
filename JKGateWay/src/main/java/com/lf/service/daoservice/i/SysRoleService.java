package com.lf.service.daoservice.i;

import com.lf.entity.SysRole;
import com.lf.entity.SysRoleMore;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleService {
    int countByExample(SysRoleMore example);

    int deleteByExample(SysRoleMore example);

    int deleteByPrimaryKey(String serialid);

    int insert(SysRole record);


    List<SysRole> selectByExample(SysRoleMore example);

    SysRole selectByPrimaryKey(String serialid);


    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleMore example);
    
    List<SysRole> selectSysRolePage(SysRoleMore example);
}