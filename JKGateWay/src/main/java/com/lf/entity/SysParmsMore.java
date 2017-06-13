package com.lf.entity;

import java.util.ArrayList;
import java.util.List;

public class SysParmsMore extends SysParms {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysParmsMore() {
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

        public Criteria andSysIdIsNull() {
            addCriterion("sys_id is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("sys_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("sys_id =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("sys_id <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("sys_id >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_id >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("sys_id <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("sys_id <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("sys_id like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("sys_id not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("sys_id in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("sys_id not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("sys_id between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("sys_id not between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysNoIsNull() {
            addCriterion("sys_no is null");
            return (Criteria) this;
        }

        public Criteria andSysNoIsNotNull() {
            addCriterion("sys_no is not null");
            return (Criteria) this;
        }

        public Criteria andSysNoEqualTo(String value) {
            addCriterion("sys_no =", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotEqualTo(String value) {
            addCriterion("sys_no <>", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThan(String value) {
            addCriterion("sys_no >", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThanOrEqualTo(String value) {
            addCriterion("sys_no >=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThan(String value) {
            addCriterion("sys_no <", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThanOrEqualTo(String value) {
            addCriterion("sys_no <=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLike(String value) {
            addCriterion("sys_no like", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotLike(String value) {
            addCriterion("sys_no not like", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoIn(List<String> values) {
            addCriterion("sys_no in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotIn(List<String> values) {
            addCriterion("sys_no not in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoBetween(String value1, String value2) {
            addCriterion("sys_no between", value1, value2, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotBetween(String value1, String value2) {
            addCriterion("sys_no not between", value1, value2, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysKeyIsNull() {
            addCriterion("sys_key is null");
            return (Criteria) this;
        }

        public Criteria andSysKeyIsNotNull() {
            addCriterion("sys_key is not null");
            return (Criteria) this;
        }

        public Criteria andSysKeyEqualTo(String value) {
            addCriterion("sys_key =", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyNotEqualTo(String value) {
            addCriterion("sys_key <>", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyGreaterThan(String value) {
            addCriterion("sys_key >", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyGreaterThanOrEqualTo(String value) {
            addCriterion("sys_key >=", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyLessThan(String value) {
            addCriterion("sys_key <", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyLessThanOrEqualTo(String value) {
            addCriterion("sys_key <=", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyLike(String value) {
            addCriterion("sys_key like", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyNotLike(String value) {
            addCriterion("sys_key not like", value, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyIn(List<String> values) {
            addCriterion("sys_key in", values, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyNotIn(List<String> values) {
            addCriterion("sys_key not in", values, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyBetween(String value1, String value2) {
            addCriterion("sys_key between", value1, value2, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysKeyNotBetween(String value1, String value2) {
            addCriterion("sys_key not between", value1, value2, "sysKey");
            return (Criteria) this;
        }

        public Criteria andSysValueIsNull() {
            addCriterion("sys_value is null");
            return (Criteria) this;
        }

        public Criteria andSysValueIsNotNull() {
            addCriterion("sys_value is not null");
            return (Criteria) this;
        }

        public Criteria andSysValueEqualTo(String value) {
            addCriterion("sys_value =", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueNotEqualTo(String value) {
            addCriterion("sys_value <>", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueGreaterThan(String value) {
            addCriterion("sys_value >", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueGreaterThanOrEqualTo(String value) {
            addCriterion("sys_value >=", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueLessThan(String value) {
            addCriterion("sys_value <", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueLessThanOrEqualTo(String value) {
            addCriterion("sys_value <=", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueLike(String value) {
            addCriterion("sys_value like", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueNotLike(String value) {
            addCriterion("sys_value not like", value, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueIn(List<String> values) {
            addCriterion("sys_value in", values, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueNotIn(List<String> values) {
            addCriterion("sys_value not in", values, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueBetween(String value1, String value2) {
            addCriterion("sys_value between", value1, value2, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysValueNotBetween(String value1, String value2) {
            addCriterion("sys_value not between", value1, value2, "sysValue");
            return (Criteria) this;
        }

        public Criteria andSysDescIsNull() {
            addCriterion("sys_desc is null");
            return (Criteria) this;
        }

        public Criteria andSysDescIsNotNull() {
            addCriterion("sys_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSysDescEqualTo(String value) {
            addCriterion("sys_desc =", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotEqualTo(String value) {
            addCriterion("sys_desc <>", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescGreaterThan(String value) {
            addCriterion("sys_desc >", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescGreaterThanOrEqualTo(String value) {
            addCriterion("sys_desc >=", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLessThan(String value) {
            addCriterion("sys_desc <", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLessThanOrEqualTo(String value) {
            addCriterion("sys_desc <=", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescLike(String value) {
            addCriterion("sys_desc like", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotLike(String value) {
            addCriterion("sys_desc not like", value, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescIn(List<String> values) {
            addCriterion("sys_desc in", values, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotIn(List<String> values) {
            addCriterion("sys_desc not in", values, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescBetween(String value1, String value2) {
            addCriterion("sys_desc between", value1, value2, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysDescNotBetween(String value1, String value2) {
            addCriterion("sys_desc not between", value1, value2, "sysDesc");
            return (Criteria) this;
        }

        public Criteria andSysKey1IsNull() {
            addCriterion("sys_key1 is null");
            return (Criteria) this;
        }

        public Criteria andSysKey1IsNotNull() {
            addCriterion("sys_key1 is not null");
            return (Criteria) this;
        }

        public Criteria andSysKey1EqualTo(String value) {
            addCriterion("sys_key1 =", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1NotEqualTo(String value) {
            addCriterion("sys_key1 <>", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1GreaterThan(String value) {
            addCriterion("sys_key1 >", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1GreaterThanOrEqualTo(String value) {
            addCriterion("sys_key1 >=", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1LessThan(String value) {
            addCriterion("sys_key1 <", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1LessThanOrEqualTo(String value) {
            addCriterion("sys_key1 <=", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1Like(String value) {
            addCriterion("sys_key1 like", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1NotLike(String value) {
            addCriterion("sys_key1 not like", value, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1In(List<String> values) {
            addCriterion("sys_key1 in", values, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1NotIn(List<String> values) {
            addCriterion("sys_key1 not in", values, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1Between(String value1, String value2) {
            addCriterion("sys_key1 between", value1, value2, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysKey1NotBetween(String value1, String value2) {
            addCriterion("sys_key1 not between", value1, value2, "sysKey1");
            return (Criteria) this;
        }

        public Criteria andSysValue1IsNull() {
            addCriterion("sys_value1 is null");
            return (Criteria) this;
        }

        public Criteria andSysValue1IsNotNull() {
            addCriterion("sys_value1 is not null");
            return (Criteria) this;
        }

        public Criteria andSysValue1EqualTo(String value) {
            addCriterion("sys_value1 =", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1NotEqualTo(String value) {
            addCriterion("sys_value1 <>", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1GreaterThan(String value) {
            addCriterion("sys_value1 >", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1GreaterThanOrEqualTo(String value) {
            addCriterion("sys_value1 >=", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1LessThan(String value) {
            addCriterion("sys_value1 <", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1LessThanOrEqualTo(String value) {
            addCriterion("sys_value1 <=", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1Like(String value) {
            addCriterion("sys_value1 like", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1NotLike(String value) {
            addCriterion("sys_value1 not like", value, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1In(List<String> values) {
            addCriterion("sys_value1 in", values, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1NotIn(List<String> values) {
            addCriterion("sys_value1 not in", values, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1Between(String value1, String value2) {
            addCriterion("sys_value1 between", value1, value2, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysValue1NotBetween(String value1, String value2) {
            addCriterion("sys_value1 not between", value1, value2, "sysValue1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1IsNull() {
            addCriterion("sys_desc1 is null");
            return (Criteria) this;
        }

        public Criteria andSysDesc1IsNotNull() {
            addCriterion("sys_desc1 is not null");
            return (Criteria) this;
        }

        public Criteria andSysDesc1EqualTo(String value) {
            addCriterion("sys_desc1 =", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1NotEqualTo(String value) {
            addCriterion("sys_desc1 <>", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1GreaterThan(String value) {
            addCriterion("sys_desc1 >", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1GreaterThanOrEqualTo(String value) {
            addCriterion("sys_desc1 >=", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1LessThan(String value) {
            addCriterion("sys_desc1 <", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1LessThanOrEqualTo(String value) {
            addCriterion("sys_desc1 <=", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1Like(String value) {
            addCriterion("sys_desc1 like", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1NotLike(String value) {
            addCriterion("sys_desc1 not like", value, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1In(List<String> values) {
            addCriterion("sys_desc1 in", values, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1NotIn(List<String> values) {
            addCriterion("sys_desc1 not in", values, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1Between(String value1, String value2) {
            addCriterion("sys_desc1 between", value1, value2, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysDesc1NotBetween(String value1, String value2) {
            addCriterion("sys_desc1 not between", value1, value2, "sysDesc1");
            return (Criteria) this;
        }

        public Criteria andSysParentNoIsNull() {
            addCriterion("sys_parent_no is null");
            return (Criteria) this;
        }

        public Criteria andSysParentNoIsNotNull() {
            addCriterion("sys_parent_no is not null");
            return (Criteria) this;
        }

        public Criteria andSysParentNoEqualTo(String value) {
            addCriterion("sys_parent_no =", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoNotEqualTo(String value) {
            addCriterion("sys_parent_no <>", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoGreaterThan(String value) {
            addCriterion("sys_parent_no >", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoGreaterThanOrEqualTo(String value) {
            addCriterion("sys_parent_no >=", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoLessThan(String value) {
            addCriterion("sys_parent_no <", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoLessThanOrEqualTo(String value) {
            addCriterion("sys_parent_no <=", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoLike(String value) {
            addCriterion("sys_parent_no like", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoNotLike(String value) {
            addCriterion("sys_parent_no not like", value, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoIn(List<String> values) {
            addCriterion("sys_parent_no in", values, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoNotIn(List<String> values) {
            addCriterion("sys_parent_no not in", values, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoBetween(String value1, String value2) {
            addCriterion("sys_parent_no between", value1, value2, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysParentNoNotBetween(String value1, String value2) {
            addCriterion("sys_parent_no not between", value1, value2, "sysParentNo");
            return (Criteria) this;
        }

        public Criteria andSysSequIsNull() {
            addCriterion("sys_sequ is null");
            return (Criteria) this;
        }

        public Criteria andSysSequIsNotNull() {
            addCriterion("sys_sequ is not null");
            return (Criteria) this;
        }

        public Criteria andSysSequEqualTo(String value) {
            addCriterion("sys_sequ =", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequNotEqualTo(String value) {
            addCriterion("sys_sequ <>", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequGreaterThan(String value) {
            addCriterion("sys_sequ >", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequGreaterThanOrEqualTo(String value) {
            addCriterion("sys_sequ >=", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequLessThan(String value) {
            addCriterion("sys_sequ <", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequLessThanOrEqualTo(String value) {
            addCriterion("sys_sequ <=", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequLike(String value) {
            addCriterion("sys_sequ like", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequNotLike(String value) {
            addCriterion("sys_sequ not like", value, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequIn(List<String> values) {
            addCriterion("sys_sequ in", values, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequNotIn(List<String> values) {
            addCriterion("sys_sequ not in", values, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequBetween(String value1, String value2) {
            addCriterion("sys_sequ between", value1, value2, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andSysSequNotBetween(String value1, String value2) {
            addCriterion("sys_sequ not between", value1, value2, "sysSequ");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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