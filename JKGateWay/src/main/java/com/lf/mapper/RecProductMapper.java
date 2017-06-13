package com.lf.mapper;

import com.lf.entity.RecProduct;
import com.lf.entity.RecProductMore;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecProductMapper {
    int countByExample(RecProductMore example);

    int deleteByExample(RecProductMore example);

    int deleteByPrimaryKey(String serialId);

    int insert(RecProduct record);

    int insertSelective(RecProduct record);

    List<RecProduct> selectByExampleWithBLOBs(RecProductMore example);

    List<RecProduct> selectByExample(RecProductMore example);

    RecProduct selectByPrimaryKey(String serialId);

    int updateByExampleSelective(@Param("record") RecProduct record, @Param("example") RecProductMore example);

    int updateByExampleWithBLOBs(@Param("record") RecProduct record, @Param("example") RecProductMore example);

    int updateByExample(@Param("record") RecProduct record, @Param("example") RecProductMore example);

    int updateByPrimaryKeySelective(RecProduct record);

    int updateByPrimaryKeyWithBLOBs(RecProduct record);

    int updateByPrimaryKey(RecProduct record);
}