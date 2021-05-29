package com.ptg.purchase.console;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(basePackages = "com.ptg.purchase.console.dao")
@ComponentScan("com.ptg.purchase.console.*")
@EnableSwagger2
public class PurchaseConsoleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurchaseConsoleApplication.class, args);
    }

}
