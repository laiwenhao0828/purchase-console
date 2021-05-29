package com.ptg.purchase.console.dto.entity;

import java.util.Date;

public class TScConfig {
    private Long id;

    private String scKey;

    private String scValue;

    private Short delFlag;

    private String operater;

    private Date createDateTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScKey() {
        return scKey;
    }

    public void setScKey(String scKey) {
        this.scKey = scKey == null ? null : scKey.trim();
    }

    public String getScValue() {
        return scValue;
    }

    public void setScValue(String scValue) {
        this.scValue = scValue == null ? null : scValue.trim();
    }

    public Short getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Short delFlag) {
        this.delFlag = delFlag;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater == null ? null : operater.trim();
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}