package com.ptg.purchase.console.service;



import com.ptg.purchase.console.dto.entity.TPurchaseSupplier;
import com.ptg.purchase.console.req.QueryPurchaseReq;
import com.ptg.purchase.console.resp.PageResultInfo;

import java.util.List;

/**
 * @Author xch
 * @Date 2020/11/25 17:03
 * @Version 1.0
 **/
public interface PurchaseService {
    /**
     * 采购供应商信息入库
     * */
     void addPurchase(TPurchaseSupplier tPurchaseSupplier);
    /**
     * 查询采购供应商信息 列表
     * */
    PageResultInfo<TPurchaseSupplier> queryPurchase(QueryPurchaseReq queryPurchaseReq);
    /**
     * 根据id查询详细信息
     * */
    TPurchaseSupplier queryPurchaseById(Long id);
    /**
     * 根据id伪删除采购供应商数据
     * */
    void deletePurchaseById(Long id);
}
