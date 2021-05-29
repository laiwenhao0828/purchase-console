package com.ptg.purchase.console.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ptg.purchase.console.dao.TPurchaseSupplierMapper;
import com.ptg.purchase.console.dto.entity.TPurchaseSupplier;
import com.ptg.purchase.console.dto.entity.TPurchaseSupplierExample;
import com.ptg.purchase.console.service.PurchaseService;
import com.ptg.purchase.console.util.Constants;
import com.ptg.purchase.console.req.QueryPurchaseReq;
import com.ptg.purchase.console.resp.PageResultInfo;
import com.ptg.purchase.console.util.IdUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author xch
 * @Date 2020/11/25 17:03
 * @Version 1.0
 **/
@Service
public class PurchaseServiceImpl implements PurchaseService {
    private static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    @Autowired
    private TPurchaseSupplierMapper tPurchaseSupplierMapper;

    @Override
    public void addPurchase(TPurchaseSupplier tPurchaseSupplier) {
        if (null != tPurchaseSupplier.getId()) {
            TPurchaseSupplierExample tPurchaseSupplierExample = new TPurchaseSupplierExample();
            tPurchaseSupplierExample.createCriteria().andIdEqualTo(tPurchaseSupplier.getId());
            tPurchaseSupplierMapper.updateByExampleSelective(tPurchaseSupplier, tPurchaseSupplierExample);
        } else {
            tPurchaseSupplier.setPurchaseId(IdUtil.getReqByStr(Constants.PUCHASE_ID_START, 26, YYYYMMDDHHMMSS));
            tPurchaseSupplierMapper.insertSelective(tPurchaseSupplier);
        }
    }

    @Override
    public PageResultInfo<TPurchaseSupplier> queryPurchase(QueryPurchaseReq queryPurchaseReq) {
        PageHelper.startPage(Integer.parseInt(queryPurchaseReq.getPageIndex()), Integer.parseInt(queryPurchaseReq.getPageSize()));
        TPurchaseSupplierExample tPurchaseSupplierExample = new TPurchaseSupplierExample();
        TPurchaseSupplierExample.Criteria criteria = tPurchaseSupplierExample.createCriteria().andDelFlagEqualTo(Constants.DEL_FLAG_ABLE);
        if(StringUtils.isNotEmpty(queryPurchaseReq.getPurchaseName())){
            criteria.andPurchaseNameEqualTo(queryPurchaseReq.getPurchaseName());
        }
        if(StringUtils.isNotEmpty(queryPurchaseReq.getPurchaseContactName())){
            criteria.andPurchaseContactNameEqualTo(queryPurchaseReq.getPurchaseContactName());
        }
        List<TPurchaseSupplier> tPurchaseSupplierList = tPurchaseSupplierMapper.selectByExample(tPurchaseSupplierExample);
        PageInfo<TPurchaseSupplier> pageInfo = new PageInfo<TPurchaseSupplier>(tPurchaseSupplierList);
        PageResultInfo<TPurchaseSupplier> pageResultInfo = new PageResultInfo<TPurchaseSupplier>();
        pageResultInfo.setRows(pageInfo.getList());
        pageResultInfo.setTotal(pageInfo.getTotal());
        return pageResultInfo;
    }

    @Override
    public TPurchaseSupplier queryPurchaseById(Long id) {
        TPurchaseSupplierExample tPurchaseSupplierExample = new TPurchaseSupplierExample();
        tPurchaseSupplierExample.createCriteria().andIdEqualTo(id).andDelFlagEqualTo(Constants.DEL_FLAG_ABLE);
        return tPurchaseSupplierMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deletePurchaseById(Long id) {
        TPurchaseSupplier tPurchaseSupplier = new TPurchaseSupplier();
        tPurchaseSupplier.setId(id);
        tPurchaseSupplier.setDelFlag(new Short("1"));
        tPurchaseSupplierMapper.updateByPrimaryKeySelective(tPurchaseSupplier);
    }
}
