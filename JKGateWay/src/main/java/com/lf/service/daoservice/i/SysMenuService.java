package com.lf.service.daoservice.i;

import com.lf.entity.SysMenu;
import com.lf.entity.SysMenuMore;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuService {
	
    int countByExample(SysMenuMore example);

    int deleteByExample(SysMenuMore example);

    int deleteByPrimaryKey(String serialid);

    int insert(SysMenu record);

    List<SysMenu> selectByExample(SysMenuMore example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuMore example);
    
    
    public List<SysMenu> selectSysMenuMorePage(SysMenuMore example);

}