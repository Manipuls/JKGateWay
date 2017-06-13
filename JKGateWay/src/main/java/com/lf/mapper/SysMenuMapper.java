package com.lf.mapper;

import com.lf.entity.SysMenu;
import com.lf.entity.SysMenuMore;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    int countByExample(SysMenuMore example);

    int deleteByExample(SysMenuMore example);

    int deleteByPrimaryKey(String serialId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    List<SysMenu> selectByExample(SysMenuMore example);

    SysMenu selectByPrimaryKey(String serialId);

    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuMore example);

    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuMore example);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}