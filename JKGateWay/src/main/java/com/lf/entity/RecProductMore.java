package com.lf.entity;

import java.util.ArrayList;
import java.util.List;

public class RecProductMore {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecProductMore() {
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

        public Criteria andSerialIdIsNull() {
            addCriterion("serial_id is null");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNotNull() {
            addCriterion("serial_id is not null");
            return (Criteria) this;
        }

        public Criteria andSerialIdEqualTo(String value) {
            addCriterion("serial_id =", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotEqualTo(String value) {
            addCriterion("serial_id <>", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThan(String value) {
            addCriterion("serial_id >", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThanOrEqualTo(String value) {
            addCriterion("serial_id >=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThan(String value) {
            addCriterion("serial_id <", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThanOrEqualTo(String value) {
            addCriterion("serial_id <=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLike(String value) {
            addCriterion("serial_id like", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotLike(String value) {
            addCriterion("serial_id not like", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdIn(List<String> values) {
            addCriterion("serial_id in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotIn(List<String> values) {
            addCriterion("serial_id not in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdBetween(String value1, String value2) {
            addCriterion("serial_id between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotBetween(String value1, String value2) {
            addCriterion("serial_id not between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoIsNull() {
            addCriterion("product_type_no is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoIsNotNull() {
            addCriterion("product_type_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoEqualTo(String value) {
            addCriterion("product_type_no =", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoNotEqualTo(String value) {
            addCriterion("product_type_no <>", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoGreaterThan(String value) {
            addCriterion("product_type_no >", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_type_no >=", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoLessThan(String value) {
            addCriterion("product_type_no <", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoLessThanOrEqualTo(String value) {
            addCriterion("product_type_no <=", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoLike(String value) {
            addCriterion("product_type_no like", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoNotLike(String value) {
            addCriterion("product_type_no not like", value, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoIn(List<String> values) {
            addCriterion("product_type_no in", values, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoNotIn(List<String> values) {
            addCriterion("product_type_no not in", values, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoBetween(String value1, String value2) {
            addCriterion("product_type_no between", value1, value2, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNoNotBetween(String value1, String value2) {
            addCriterion("product_type_no not between", value1, value2, "productTypeNo");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameIsNull() {
            addCriterion("product_type_name is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameIsNotNull() {
            addCriterion("product_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameEqualTo(String value) {
            addCriterion("product_type_name =", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotEqualTo(String value) {
            addCriterion("product_type_name <>", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameGreaterThan(String value) {
            addCriterion("product_type_name >", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_type_name >=", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameLessThan(String value) {
            addCriterion("product_type_name <", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameLessThanOrEqualTo(String value) {
            addCriterion("product_type_name <=", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameLike(String value) {
            addCriterion("product_type_name like", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotLike(String value) {
            addCriterion("product_type_name not like", value, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameIn(List<String> values) {
            addCriterion("product_type_name in", values, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotIn(List<String> values) {
            addCriterion("product_type_name not in", values, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameBetween(String value1, String value2) {
            addCriterion("product_type_name between", value1, value2, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeNameNotBetween(String value1, String value2) {
            addCriterion("product_type_name not between", value1, value2, "productTypeName");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgIsNull() {
            addCriterion("product_type_img is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgIsNotNull() {
            addCriterion("product_type_img is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgEqualTo(String value) {
            addCriterion("product_type_img =", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgNotEqualTo(String value) {
            addCriterion("product_type_img <>", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgGreaterThan(String value) {
            addCriterion("product_type_img >", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgGreaterThanOrEqualTo(String value) {
            addCriterion("product_type_img >=", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgLessThan(String value) {
            addCriterion("product_type_img <", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgLessThanOrEqualTo(String value) {
            addCriterion("product_type_img <=", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgLike(String value) {
            addCriterion("product_type_img like", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgNotLike(String value) {
            addCriterion("product_type_img not like", value, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgIn(List<String> values) {
            addCriterion("product_type_img in", values, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgNotIn(List<String> values) {
            addCriterion("product_type_img not in", values, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgBetween(String value1, String value2) {
            addCriterion("product_type_img between", value1, value2, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductTypeImgNotBetween(String value1, String value2) {
            addCriterion("product_type_img not between", value1, value2, "productTypeImg");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("product_no is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("product_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("product_no =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("product_no <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("product_no >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_no >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("product_no <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("product_no <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("product_no like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("product_no not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("product_no in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("product_no not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("product_no between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("product_no not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductImgIsNull() {
            addCriterion("product_img is null");
            return (Criteria) this;
        }

        public Criteria andProductImgIsNotNull() {
            addCriterion("product_img is not null");
            return (Criteria) this;
        }

        public Criteria andProductImgEqualTo(String value) {
            addCriterion("product_img =", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgNotEqualTo(String value) {
            addCriterion("product_img <>", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgGreaterThan(String value) {
            addCriterion("product_img >", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgGreaterThanOrEqualTo(String value) {
            addCriterion("product_img >=", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgLessThan(String value) {
            addCriterion("product_img <", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgLessThanOrEqualTo(String value) {
            addCriterion("product_img <=", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgLike(String value) {
            addCriterion("product_img like", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgNotLike(String value) {
            addCriterion("product_img not like", value, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgIn(List<String> values) {
            addCriterion("product_img in", values, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgNotIn(List<String> values) {
            addCriterion("product_img not in", values, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgBetween(String value1, String value2) {
            addCriterion("product_img between", value1, value2, "productImg");
            return (Criteria) this;
        }

        public Criteria andProductImgNotBetween(String value1, String value2) {
            addCriterion("product_img not between", value1, value2, "productImg");
            return (Criteria) this;
        }

        public Criteria andReqUrlIsNull() {
            addCriterion("req_url is null");
            return (Criteria) this;
        }

        public Criteria andReqUrlIsNotNull() {
            addCriterion("req_url is not null");
            return (Criteria) this;
        }

        public Criteria andReqUrlEqualTo(String value) {
            addCriterion("req_url =", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotEqualTo(String value) {
            addCriterion("req_url <>", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlGreaterThan(String value) {
            addCriterion("req_url >", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlGreaterThanOrEqualTo(String value) {
            addCriterion("req_url >=", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlLessThan(String value) {
            addCriterion("req_url <", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlLessThanOrEqualTo(String value) {
            addCriterion("req_url <=", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlLike(String value) {
            addCriterion("req_url like", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotLike(String value) {
            addCriterion("req_url not like", value, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlIn(List<String> values) {
            addCriterion("req_url in", values, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotIn(List<String> values) {
            addCriterion("req_url not in", values, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlBetween(String value1, String value2) {
            addCriterion("req_url between", value1, value2, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andReqUrlNotBetween(String value1, String value2) {
            addCriterion("req_url not between", value1, value2, "reqUrl");
            return (Criteria) this;
        }

        public Criteria andMarkImgIsNull() {
            addCriterion("mark_img is null");
            return (Criteria) this;
        }

        public Criteria andMarkImgIsNotNull() {
            addCriterion("mark_img is not null");
            return (Criteria) this;
        }

        public Criteria andMarkImgEqualTo(String value) {
            addCriterion("mark_img =", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgNotEqualTo(String value) {
            addCriterion("mark_img <>", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgGreaterThan(String value) {
            addCriterion("mark_img >", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgGreaterThanOrEqualTo(String value) {
            addCriterion("mark_img >=", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgLessThan(String value) {
            addCriterion("mark_img <", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgLessThanOrEqualTo(String value) {
            addCriterion("mark_img <=", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgLike(String value) {
            addCriterion("mark_img like", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgNotLike(String value) {
            addCriterion("mark_img not like", value, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgIn(List<String> values) {
            addCriterion("mark_img in", values, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgNotIn(List<String> values) {
            addCriterion("mark_img not in", values, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgBetween(String value1, String value2) {
            addCriterion("mark_img between", value1, value2, "markImg");
            return (Criteria) this;
        }

        public Criteria andMarkImgNotBetween(String value1, String value2) {
            addCriterion("mark_img not between", value1, value2, "markImg");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNull() {
            addCriterion("use_flag is null");
            return (Criteria) this;
        }

        public Criteria andUseFlagIsNotNull() {
            addCriterion("use_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUseFlagEqualTo(String value) {
            addCriterion("use_flag =", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotEqualTo(String value) {
            addCriterion("use_flag <>", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThan(String value) {
            addCriterion("use_flag >", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagGreaterThanOrEqualTo(String value) {
            addCriterion("use_flag >=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThan(String value) {
            addCriterion("use_flag <", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLessThanOrEqualTo(String value) {
            addCriterion("use_flag <=", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagLike(String value) {
            addCriterion("use_flag like", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotLike(String value) {
            addCriterion("use_flag not like", value, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagIn(List<String> values) {
            addCriterion("use_flag in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotIn(List<String> values) {
            addCriterion("use_flag not in", values, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagBetween(String value1, String value2) {
            addCriterion("use_flag between", value1, value2, "useFlag");
            return (Criteria) this;
        }

        public Criteria andUseFlagNotBetween(String value1, String value2) {
            addCriterion("use_flag not between", value1, value2, "useFlag");
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