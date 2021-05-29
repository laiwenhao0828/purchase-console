package com.ptg.purchase.console.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Author xuconghui
 * @Date 2020/10/23 13:45
 * @Version 1.0
 **/
@Data
public class QueryEsReq {
    @NotNull(message = "moudle参数为空")
    private String moudle;
    @NotEmpty(message = "timeRange参数为空")
    private String timeRange;
}
