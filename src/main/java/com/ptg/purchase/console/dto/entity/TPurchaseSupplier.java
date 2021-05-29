package com.ptg.purchase.console.dto.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Setter
@Getter
@ToString
public class TPurchaseSupplier {
    private Long id;

    private String purchaseId;

    private String purchaseName;

    private String purchaseContactName;

    private String purchaseContactPhone;

    private String purchaseDiscount;

    private String purchaseAddress;

    private String purchaseRegisterTime;

    private String purchaseRegisterCapital;

    private String purchaseNatureBusiness;

    private String purchaseOwnershipType;

    private String purchaseBusinessType;

    private String purchaseBusinessLocal;

    private String purchaseBusinessIndex;

    private String purchaseStaffNumber;

    private String purchaseLeader;

    private String purchaseOrganization;

    private String purchaseDevelopmentHis;

    private String purchaseFinancialSituation;

    private String purchaseFixedFacilities;

    private String purchaseAsssts;

    private String purchaseSenseOfWorth;

    private String purchaseCorporateCulture;

    private String purchaseDesc;

    private Short delFlag;

    private String operater;

    private Date createDateTime;

    private Date updateTime;

}