package com.ptg.purchase.console.service.impl;


import com.ptg.purchase.console.dao.TScConfigMapper;
import com.ptg.purchase.console.dto.entity.TScConfig;
import com.ptg.purchase.console.dto.entity.TScConfigExample;
import com.ptg.purchase.console.service.TScConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xch
 * @Date 2020/11/25 14:38
 * @Version 1.0
 **/
@Service
public class TScConfigServiceImpl implements TScConfigService {
    @Autowired
    private TScConfigMapper tScConfigMapper;
    @Override
    public String getValueByKey(String key) {
        TScConfigExample tScConfigExample = new TScConfigExample();
        tScConfigExample.createCriteria().andScKeyEqualTo(key);
        List<TScConfig> tScConfigs = tScConfigMapper.selectByExample(tScConfigExample);
        if(null==tScConfigs||tScConfigs.size()==0){
            return "";
        }
        return tScConfigs.get(0).getScValue();
    }
}
