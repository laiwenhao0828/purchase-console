package com.ptg.purchase.console.interceptor;


import com.ptg.purchase.console.dao.TErrorMapper;
import com.ptg.purchase.console.dto.entity.TError;
import com.ptg.purchase.console.dto.enumentity.ErrorEnum;
import com.ptg.purchase.console.dto.enumentity.ScConfigEnum;
import com.ptg.purchase.console.service.TScConfigService;
import com.ptg.purchase.console.util.IPUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * @Author xch
 * @Date 2020/11/25 16:28
 * @Version 1.0
 **/
@Slf4j
public class WhiteListInterceptor implements HandlerInterceptor {
    @Autowired
    private TScConfigService tScConfigService;
    @Autowired
    private TErrorMapper tErrorMapper;

    public WhiteListInterceptor(TScConfigService tScConfigService, TErrorMapper tErrorMapper) {
        this.tScConfigService = tScConfigService;
        this.tErrorMapper = tErrorMapper;
    }

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String ip = IPUtil.getRemoteIP(request);
        String[] scConfigByKey = getScConfigByKey(ScConfigEnum.IP_WHITE_LIST.getKey(), ScConfigEnum.IP_WHITE_LIST.getSeparator(), ScConfigEnum.IP_WHITE_LIST.getDefaultValue());
        boolean isContainIp = Arrays.stream(scConfigByKey).anyMatch(s -> s.equals(ip));
        if (!isContainIp) {
            tErrorMapper.insertSelective(buildTError(ip));
            log.info("WhitelistVerifyInterceptor.doBefore 该ip没有访问权限>>>>");
            return false;
        }
        return true;
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
//         System.out.println("执行了TestInterceptor的postHandle方法");
    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //        System.out.println("执行了TestInterceptor的afterCompletion方法");
    }

    private TError buildTError(String ip) {
        TError tError = TError.builder().reqId(ip).errorType(ErrorEnum.IP_ERROR.getErrorType()).errorDesc(ErrorEnum.IP_ERROR.getErrorDesc()).build();
        return tError;
    }

    private String[] getScConfigByKey(String key, String separator, String defaultValue) {
        String[] valueArray = {defaultValue};
        String ipWhiteList = tScConfigService.getValueByKey(key);
        if (null != ipWhiteList && StringUtils.isNotEmpty(ipWhiteList)) {
            return ipWhiteList.split(separator);
        } else {
            return valueArray;
        }
    }
}
