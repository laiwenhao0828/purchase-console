package com.ptg.purchase.console.dao;

import com.ptg.purchase.console.dto.entity.TScConfig;
import com.ptg.purchase.console.dto.entity.TScConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TScConfigMapper {
    long countByExample(TScConfigExample example);

    int deleteByExample(TScConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TScConfig record);

    int insertSelective(TScConfig record);

    List<TScConfig> selectByExample(TScConfigExample example);

    TScConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TScConfig record, @Param("example") TScConfigExample example);

    int updateByExample(@Param("record") TScConfig record, @Param("example") TScConfigExample example);

    int updateByPrimaryKeySelective(TScConfig record);

    int updateByPrimaryKey(TScConfig record);
}