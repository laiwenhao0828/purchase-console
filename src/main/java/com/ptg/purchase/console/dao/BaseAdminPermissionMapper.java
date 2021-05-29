package com.ptg.purchase.console.dao;

import com.ptg.purchase.console.dto.entity.BaseAdminPermission;
import com.ptg.purchase.console.dto.entity.BaseAdminPermissionExample;
import java.util.List;

import com.ptg.purchase.console.dto.resp.Navigation;
import org.apache.ibatis.annotations.Param;

public interface BaseAdminPermissionMapper {
    long countByExample(BaseAdminPermissionExample example);

    int deleteByExample(BaseAdminPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseAdminPermission record);

    int insertSelective(BaseAdminPermission record);

    List<BaseAdminPermission> selectByExample(BaseAdminPermissionExample example);

    BaseAdminPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseAdminPermission record, @Param("example") BaseAdminPermissionExample example);

    int updateByExample(@Param("record") BaseAdminPermission record, @Param("example") BaseAdminPermissionExample example);

    int updateByPrimaryKeySelective(BaseAdminPermission record);

    int updateByPrimaryKey(BaseAdminPermission record);

    List<Navigation> getNavigationByPid();

    List<Navigation> getnavigationListByPId(Integer id);
}