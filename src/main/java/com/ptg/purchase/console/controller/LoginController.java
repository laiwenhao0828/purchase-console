package com.ptg.purchase.console.controller;

import com.ptg.purchase.console.dto.entity.TPurchaseSupplier;
import com.ptg.purchase.console.resp.BaseResp;
import com.ptg.purchase.console.util.ServiceTemplate;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @Author xch
 * @Date 2020/12/8 20:36
 * @Version 1.0
 **/
@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    @ApiOperation(value = "邮箱注册", notes = "邮箱注册")
    @RequestMapping(value = "/email")
    @ResponseBody
    public BaseResp emailLogin(@Valid @RequestBody TPurchaseSupplier tPurchaseSupplier, BindingResult bindingResult) {
        return ServiceTemplate.service(() -> {
            log.info("LoginController.emailLogin req");

            log.info("LoginController.emailLogin resp");
            return BaseResp.success("保存成功");
        });
    }
}
