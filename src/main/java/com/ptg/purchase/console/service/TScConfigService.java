package com.ptg.purchase.console.service;

/**
 * @Author xch
 * @Date 2020/11/25 14:38
 * @Version 1.0
 **/
public interface TScConfigService {
    /**
     * 根据指定的key查询配置的value值
     * */
    String getValueByKey(String key);
}
