package com.ptg.purchase.console.dto.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TScConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TScConfigExample() {
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

        public Criteria andScKeyIsNull() {
            addCriterion("SC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andScKeyIsNotNull() {
            addCriterion("SC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andScKeyEqualTo(String value) {
            addCriterion("SC_KEY =", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyNotEqualTo(String value) {
            addCriterion("SC_KEY <>", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyGreaterThan(String value) {
            addCriterion("SC_KEY >", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyGreaterThanOrEqualTo(String value) {
            addCriterion("SC_KEY >=", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyLessThan(String value) {
            addCriterion("SC_KEY <", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyLessThanOrEqualTo(String value) {
            addCriterion("SC_KEY <=", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyLike(String value) {
            addCriterion("SC_KEY like", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyNotLike(String value) {
            addCriterion("SC_KEY not like", value, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyIn(List<String> values) {
            addCriterion("SC_KEY in", values, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyNotIn(List<String> values) {
            addCriterion("SC_KEY not in", values, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyBetween(String value1, String value2) {
            addCriterion("SC_KEY between", value1, value2, "scKey");
            return (Criteria) this;
        }

        public Criteria andScKeyNotBetween(String value1, String value2) {
            addCriterion("SC_KEY not between", value1, value2, "scKey");
            return (Criteria) this;
        }

        public Criteria andScValueIsNull() {
            addCriterion("SC_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andScValueIsNotNull() {
            addCriterion("SC_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andScValueEqualTo(String value) {
            addCriterion("SC_VALUE =", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueNotEqualTo(String value) {
            addCriterion("SC_VALUE <>", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueGreaterThan(String value) {
            addCriterion("SC_VALUE >", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueGreaterThanOrEqualTo(String value) {
            addCriterion("SC_VALUE >=", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueLessThan(String value) {
            addCriterion("SC_VALUE <", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueLessThanOrEqualTo(String value) {
            addCriterion("SC_VALUE <=", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueLike(String value) {
            addCriterion("SC_VALUE like", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueNotLike(String value) {
            addCriterion("SC_VALUE not like", value, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueIn(List<String> values) {
            addCriterion("SC_VALUE in", values, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueNotIn(List<String> values) {
            addCriterion("SC_VALUE not in", values, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueBetween(String value1, String value2) {
            addCriterion("SC_VALUE between", value1, value2, "scValue");
            return (Criteria) this;
        }

        public Criteria andScValueNotBetween(String value1, String value2) {
            addCriterion("SC_VALUE not between", value1, value2, "scValue");
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