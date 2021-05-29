package com.ptg.purchase.console.controller;


import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ptg.purchase.console.dto.entity.TPurchaseSupplier;
import com.ptg.purchase.console.resp.PageResultInfo;
import com.ptg.purchase.console.resp.QueryWithdrawalAmountResponse;
import com.ptg.purchase.console.service.PurchaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.ptg.purchase.console.req.QueryPurchaseReq;
import com.ptg.purchase.console.resp.BaseResp;
import com.ptg.purchase.console.util.ServiceTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @Author xch
 * @Date 2020/11/25 15:17
 * @Version 1.0 采购供应商信息相关
 **/
@Slf4j
@Controller
@Api(value = "API - DemoController", description = "采购添加相关接口")
//@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @ApiOperation(value = "添加或者更新采购供应商信息", notes = "添加或者更新采购供应商信息")
    @RequestMapping(value = "/addPurchase_do",method = RequestMethod.POST)
    @ResponseBody
    public BaseResp addPurchase(@Valid @RequestBody TPurchaseSupplier tPurchaseSupplier, BindingResult bindingResult, HttpServletRequest request) {
        return ServiceTemplate.service(() -> {
            log.info("PurchaseController.addPurchase req");
            if (bindingResult.hasErrors()) {
                StringBuilder errorBuilder = new StringBuilder();
                bindingResult.getAllErrors().forEach((error -> errorBuilder.append("[").append(error.getDefaultMessage()).append("]")));
                return BaseResp.error(errorBuilder.toString());
            }
            purchaseService.addPurchase(tPurchaseSupplier);
            log.info("PurchaseController.addPurchase resp");
            return BaseResp.success("保存成功");
        });
    }

    /**
     * 列表
     */
    @ApiOperation(value = "查询采购供应商信息", notes = "查询采购供应商信息")
    @RequestMapping(value = "/queryPurchase_do",method = RequestMethod.POST)
    @ResponseBody
    public BaseResp queryPurchase(@RequestBody QueryPurchaseReq queryPurchaseReq,BindingResult bindingResult, HttpServletRequest request) {
        return ServiceTemplate.service(() -> {
            log.info("PurchaseController.queryPurchase queryPurchaseReq:" + queryPurchaseReq);
            if (bindingResult.hasErrors()) {
                StringBuilder errorBuilder = new StringBuilder();
                bindingResult.getAllErrors().forEach((error -> errorBuilder.append("[").append(error.getDefaultMessage()).append("]")));
                return BaseResp.error(errorBuilder.toString());
            }
            PageResultInfo<TPurchaseSupplier> tPurchaseSupplierPageResultInfo = purchaseService.queryPurchase(queryPurchaseReq);
            log.info("PurchaseController.queryPurchase resp:" + tPurchaseSupplierPageResultInfo);
            return BaseResp.success(tPurchaseSupplierPageResultInfo);
        });
    }

    /**
     * 明细查询
     */
    @ApiOperation(value = "查询采购供应商详细信息", notes = "查询采购供应商详细信息")
    @RequestMapping(value = "/queryPurchase_detail_do/{id}")
    @ResponseBody
    public BaseResp queryPurchaseDetail(@PathVariable Long id) {
        return ServiceTemplate.service(() -> {
            log.info("PurchaseController.queryPurchaseDetail id:" + id);
            TPurchaseSupplier tPurchaseSupplier = purchaseService.queryPurchaseById(id);
            log.info("PurchaseController.queryPurchaseDetail resp:" + tPurchaseSupplier);
            return BaseResp.success(tPurchaseSupplier);
        });
    }

    /**
     * 伪删除
     */
    @ApiOperation(value = "采购供应商信息伪删除", notes = "采购供应商信息伪删除")
    @RequestMapping(value = "/deletePurchase_do/{id}")
    @ResponseBody
    public void deletePurchase(@PathVariable Long id) {
        log.info("PurchaseController.deletePurchase id:" + id);
        purchaseService.deletePurchaseById(id);
        log.info("PurchaseController.deletePurchase resp:");
    }

    @RequestMapping("/addPurchase")
    public String addPurchaseView() {
        return "add_purchase";
    }

    @RequestMapping("/queryPurchaseView")
    public String queryPurchaseView() {
        return "query_Purchase";
    }

    @RequestMapping("/queryPurchaseDetailView/{id}")
    public String indexView(@PathVariable Long id) {
        return "query_purchase_detail";
    }
    @RequestMapping("/test001")
    public String test001() {
        Config config = ConfigService.getConfig("application.yml");
        String value = config.getProperty("", "");
        return "query_purchase_detail";
    }

    @ApiOperation(value = "查询可提现金额")
    @RequestMapping(value = "/queryWithdrawalAmount", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public QueryWithdrawalAmountResponse queryWithdrawalAmount(HttpServletRequest request) {
        log.info("LoanApplyController.queryWithdrawalAmount start>>>>>>>");
        QueryWithdrawalAmountResponse queryWithdrawalAmountResponse = new QueryWithdrawalAmountResponse();
        queryWithdrawalAmountResponse.setInterest("26.0");
        queryWithdrawalAmountResponse.setRate("0.62");
        queryWithdrawalAmountResponse.setUsageDays("14");
        return queryWithdrawalAmountResponse;

    }
}
