package com.ptg.purchase.console.config;


import com.ptg.purchase.console.dao.TErrorMapper;
import com.ptg.purchase.console.interceptor.WhiteListInterceptor;
import com.ptg.purchase.console.service.TScConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author xch
 * @Date 2020/11/25 16:40
 * @Version 1.0
 **/
@Configuration
public class WhiteListAdapter implements WebMvcConfigurer {
    @Autowired
    private PathConfig pathConfig;
    @Autowired
    private TScConfigService tScConfigService;
    @Autowired
    private TErrorMapper tErrorMapper;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        InterceptorRegistration ir = registry.addInterceptor(new WhiteListInterceptor(tScConfigService,tErrorMapper));
        // 拦截
        ir.addPathPatterns(pathConfig.getInclude());
        // 配置不拦截
        ir.excludePathPatterns(pathConfig.getExclude());
    }

}
