package com.ptg.purchase.console.dto.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@Builder
public class TError {
    private Long id;

    private String reqId;

    private String errorType;

    private String errorDesc;

    private Short delFlag;

    private String operater;

    private Date createDateTime;

    private Date updateTime;

}