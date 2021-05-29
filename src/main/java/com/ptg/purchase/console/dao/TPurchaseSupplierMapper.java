package com.ptg.purchase.console.dao;

import com.ptg.purchase.console.dto.entity.TPurchaseSupplier;
import com.ptg.purchase.console.dto.entity.TPurchaseSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPurchaseSupplierMapper {
    long countByExample(TPurchaseSupplierExample example);

    int deleteByExample(TPurchaseSupplierExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPurchaseSupplier record);

    int insertSelective(TPurchaseSupplier record);

    List<TPurchaseSupplier> selectByExample(TPurchaseSupplierExample example);

    TPurchaseSupplier selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPurchaseSupplier record, @Param("example") TPurchaseSupplierExample example);

    int updateByExample(@Param("record") TPurchaseSupplier record, @Param("example") TPurchaseSupplierExample example);

    int updateByPrimaryKeySelective(TPurchaseSupplier record);

    int updateByPrimaryKey(TPurchaseSupplier record);
}