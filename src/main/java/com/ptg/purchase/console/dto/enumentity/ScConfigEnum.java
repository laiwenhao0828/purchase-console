package com.ptg.purchase.console.dto.enumentity;

/**
 * @Author xuconghui
 * @Date 2020/11/3 10:36
 * @Version 1.0
 **/

public enum ScConfigEnum {
    IP_WHITE_LIST("ip.white.list","127.0.0.1",",")
    ;
    private String key;
    private String defaultValue;
    private String separator;

    ScConfigEnum(String key, String defaultValue, String separator) {
        this.key = key;
        this.defaultValue = defaultValue;
        this.separator = separator;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }
}
