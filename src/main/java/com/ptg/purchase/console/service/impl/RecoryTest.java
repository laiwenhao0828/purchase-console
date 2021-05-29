package com.ptg.purchase.console.service.impl;

import org.springframework.retry.RetryException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author xch
 * @Date 2020/12/17 18:27
 * @Version 1.0
 **/

@EnableRetry
@Component
public class RecoryTest {
    @Retryable(value = {RetryException.class},//指定发生的异常进行重试
            maxAttempts=4,                   //重试次数,默认即为3
            backoff = @Backoff(value = 2000))//每次重试延迟毫秒数
    public void retry () {
        System.out.println("retry start"+new Date());
        throw new RetryException("retry fail");

    }

}
