package com.ptg.purchase.console.dto.enumentity;

/**
 * @Author xch
 * @Date 2020/11/25 16:12
 * @Version 1.0
 **/
public enum ErrorEnum {
    IP_ERROR("IP_ERROR","该ip没有访问权限");
    private String errorType;
    private String errorDesc;

    ErrorEnum(String errorType, String errorDesc) {
        this.errorType = errorType;
        this.errorDesc = errorDesc;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }
}
