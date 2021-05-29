package com.ptg.purchase.console.dto.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author xch
 * @Date 2020/12/8 20:42
 * @Version 1.0
 **/
@Getter
@Setter
@ToString
public class EmailLoginReq {
    private String email;//邮箱
    private String password;//密码

}
