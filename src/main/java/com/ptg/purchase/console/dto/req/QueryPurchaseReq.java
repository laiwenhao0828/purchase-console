package com.ptg.purchase.console.dto.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @Author xch
 * @Date 2020/11/25 20:26
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
public class QueryPurchaseReq extends PageReq{
    @NotNull(message = "id为空")
    private Long id;
}
