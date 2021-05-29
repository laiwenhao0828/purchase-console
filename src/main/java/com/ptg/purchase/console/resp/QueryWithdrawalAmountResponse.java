package com.ptg.purchase.console.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @Author xch
 * @Date 2020/12/16 10:00
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
public class QueryWithdrawalAmountResponse{

    @ApiModelProperty(value = "参考汇率",position = 2)
    private String rate;
    @ApiModelProperty(value = "利息",position = 3)
    private String interest;
    @ApiModelProperty(value = "使用天数",position = 1)
    private String usageDays;

}
