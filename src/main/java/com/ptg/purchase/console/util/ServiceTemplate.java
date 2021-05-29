package com.ptg.purchase.console.util;



import com.ptg.purchase.console.exception.ServiceException;
import com.ptg.purchase.console.resp.BaseResp;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Supplier;


/**
 * @Author xuconghui
 * @Date 2020/10/15 15:25
 * @Version 1.0
 **/
@Slf4j
public class ServiceTemplate {

    public static <T> BaseResp<T> service(Supplier<BaseResp<T>> action){
        try {
            return action.get();
        } catch (ServiceException serviceException) {
            log.error("ServiceTemplate.service - dhpayServiceException ", serviceException.getMsg());
            return BaseResp.error(serviceException.getMsg());
        } catch (RuntimeException e) {
            log.error("ServiceTemplate.service - runtimException ", e);
            return BaseResp.error("runtimException");
        } catch (Exception e) {
            log.error("ServiceTemplate.service - exception ", e);
            return BaseResp.error("exception");
        } catch (Error e) {
            log.error("ServiceTemplate.service - error ", e);
            return BaseResp.error("error");
        }
    }
}
