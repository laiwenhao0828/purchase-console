package com.ptg.purchase.console.dto.req;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author xch
 * @Date 2020/11/25 20:21
 * @Version 1.0
 **/
@Getter
@Setter
public class PageReq {
    private int page=1;
    private int pageSize=20;
}
