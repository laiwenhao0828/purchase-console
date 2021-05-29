package com.ptg.purchase.console.dao;

import com.ptg.purchase.console.dto.entity.TError;
import com.ptg.purchase.console.dto.entity.TErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TErrorMapper {
    long countByExample(TErrorExample example);

    int deleteByExample(TErrorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TError record);

    int insertSelective(TError record);

    List<TError> selectByExample(TErrorExample example);

    TError selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TError record, @Param("example") TErrorExample example);

    int updateByExample(@Param("record") TError record, @Param("example") TErrorExample example);

    int updateByPrimaryKeySelective(TError record);

    int updateByPrimaryKey(TError record);
}