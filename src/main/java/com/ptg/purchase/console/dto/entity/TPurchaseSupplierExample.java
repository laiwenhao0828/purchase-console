package com.ptg.purchase.console.dto.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPurchaseSupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPurchaseSupplierExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNull() {
            addCriterion("PURCHASE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIsNotNull() {
            addCriterion("PURCHASE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdEqualTo(String value) {
            addCriterion("PURCHASE_ID =", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotEqualTo(String value) {
            addCriterion("PURCHASE_ID <>", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThan(String value) {
            addCriterion("PURCHASE_ID >", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ID >=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThan(String value) {
            addCriterion("PURCHASE_ID <", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ID <=", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdLike(String value) {
            addCriterion("PURCHASE_ID like", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotLike(String value) {
            addCriterion("PURCHASE_ID not like", value, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdIn(List<String> values) {
            addCriterion("PURCHASE_ID in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotIn(List<String> values) {
            addCriterion("PURCHASE_ID not in", values, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdBetween(String value1, String value2) {
            addCriterion("PURCHASE_ID between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseIdNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ID not between", value1, value2, "purchaseId");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIsNull() {
            addCriterion("PURCHASE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIsNotNull() {
            addCriterion("PURCHASE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameEqualTo(String value) {
            addCriterion("PURCHASE_NAME =", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotEqualTo(String value) {
            addCriterion("PURCHASE_NAME <>", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameGreaterThan(String value) {
            addCriterion("PURCHASE_NAME >", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NAME >=", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameLessThan(String value) {
            addCriterion("PURCHASE_NAME <", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NAME <=", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameLike(String value) {
            addCriterion("PURCHASE_NAME like", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotLike(String value) {
            addCriterion("PURCHASE_NAME not like", value, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameIn(List<String> values) {
            addCriterion("PURCHASE_NAME in", values, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotIn(List<String> values) {
            addCriterion("PURCHASE_NAME not in", values, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameBetween(String value1, String value2) {
            addCriterion("PURCHASE_NAME between", value1, value2, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseNameNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_NAME not between", value1, value2, "purchaseName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameIsNull() {
            addCriterion("PURCHASE_CONTACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameIsNotNull() {
            addCriterion("PURCHASE_CONTACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_NAME =", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameNotEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_NAME <>", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameGreaterThan(String value) {
            addCriterion("PURCHASE_CONTACT_NAME >", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_NAME >=", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameLessThan(String value) {
            addCriterion("PURCHASE_CONTACT_NAME <", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_NAME <=", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameLike(String value) {
            addCriterion("PURCHASE_CONTACT_NAME like", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameNotLike(String value) {
            addCriterion("PURCHASE_CONTACT_NAME not like", value, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameIn(List<String> values) {
            addCriterion("PURCHASE_CONTACT_NAME in", values, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameNotIn(List<String> values) {
            addCriterion("PURCHASE_CONTACT_NAME not in", values, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameBetween(String value1, String value2) {
            addCriterion("PURCHASE_CONTACT_NAME between", value1, value2, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactNameNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_CONTACT_NAME not between", value1, value2, "purchaseContactName");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneIsNull() {
            addCriterion("PURCHASE_CONTACT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneIsNotNull() {
            addCriterion("PURCHASE_CONTACT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE =", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneNotEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE <>", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneGreaterThan(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE >", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE >=", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneLessThan(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE <", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE <=", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneLike(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE like", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneNotLike(String value) {
            addCriterion("PURCHASE_CONTACT_PHONE not like", value, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneIn(List<String> values) {
            addCriterion("PURCHASE_CONTACT_PHONE in", values, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneNotIn(List<String> values) {
            addCriterion("PURCHASE_CONTACT_PHONE not in", values, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneBetween(String value1, String value2) {
            addCriterion("PURCHASE_CONTACT_PHONE between", value1, value2, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseContactPhoneNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_CONTACT_PHONE not between", value1, value2, "purchaseContactPhone");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountIsNull() {
            addCriterion("PURCHASE_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountIsNotNull() {
            addCriterion("PURCHASE_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountEqualTo(String value) {
            addCriterion("PURCHASE_DISCOUNT =", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountNotEqualTo(String value) {
            addCriterion("PURCHASE_DISCOUNT <>", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountGreaterThan(String value) {
            addCriterion("PURCHASE_DISCOUNT >", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DISCOUNT >=", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountLessThan(String value) {
            addCriterion("PURCHASE_DISCOUNT <", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DISCOUNT <=", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountLike(String value) {
            addCriterion("PURCHASE_DISCOUNT like", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountNotLike(String value) {
            addCriterion("PURCHASE_DISCOUNT not like", value, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountIn(List<String> values) {
            addCriterion("PURCHASE_DISCOUNT in", values, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountNotIn(List<String> values) {
            addCriterion("PURCHASE_DISCOUNT not in", values, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountBetween(String value1, String value2) {
            addCriterion("PURCHASE_DISCOUNT between", value1, value2, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseDiscountNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_DISCOUNT not between", value1, value2, "purchaseDiscount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressIsNull() {
            addCriterion("PURCHASE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressIsNotNull() {
            addCriterion("PURCHASE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressEqualTo(String value) {
            addCriterion("PURCHASE_ADDRESS =", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressNotEqualTo(String value) {
            addCriterion("PURCHASE_ADDRESS <>", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressGreaterThan(String value) {
            addCriterion("PURCHASE_ADDRESS >", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ADDRESS >=", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressLessThan(String value) {
            addCriterion("PURCHASE_ADDRESS <", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ADDRESS <=", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressLike(String value) {
            addCriterion("PURCHASE_ADDRESS like", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressNotLike(String value) {
            addCriterion("PURCHASE_ADDRESS not like", value, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressIn(List<String> values) {
            addCriterion("PURCHASE_ADDRESS in", values, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressNotIn(List<String> values) {
            addCriterion("PURCHASE_ADDRESS not in", values, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressBetween(String value1, String value2) {
            addCriterion("PURCHASE_ADDRESS between", value1, value2, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseAddressNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ADDRESS not between", value1, value2, "purchaseAddress");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeIsNull() {
            addCriterion("PURCHASE_REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeIsNotNull() {
            addCriterion("PURCHASE_REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_TIME =", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeNotEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_TIME <>", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeGreaterThan(String value) {
            addCriterion("PURCHASE_REGISTER_TIME >", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_TIME >=", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeLessThan(String value) {
            addCriterion("PURCHASE_REGISTER_TIME <", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_TIME <=", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeLike(String value) {
            addCriterion("PURCHASE_REGISTER_TIME like", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeNotLike(String value) {
            addCriterion("PURCHASE_REGISTER_TIME not like", value, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeIn(List<String> values) {
            addCriterion("PURCHASE_REGISTER_TIME in", values, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeNotIn(List<String> values) {
            addCriterion("PURCHASE_REGISTER_TIME not in", values, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeBetween(String value1, String value2) {
            addCriterion("PURCHASE_REGISTER_TIME between", value1, value2, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_REGISTER_TIME not between", value1, value2, "purchaseRegisterTime");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalIsNull() {
            addCriterion("PURCHASE_REGISTER_CAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalIsNotNull() {
            addCriterion("PURCHASE_REGISTER_CAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL =", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalNotEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL <>", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalGreaterThan(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL >", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL >=", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalLessThan(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL <", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL <=", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalLike(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL like", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalNotLike(String value) {
            addCriterion("PURCHASE_REGISTER_CAPITAL not like", value, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalIn(List<String> values) {
            addCriterion("PURCHASE_REGISTER_CAPITAL in", values, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalNotIn(List<String> values) {
            addCriterion("PURCHASE_REGISTER_CAPITAL not in", values, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalBetween(String value1, String value2) {
            addCriterion("PURCHASE_REGISTER_CAPITAL between", value1, value2, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseRegisterCapitalNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_REGISTER_CAPITAL not between", value1, value2, "purchaseRegisterCapital");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessIsNull() {
            addCriterion("PURCHASE_NATURE_BUSINESS is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessIsNotNull() {
            addCriterion("PURCHASE_NATURE_BUSINESS is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessEqualTo(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS =", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessNotEqualTo(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS <>", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessGreaterThan(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS >", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS >=", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessLessThan(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS <", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS <=", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessLike(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS like", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessNotLike(String value) {
            addCriterion("PURCHASE_NATURE_BUSINESS not like", value, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessIn(List<String> values) {
            addCriterion("PURCHASE_NATURE_BUSINESS in", values, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessNotIn(List<String> values) {
            addCriterion("PURCHASE_NATURE_BUSINESS not in", values, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessBetween(String value1, String value2) {
            addCriterion("PURCHASE_NATURE_BUSINESS between", value1, value2, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseNatureBusinessNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_NATURE_BUSINESS not between", value1, value2, "purchaseNatureBusiness");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeIsNull() {
            addCriterion("PURCHASE_OWNERSHIP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeIsNotNull() {
            addCriterion("PURCHASE_OWNERSHIP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeEqualTo(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE =", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeNotEqualTo(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE <>", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeGreaterThan(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE >", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE >=", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeLessThan(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE <", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE <=", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeLike(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE like", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeNotLike(String value) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE not like", value, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeIn(List<String> values) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE in", values, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeNotIn(List<String> values) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE not in", values, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeBetween(String value1, String value2) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE between", value1, value2, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseOwnershipTypeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_OWNERSHIP_TYPE not between", value1, value2, "purchaseOwnershipType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeIsNull() {
            addCriterion("PURCHASE_BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeIsNotNull() {
            addCriterion("PURCHASE_BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE =", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeNotEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE <>", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeGreaterThan(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE >", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE >=", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeLessThan(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE <", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE <=", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeLike(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE like", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeNotLike(String value) {
            addCriterion("PURCHASE_BUSINESS_TYPE not like", value, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeIn(List<String> values) {
            addCriterion("PURCHASE_BUSINESS_TYPE in", values, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeNotIn(List<String> values) {
            addCriterion("PURCHASE_BUSINESS_TYPE not in", values, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeBetween(String value1, String value2) {
            addCriterion("PURCHASE_BUSINESS_TYPE between", value1, value2, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_BUSINESS_TYPE not between", value1, value2, "purchaseBusinessType");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalIsNull() {
            addCriterion("PURCHASE_BUSINESS_LOCAL is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalIsNotNull() {
            addCriterion("PURCHASE_BUSINESS_LOCAL is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL =", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalNotEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL <>", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalGreaterThan(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL >", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL >=", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalLessThan(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL <", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL <=", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalLike(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL like", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalNotLike(String value) {
            addCriterion("PURCHASE_BUSINESS_LOCAL not like", value, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalIn(List<String> values) {
            addCriterion("PURCHASE_BUSINESS_LOCAL in", values, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalNotIn(List<String> values) {
            addCriterion("PURCHASE_BUSINESS_LOCAL not in", values, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalBetween(String value1, String value2) {
            addCriterion("PURCHASE_BUSINESS_LOCAL between", value1, value2, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessLocalNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_BUSINESS_LOCAL not between", value1, value2, "purchaseBusinessLocal");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexIsNull() {
            addCriterion("PURCHASE_BUSINESS_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexIsNotNull() {
            addCriterion("PURCHASE_BUSINESS_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX =", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexNotEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX <>", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexGreaterThan(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX >", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX >=", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexLessThan(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX <", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX <=", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexLike(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX like", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexNotLike(String value) {
            addCriterion("PURCHASE_BUSINESS_INDEX not like", value, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexIn(List<String> values) {
            addCriterion("PURCHASE_BUSINESS_INDEX in", values, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexNotIn(List<String> values) {
            addCriterion("PURCHASE_BUSINESS_INDEX not in", values, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexBetween(String value1, String value2) {
            addCriterion("PURCHASE_BUSINESS_INDEX between", value1, value2, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseBusinessIndexNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_BUSINESS_INDEX not between", value1, value2, "purchaseBusinessIndex");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberIsNull() {
            addCriterion("PURCHASE_STAFF_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberIsNotNull() {
            addCriterion("PURCHASE_STAFF_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberEqualTo(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER =", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberNotEqualTo(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER <>", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberGreaterThan(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER >", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER >=", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberLessThan(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER <", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER <=", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberLike(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER like", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberNotLike(String value) {
            addCriterion("PURCHASE_STAFF_NUMBER not like", value, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberIn(List<String> values) {
            addCriterion("PURCHASE_STAFF_NUMBER in", values, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberNotIn(List<String> values) {
            addCriterion("PURCHASE_STAFF_NUMBER not in", values, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberBetween(String value1, String value2) {
            addCriterion("PURCHASE_STAFF_NUMBER between", value1, value2, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseStaffNumberNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_STAFF_NUMBER not between", value1, value2, "purchaseStaffNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderIsNull() {
            addCriterion("PURCHASE_LEADER is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderIsNotNull() {
            addCriterion("PURCHASE_LEADER is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderEqualTo(String value) {
            addCriterion("PURCHASE_LEADER =", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderNotEqualTo(String value) {
            addCriterion("PURCHASE_LEADER <>", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderGreaterThan(String value) {
            addCriterion("PURCHASE_LEADER >", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_LEADER >=", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderLessThan(String value) {
            addCriterion("PURCHASE_LEADER <", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_LEADER <=", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderLike(String value) {
            addCriterion("PURCHASE_LEADER like", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderNotLike(String value) {
            addCriterion("PURCHASE_LEADER not like", value, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderIn(List<String> values) {
            addCriterion("PURCHASE_LEADER in", values, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderNotIn(List<String> values) {
            addCriterion("PURCHASE_LEADER not in", values, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderBetween(String value1, String value2) {
            addCriterion("PURCHASE_LEADER between", value1, value2, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseLeaderNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_LEADER not between", value1, value2, "purchaseLeader");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationIsNull() {
            addCriterion("PURCHASE_ORGANIZATION is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationIsNotNull() {
            addCriterion("PURCHASE_ORGANIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationEqualTo(String value) {
            addCriterion("PURCHASE_ORGANIZATION =", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationNotEqualTo(String value) {
            addCriterion("PURCHASE_ORGANIZATION <>", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationGreaterThan(String value) {
            addCriterion("PURCHASE_ORGANIZATION >", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ORGANIZATION >=", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationLessThan(String value) {
            addCriterion("PURCHASE_ORGANIZATION <", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ORGANIZATION <=", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationLike(String value) {
            addCriterion("PURCHASE_ORGANIZATION like", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationNotLike(String value) {
            addCriterion("PURCHASE_ORGANIZATION not like", value, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationIn(List<String> values) {
            addCriterion("PURCHASE_ORGANIZATION in", values, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationNotIn(List<String> values) {
            addCriterion("PURCHASE_ORGANIZATION not in", values, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationBetween(String value1, String value2) {
            addCriterion("PURCHASE_ORGANIZATION between", value1, value2, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrganizationNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ORGANIZATION not between", value1, value2, "purchaseOrganization");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisIsNull() {
            addCriterion("PURCHASE_DEVELOPMENT_HIS is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisIsNotNull() {
            addCriterion("PURCHASE_DEVELOPMENT_HIS is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisEqualTo(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS =", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisNotEqualTo(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS <>", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisGreaterThan(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS >", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS >=", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisLessThan(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS <", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS <=", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisLike(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS like", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisNotLike(String value) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS not like", value, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisIn(List<String> values) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS in", values, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisNotIn(List<String> values) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS not in", values, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisBetween(String value1, String value2) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS between", value1, value2, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseDevelopmentHisNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_DEVELOPMENT_HIS not between", value1, value2, "purchaseDevelopmentHis");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationIsNull() {
            addCriterion("PURCHASE_FINANCIAL_SITUATION is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationIsNotNull() {
            addCriterion("PURCHASE_FINANCIAL_SITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationEqualTo(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION =", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationNotEqualTo(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION <>", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationGreaterThan(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION >", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION >=", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationLessThan(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION <", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION <=", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationLike(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION like", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationNotLike(String value) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION not like", value, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationIn(List<String> values) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION in", values, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationNotIn(List<String> values) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION not in", values, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationBetween(String value1, String value2) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION between", value1, value2, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFinancialSituationNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_FINANCIAL_SITUATION not between", value1, value2, "purchaseFinancialSituation");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesIsNull() {
            addCriterion("PURCHASE_FIXED_FACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesIsNotNull() {
            addCriterion("PURCHASE_FIXED_FACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesEqualTo(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES =", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesNotEqualTo(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES <>", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesGreaterThan(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES >", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES >=", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesLessThan(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES <", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES <=", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesLike(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES like", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesNotLike(String value) {
            addCriterion("PURCHASE_FIXED_FACILITIES not like", value, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesIn(List<String> values) {
            addCriterion("PURCHASE_FIXED_FACILITIES in", values, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesNotIn(List<String> values) {
            addCriterion("PURCHASE_FIXED_FACILITIES not in", values, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesBetween(String value1, String value2) {
            addCriterion("PURCHASE_FIXED_FACILITIES between", value1, value2, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseFixedFacilitiesNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_FIXED_FACILITIES not between", value1, value2, "purchaseFixedFacilities");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsIsNull() {
            addCriterion("PURCHASE_ASSSTS is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsIsNotNull() {
            addCriterion("PURCHASE_ASSSTS is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsEqualTo(String value) {
            addCriterion("PURCHASE_ASSSTS =", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsNotEqualTo(String value) {
            addCriterion("PURCHASE_ASSSTS <>", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsGreaterThan(String value) {
            addCriterion("PURCHASE_ASSSTS >", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ASSSTS >=", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsLessThan(String value) {
            addCriterion("PURCHASE_ASSSTS <", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_ASSSTS <=", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsLike(String value) {
            addCriterion("PURCHASE_ASSSTS like", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsNotLike(String value) {
            addCriterion("PURCHASE_ASSSTS not like", value, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsIn(List<String> values) {
            addCriterion("PURCHASE_ASSSTS in", values, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsNotIn(List<String> values) {
            addCriterion("PURCHASE_ASSSTS not in", values, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsBetween(String value1, String value2) {
            addCriterion("PURCHASE_ASSSTS between", value1, value2, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseAssstsNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_ASSSTS not between", value1, value2, "purchaseAsssts");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthIsNull() {
            addCriterion("PURCHASE_SENSE_OF_WORTH is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthIsNotNull() {
            addCriterion("PURCHASE_SENSE_OF_WORTH is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthEqualTo(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH =", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthNotEqualTo(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH <>", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthGreaterThan(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH >", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH >=", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthLessThan(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH <", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH <=", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthLike(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH like", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthNotLike(String value) {
            addCriterion("PURCHASE_SENSE_OF_WORTH not like", value, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthIn(List<String> values) {
            addCriterion("PURCHASE_SENSE_OF_WORTH in", values, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthNotIn(List<String> values) {
            addCriterion("PURCHASE_SENSE_OF_WORTH not in", values, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthBetween(String value1, String value2) {
            addCriterion("PURCHASE_SENSE_OF_WORTH between", value1, value2, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseSenseOfWorthNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_SENSE_OF_WORTH not between", value1, value2, "purchaseSenseOfWorth");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureIsNull() {
            addCriterion("PURCHASE_CORPORATE_CULTURE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureIsNotNull() {
            addCriterion("PURCHASE_CORPORATE_CULTURE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureEqualTo(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE =", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureNotEqualTo(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE <>", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureGreaterThan(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE >", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE >=", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureLessThan(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE <", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE <=", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureLike(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE like", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureNotLike(String value) {
            addCriterion("PURCHASE_CORPORATE_CULTURE not like", value, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureIn(List<String> values) {
            addCriterion("PURCHASE_CORPORATE_CULTURE in", values, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureNotIn(List<String> values) {
            addCriterion("PURCHASE_CORPORATE_CULTURE not in", values, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureBetween(String value1, String value2) {
            addCriterion("PURCHASE_CORPORATE_CULTURE between", value1, value2, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseCorporateCultureNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_CORPORATE_CULTURE not between", value1, value2, "purchaseCorporateCulture");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescIsNull() {
            addCriterion("PURCHASE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescIsNotNull() {
            addCriterion("PURCHASE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescEqualTo(String value) {
            addCriterion("PURCHASE_DESC =", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescNotEqualTo(String value) {
            addCriterion("PURCHASE_DESC <>", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescGreaterThan(String value) {
            addCriterion("PURCHASE_DESC >", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DESC >=", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescLessThan(String value) {
            addCriterion("PURCHASE_DESC <", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DESC <=", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescLike(String value) {
            addCriterion("PURCHASE_DESC like", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescNotLike(String value) {
            addCriterion("PURCHASE_DESC not like", value, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescIn(List<String> values) {
            addCriterion("PURCHASE_DESC in", values, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescNotIn(List<String> values) {
            addCriterion("PURCHASE_DESC not in", values, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescBetween(String value1, String value2) {
            addCriterion("PURCHASE_DESC between", value1, value2, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andPurchaseDescNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_DESC not between", value1, value2, "purchaseDesc");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("DEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("DEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Short value) {
            addCriterion("DEL_FLAG =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Short value) {
            addCriterion("DEL_FLAG <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Short value) {
            addCriterion("DEL_FLAG >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("DEL_FLAG >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Short value) {
            addCriterion("DEL_FLAG <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Short value) {
            addCriterion("DEL_FLAG <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Short> values) {
            addCriterion("DEL_FLAG in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Short> values) {
            addCriterion("DEL_FLAG not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Short value1, Short value2) {
            addCriterion("DEL_FLAG between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Short value1, Short value2) {
            addCriterion("DEL_FLAG not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andOperaterIsNull() {
            addCriterion("OPERATER is null");
            return (Criteria) this;
        }

        public Criteria andOperaterIsNotNull() {
            addCriterion("OPERATER is not null");
            return (Criteria) this;
        }

        public Criteria andOperaterEqualTo(String value) {
            addCriterion("OPERATER =", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotEqualTo(String value) {
            addCriterion("OPERATER <>", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterGreaterThan(String value) {
            addCriterion("OPERATER >", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATER >=", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterLessThan(String value) {
            addCriterion("OPERATER <", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterLessThanOrEqualTo(String value) {
            addCriterion("OPERATER <=", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterLike(String value) {
            addCriterion("OPERATER like", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotLike(String value) {
            addCriterion("OPERATER not like", value, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterIn(List<String> values) {
            addCriterion("OPERATER in", values, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotIn(List<String> values) {
            addCriterion("OPERATER not in", values, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterBetween(String value1, String value2) {
            addCriterion("OPERATER between", value1, value2, "operater");
            return (Criteria) this;
        }

        public Criteria andOperaterNotBetween(String value1, String value2) {
            addCriterion("OPERATER not between", value1, value2, "operater");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIsNull() {
            addCriterion("CREATE_DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIsNotNull() {
            addCriterion("CREATE_DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeEqualTo(Date value) {
            addCriterion("CREATE_DATE_TIME =", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_DATE_TIME <>", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThan(Date value) {
            addCriterion("CREATE_DATE_TIME >", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE_TIME >=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThan(Date value) {
            addCriterion("CREATE_DATE_TIME <", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE_TIME <=", value, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeIn(List<Date> values) {
            addCriterion("CREATE_DATE_TIME in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_DATE_TIME not in", values, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE_TIME between", value1, value2, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE_TIME not between", value1, value2, "createDateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}