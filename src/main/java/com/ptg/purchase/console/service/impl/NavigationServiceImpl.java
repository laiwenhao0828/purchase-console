package com.ptg.purchase.console.service.impl;

import com.ptg.purchase.console.dao.BaseAdminPermissionMapper;
import com.ptg.purchase.console.dto.resp.Navigation;
import com.ptg.purchase.console.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NavigationServiceImpl implements NavigationService {

    @Autowired
    BaseAdminPermissionMapper baseAdminPermissionMapper;

    public Map<String,Object> findMenu(){
        Map<String,Object> data = new HashMap<>();
        //按照pid获取到根目录进行存储对应的子目录
        List<Navigation> navId = baseAdminPermissionMapper.getNavigationByPid();
        for(Navigation nav : navId){
            List<Navigation> navigationListByPId = baseAdminPermissionMapper.getnavigationListByPId(nav.getId());
            nav.setChildrens(navigationListByPId);
        }
        data.put("menu",navId);
        return data;

    }

}
