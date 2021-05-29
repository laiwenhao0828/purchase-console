package com.ptg.purchase.console.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xch
 * @Date 2020/11/25 16:37
 * @Version 1.0
 **/
@Component
@ConfigurationProperties(prefix = "path")
@Getter
@Setter
public class PathConfig {
    private List<String> include = new ArrayList<>();

    private List<String> exclude = new ArrayList<>();


}
