package com.lf.service.daoservice.i;

import com.lf.entity.SysParms;
import com.lf.entity.SysParmsMore;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysParmsService {
    int countByExample(SysParmsMore example);

    int deleteByExample(SysParmsMore example);


    int insert(SysParms record);


    List<SysParms> selectByExample(SysParmsMore example);



    int updateByExample(@Param("record") SysParms record, @Param("example") SysParmsMore example);

}