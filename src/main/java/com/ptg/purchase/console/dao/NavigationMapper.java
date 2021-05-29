package com.ptg.purchase.console.dao;


import com.ptg.purchase.console.dto.resp.Navigation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NavigationMapper {
    List<Navigation> getnavigationListByPId(@Param("pid") Integer pid);
    List<Navigation> getNavigationByPid();
}
