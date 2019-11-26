package com.hzf.mq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DResRealtimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DResRealtimeExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andTS_NOIsNull() {
            addCriterion("TS_NO is null");
            return (Criteria) this;
        }

        public Criteria andTS_NOIsNotNull() {
            addCriterion("TS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTS_NOEqualTo(String value) {
            addCriterion("TS_NO =", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NONotEqualTo(String value) {
            addCriterion("TS_NO <>", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NOGreaterThan(String value) {
            addCriterion("TS_NO >", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NOGreaterThanOrEqualTo(String value) {
            addCriterion("TS_NO >=", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NOLessThan(String value) {
            addCriterion("TS_NO <", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NOLessThanOrEqualTo(String value) {
            addCriterion("TS_NO <=", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NOLike(String value) {
            addCriterion("TS_NO like", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NONotLike(String value) {
            addCriterion("TS_NO not like", value, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NOIn(List<String> values) {
            addCriterion("TS_NO in", values, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NONotIn(List<String> values) {
            addCriterion("TS_NO not in", values, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NOBetween(String value1, String value2) {
            addCriterion("TS_NO between", value1, value2, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andTS_NONotBetween(String value1, String value2) {
            addCriterion("TS_NO not between", value1, value2, "TS_NO");
            return (Criteria) this;
        }

        public Criteria andLINEIsNull() {
            addCriterion("LINE is null");
            return (Criteria) this;
        }

        public Criteria andLINEIsNotNull() {
            addCriterion("LINE is not null");
            return (Criteria) this;
        }

        public Criteria andLINEEqualTo(String value) {
            addCriterion("LINE =", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINENotEqualTo(String value) {
            addCriterion("LINE <>", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINEGreaterThan(String value) {
            addCriterion("LINE >", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINEGreaterThanOrEqualTo(String value) {
            addCriterion("LINE >=", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINELessThan(String value) {
            addCriterion("LINE <", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINELessThanOrEqualTo(String value) {
            addCriterion("LINE <=", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINELike(String value) {
            addCriterion("LINE like", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINENotLike(String value) {
            addCriterion("LINE not like", value, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINEIn(List<String> values) {
            addCriterion("LINE in", values, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINENotIn(List<String> values) {
            addCriterion("LINE not in", values, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINEBetween(String value1, String value2) {
            addCriterion("LINE between", value1, value2, "LINE");
            return (Criteria) this;
        }

        public Criteria andLINENotBetween(String value1, String value2) {
            addCriterion("LINE not between", value1, value2, "LINE");
            return (Criteria) this;
        }

        public Criteria andLANEIsNull() {
            addCriterion("LANE is null");
            return (Criteria) this;
        }

        public Criteria andLANEIsNotNull() {
            addCriterion("LANE is not null");
            return (Criteria) this;
        }

        public Criteria andLANEEqualTo(String value) {
            addCriterion("LANE =", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANENotEqualTo(String value) {
            addCriterion("LANE <>", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANEGreaterThan(String value) {
            addCriterion("LANE >", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANEGreaterThanOrEqualTo(String value) {
            addCriterion("LANE >=", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANELessThan(String value) {
            addCriterion("LANE <", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANELessThanOrEqualTo(String value) {
            addCriterion("LANE <=", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANELike(String value) {
            addCriterion("LANE like", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANENotLike(String value) {
            addCriterion("LANE not like", value, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANEIn(List<String> values) {
            addCriterion("LANE in", values, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANENotIn(List<String> values) {
            addCriterion("LANE not in", values, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANEBetween(String value1, String value2) {
            addCriterion("LANE between", value1, value2, "LANE");
            return (Criteria) this;
        }

        public Criteria andLANENotBetween(String value1, String value2) {
            addCriterion("LANE not between", value1, value2, "LANE");
            return (Criteria) this;
        }

        public Criteria andLICENSEIsNull() {
            addCriterion("LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andLICENSEIsNotNull() {
            addCriterion("LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andLICENSEEqualTo(String value) {
            addCriterion("LICENSE =", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSENotEqualTo(String value) {
            addCriterion("LICENSE <>", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSEGreaterThan(String value) {
            addCriterion("LICENSE >", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSEGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE >=", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSELessThan(String value) {
            addCriterion("LICENSE <", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSELessThanOrEqualTo(String value) {
            addCriterion("LICENSE <=", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSELike(String value) {
            addCriterion("LICENSE like", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSENotLike(String value) {
            addCriterion("LICENSE not like", value, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSEIn(List<String> values) {
            addCriterion("LICENSE in", values, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSENotIn(List<String> values) {
            addCriterion("LICENSE not in", values, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSEBetween(String value1, String value2) {
            addCriterion("LICENSE between", value1, value2, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSENotBetween(String value1, String value2) {
            addCriterion("LICENSE not between", value1, value2, "LICENSE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODEIsNull() {
            addCriterion("LICENSE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODEIsNotNull() {
            addCriterion("LICENSE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODEEqualTo(String value) {
            addCriterion("LICENSE_CODE =", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODENotEqualTo(String value) {
            addCriterion("LICENSE_CODE <>", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODEGreaterThan(String value) {
            addCriterion("LICENSE_CODE >", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_CODE >=", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODELessThan(String value) {
            addCriterion("LICENSE_CODE <", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODELessThanOrEqualTo(String value) {
            addCriterion("LICENSE_CODE <=", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODELike(String value) {
            addCriterion("LICENSE_CODE like", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODENotLike(String value) {
            addCriterion("LICENSE_CODE not like", value, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODEIn(List<String> values) {
            addCriterion("LICENSE_CODE in", values, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODENotIn(List<String> values) {
            addCriterion("LICENSE_CODE not in", values, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODEBetween(String value1, String value2) {
            addCriterion("LICENSE_CODE between", value1, value2, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_CODENotBetween(String value1, String value2) {
            addCriterion("LICENSE_CODE not between", value1, value2, "LICENSE_CODE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPEIsNull() {
            addCriterion("LICENSE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPEIsNotNull() {
            addCriterion("LICENSE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPEEqualTo(String value) {
            addCriterion("LICENSE_TYPE =", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPENotEqualTo(String value) {
            addCriterion("LICENSE_TYPE <>", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPEGreaterThan(String value) {
            addCriterion("LICENSE_TYPE >", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_TYPE >=", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPELessThan(String value) {
            addCriterion("LICENSE_TYPE <", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPELessThanOrEqualTo(String value) {
            addCriterion("LICENSE_TYPE <=", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPELike(String value) {
            addCriterion("LICENSE_TYPE like", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPENotLike(String value) {
            addCriterion("LICENSE_TYPE not like", value, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPEIn(List<String> values) {
            addCriterion("LICENSE_TYPE in", values, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPENotIn(List<String> values) {
            addCriterion("LICENSE_TYPE not in", values, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPEBetween(String value1, String value2) {
            addCriterion("LICENSE_TYPE between", value1, value2, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andLICENSE_TYPENotBetween(String value1, String value2) {
            addCriterion("LICENSE_TYPE not between", value1, value2, "LICENSE_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORIsNull() {
            addCriterion("VEHICAL_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORIsNotNull() {
            addCriterion("VEHICAL_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLOREqualTo(String value) {
            addCriterion("VEHICAL_COLOR =", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORNotEqualTo(String value) {
            addCriterion("VEHICAL_COLOR <>", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORGreaterThan(String value) {
            addCriterion("VEHICAL_COLOR >", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICAL_COLOR >=", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORLessThan(String value) {
            addCriterion("VEHICAL_COLOR <", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORLessThanOrEqualTo(String value) {
            addCriterion("VEHICAL_COLOR <=", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORLike(String value) {
            addCriterion("VEHICAL_COLOR like", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORNotLike(String value) {
            addCriterion("VEHICAL_COLOR not like", value, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORIn(List<String> values) {
            addCriterion("VEHICAL_COLOR in", values, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORNotIn(List<String> values) {
            addCriterion("VEHICAL_COLOR not in", values, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORBetween(String value1, String value2) {
            addCriterion("VEHICAL_COLOR between", value1, value2, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_COLORNotBetween(String value1, String value2) {
            addCriterion("VEHICAL_COLOR not between", value1, value2, "VEHICAL_COLOR");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPEIsNull() {
            addCriterion("VEHICAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPEIsNotNull() {
            addCriterion("VEHICAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPEEqualTo(String value) {
            addCriterion("VEHICAL_TYPE =", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPENotEqualTo(String value) {
            addCriterion("VEHICAL_TYPE <>", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPEGreaterThan(String value) {
            addCriterion("VEHICAL_TYPE >", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("VEHICAL_TYPE >=", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPELessThan(String value) {
            addCriterion("VEHICAL_TYPE <", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPELessThanOrEqualTo(String value) {
            addCriterion("VEHICAL_TYPE <=", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPELike(String value) {
            addCriterion("VEHICAL_TYPE like", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPENotLike(String value) {
            addCriterion("VEHICAL_TYPE not like", value, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPEIn(List<String> values) {
            addCriterion("VEHICAL_TYPE in", values, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPENotIn(List<String> values) {
            addCriterion("VEHICAL_TYPE not in", values, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPEBetween(String value1, String value2) {
            addCriterion("VEHICAL_TYPE between", value1, value2, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andVEHICAL_TYPENotBetween(String value1, String value2) {
            addCriterion("VEHICAL_TYPE not between", value1, value2, "VEHICAL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPEIsNull() {
            addCriterion("FUEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPEIsNotNull() {
            addCriterion("FUEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPEEqualTo(Integer value) {
            addCriterion("FUEL_TYPE =", value, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPENotEqualTo(Integer value) {
            addCriterion("FUEL_TYPE <>", value, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPEGreaterThan(Integer value) {
            addCriterion("FUEL_TYPE >", value, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUEL_TYPE >=", value, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPELessThan(Integer value) {
            addCriterion("FUEL_TYPE <", value, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPELessThanOrEqualTo(Integer value) {
            addCriterion("FUEL_TYPE <=", value, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPEIn(List<Integer> values) {
            addCriterion("FUEL_TYPE in", values, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPENotIn(List<Integer> values) {
            addCriterion("FUEL_TYPE not in", values, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPEBetween(Integer value1, Integer value2) {
            addCriterion("FUEL_TYPE between", value1, value2, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andFUEL_TYPENotBetween(Integer value1, Integer value2) {
            addCriterion("FUEL_TYPE not between", value1, value2, "FUEL_TYPE");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMEIsNull() {
            addCriterion("MONITOR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMEIsNotNull() {
            addCriterion("MONITOR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMEEqualTo(Date value) {
            addCriterion("MONITOR_TIME =", value, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMENotEqualTo(Date value) {
            addCriterion("MONITOR_TIME <>", value, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMEGreaterThan(Date value) {
            addCriterion("MONITOR_TIME >", value, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("MONITOR_TIME >=", value, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMELessThan(Date value) {
            addCriterion("MONITOR_TIME <", value, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMELessThanOrEqualTo(Date value) {
            addCriterion("MONITOR_TIME <=", value, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMEIn(List<Date> values) {
            addCriterion("MONITOR_TIME in", values, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMENotIn(List<Date> values) {
            addCriterion("MONITOR_TIME not in", values, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMEBetween(Date value1, Date value2) {
            addCriterion("MONITOR_TIME between", value1, value2, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andMONITOR_TIMENotBetween(Date value1, Date value2) {
            addCriterion("MONITOR_TIME not between", value1, value2, "MONITOR_TIME");
            return (Criteria) this;
        }

        public Criteria andRESULTIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andRESULTIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andRESULTEqualTo(Integer value) {
            addCriterion("RESULT =", value, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTNotEqualTo(Integer value) {
            addCriterion("RESULT <>", value, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTGreaterThan(Integer value) {
            addCriterion("RESULT >", value, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESULT >=", value, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTLessThan(Integer value) {
            addCriterion("RESULT <", value, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTLessThanOrEqualTo(Integer value) {
            addCriterion("RESULT <=", value, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTIn(List<Integer> values) {
            addCriterion("RESULT in", values, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTNotIn(List<Integer> values) {
            addCriterion("RESULT not in", values, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTBetween(Integer value1, Integer value2) {
            addCriterion("RESULT between", value1, value2, "RESULT");
            return (Criteria) this;
        }

        public Criteria andRESULTNotBetween(Integer value1, Integer value2) {
            addCriterion("RESULT not between", value1, value2, "RESULT");
            return (Criteria) this;
        }

        public Criteria andCSIsNull() {
            addCriterion("CS is null");
            return (Criteria) this;
        }

        public Criteria andCSIsNotNull() {
            addCriterion("CS is not null");
            return (Criteria) this;
        }

        public Criteria andCSEqualTo(String value) {
            addCriterion("CS =", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSNotEqualTo(String value) {
            addCriterion("CS <>", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSGreaterThan(String value) {
            addCriterion("CS >", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSGreaterThanOrEqualTo(String value) {
            addCriterion("CS >=", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSLessThan(String value) {
            addCriterion("CS <", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSLessThanOrEqualTo(String value) {
            addCriterion("CS <=", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSLike(String value) {
            addCriterion("CS like", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSNotLike(String value) {
            addCriterion("CS not like", value, "CS");
            return (Criteria) this;
        }

        public Criteria andCSIn(List<String> values) {
            addCriterion("CS in", values, "CS");
            return (Criteria) this;
        }

        public Criteria andCSNotIn(List<String> values) {
            addCriterion("CS not in", values, "CS");
            return (Criteria) this;
        }

        public Criteria andCSBetween(String value1, String value2) {
            addCriterion("CS between", value1, value2, "CS");
            return (Criteria) this;
        }

        public Criteria andCSNotBetween(String value1, String value2) {
            addCriterion("CS not between", value1, value2, "CS");
            return (Criteria) this;
        }

        public Criteria andJSDIsNull() {
            addCriterion("JSD is null");
            return (Criteria) this;
        }

        public Criteria andJSDIsNotNull() {
            addCriterion("JSD is not null");
            return (Criteria) this;
        }

        public Criteria andJSDEqualTo(String value) {
            addCriterion("JSD =", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDNotEqualTo(String value) {
            addCriterion("JSD <>", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDGreaterThan(String value) {
            addCriterion("JSD >", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDGreaterThanOrEqualTo(String value) {
            addCriterion("JSD >=", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDLessThan(String value) {
            addCriterion("JSD <", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDLessThanOrEqualTo(String value) {
            addCriterion("JSD <=", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDLike(String value) {
            addCriterion("JSD like", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDNotLike(String value) {
            addCriterion("JSD not like", value, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDIn(List<String> values) {
            addCriterion("JSD in", values, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDNotIn(List<String> values) {
            addCriterion("JSD not in", values, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDBetween(String value1, String value2) {
            addCriterion("JSD between", value1, value2, "JSD");
            return (Criteria) this;
        }

        public Criteria andJSDNotBetween(String value1, String value2) {
            addCriterion("JSD not between", value1, value2, "JSD");
            return (Criteria) this;
        }

        public Criteria andCSCDIsNull() {
            addCriterion("CSCD is null");
            return (Criteria) this;
        }

        public Criteria andCSCDIsNotNull() {
            addCriterion("CSCD is not null");
            return (Criteria) this;
        }

        public Criteria andCSCDEqualTo(String value) {
            addCriterion("CSCD =", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDNotEqualTo(String value) {
            addCriterion("CSCD <>", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDGreaterThan(String value) {
            addCriterion("CSCD >", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDGreaterThanOrEqualTo(String value) {
            addCriterion("CSCD >=", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDLessThan(String value) {
            addCriterion("CSCD <", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDLessThanOrEqualTo(String value) {
            addCriterion("CSCD <=", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDLike(String value) {
            addCriterion("CSCD like", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDNotLike(String value) {
            addCriterion("CSCD not like", value, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDIn(List<String> values) {
            addCriterion("CSCD in", values, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDNotIn(List<String> values) {
            addCriterion("CSCD not in", values, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDBetween(String value1, String value2) {
            addCriterion("CSCD between", value1, value2, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCSCDNotBetween(String value1, String value2) {
            addCriterion("CSCD not between", value1, value2, "CSCD");
            return (Criteria) this;
        }

        public Criteria andCO2IsNull() {
            addCriterion("CO2 is null");
            return (Criteria) this;
        }

        public Criteria andCO2IsNotNull() {
            addCriterion("CO2 is not null");
            return (Criteria) this;
        }

        public Criteria andCO2EqualTo(String value) {
            addCriterion("CO2 =", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2NotEqualTo(String value) {
            addCriterion("CO2 <>", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2GreaterThan(String value) {
            addCriterion("CO2 >", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2GreaterThanOrEqualTo(String value) {
            addCriterion("CO2 >=", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2LessThan(String value) {
            addCriterion("CO2 <", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2LessThanOrEqualTo(String value) {
            addCriterion("CO2 <=", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2Like(String value) {
            addCriterion("CO2 like", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2NotLike(String value) {
            addCriterion("CO2 not like", value, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2In(List<String> values) {
            addCriterion("CO2 in", values, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2NotIn(List<String> values) {
            addCriterion("CO2 not in", values, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2Between(String value1, String value2) {
            addCriterion("CO2 between", value1, value2, "CO2");
            return (Criteria) this;
        }

        public Criteria andCO2NotBetween(String value1, String value2) {
            addCriterion("CO2 not between", value1, value2, "CO2");
            return (Criteria) this;
        }

        public Criteria andCOIsNull() {
            addCriterion("CO is null");
            return (Criteria) this;
        }

        public Criteria andCOIsNotNull() {
            addCriterion("CO is not null");
            return (Criteria) this;
        }

        public Criteria andCOEqualTo(Double value) {
            addCriterion("CO =", value, "CO");
            return (Criteria) this;
        }

        public Criteria andCONotEqualTo(Double value) {
            addCriterion("CO <>", value, "CO");
            return (Criteria) this;
        }

        public Criteria andCOGreaterThan(Double value) {
            addCriterion("CO >", value, "CO");
            return (Criteria) this;
        }

        public Criteria andCOGreaterThanOrEqualTo(Double value) {
            addCriterion("CO >=", value, "CO");
            return (Criteria) this;
        }

        public Criteria andCOLessThan(Double value) {
            addCriterion("CO <", value, "CO");
            return (Criteria) this;
        }

        public Criteria andCOLessThanOrEqualTo(Double value) {
            addCriterion("CO <=", value, "CO");
            return (Criteria) this;
        }

        public Criteria andCOIn(List<Double> values) {
            addCriterion("CO in", values, "CO");
            return (Criteria) this;
        }

        public Criteria andCONotIn(List<Double> values) {
            addCriterion("CO not in", values, "CO");
            return (Criteria) this;
        }

        public Criteria andCOBetween(Double value1, Double value2) {
            addCriterion("CO between", value1, value2, "CO");
            return (Criteria) this;
        }

        public Criteria andCONotBetween(Double value1, Double value2) {
            addCriterion("CO not between", value1, value2, "CO");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITIsNull() {
            addCriterion("CO_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITIsNotNull() {
            addCriterion("CO_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITEqualTo(String value) {
            addCriterion("CO_LIMIT =", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITNotEqualTo(String value) {
            addCriterion("CO_LIMIT <>", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITGreaterThan(String value) {
            addCriterion("CO_LIMIT >", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITGreaterThanOrEqualTo(String value) {
            addCriterion("CO_LIMIT >=", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITLessThan(String value) {
            addCriterion("CO_LIMIT <", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITLessThanOrEqualTo(String value) {
            addCriterion("CO_LIMIT <=", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITLike(String value) {
            addCriterion("CO_LIMIT like", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITNotLike(String value) {
            addCriterion("CO_LIMIT not like", value, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITIn(List<String> values) {
            addCriterion("CO_LIMIT in", values, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITNotIn(List<String> values) {
            addCriterion("CO_LIMIT not in", values, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITBetween(String value1, String value2) {
            addCriterion("CO_LIMIT between", value1, value2, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_LIMITNotBetween(String value1, String value2) {
            addCriterion("CO_LIMIT not between", value1, value2, "CO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGIsNull() {
            addCriterion("CO_JUDG is null");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGIsNotNull() {
            addCriterion("CO_JUDG is not null");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGEqualTo(Integer value) {
            addCriterion("CO_JUDG =", value, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGNotEqualTo(Integer value) {
            addCriterion("CO_JUDG <>", value, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGGreaterThan(Integer value) {
            addCriterion("CO_JUDG >", value, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGGreaterThanOrEqualTo(Integer value) {
            addCriterion("CO_JUDG >=", value, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGLessThan(Integer value) {
            addCriterion("CO_JUDG <", value, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGLessThanOrEqualTo(Integer value) {
            addCriterion("CO_JUDG <=", value, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGIn(List<Integer> values) {
            addCriterion("CO_JUDG in", values, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGNotIn(List<Integer> values) {
            addCriterion("CO_JUDG not in", values, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGBetween(Integer value1, Integer value2) {
            addCriterion("CO_JUDG between", value1, value2, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_JUDGNotBetween(Integer value1, Integer value2) {
            addCriterion("CO_JUDG not between", value1, value2, "CO_JUDG");
            return (Criteria) this;
        }

        public Criteria andHCIsNull() {
            addCriterion("HC is null");
            return (Criteria) this;
        }

        public Criteria andHCIsNotNull() {
            addCriterion("HC is not null");
            return (Criteria) this;
        }

        public Criteria andHCEqualTo(String value) {
            addCriterion("HC =", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCNotEqualTo(String value) {
            addCriterion("HC <>", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCGreaterThan(String value) {
            addCriterion("HC >", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCGreaterThanOrEqualTo(String value) {
            addCriterion("HC >=", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCLessThan(String value) {
            addCriterion("HC <", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCLessThanOrEqualTo(String value) {
            addCriterion("HC <=", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCLike(String value) {
            addCriterion("HC like", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCNotLike(String value) {
            addCriterion("HC not like", value, "HC");
            return (Criteria) this;
        }

        public Criteria andHCIn(List<String> values) {
            addCriterion("HC in", values, "HC");
            return (Criteria) this;
        }

        public Criteria andHCNotIn(List<String> values) {
            addCriterion("HC not in", values, "HC");
            return (Criteria) this;
        }

        public Criteria andHCBetween(String value1, String value2) {
            addCriterion("HC between", value1, value2, "HC");
            return (Criteria) this;
        }

        public Criteria andHCNotBetween(String value1, String value2) {
            addCriterion("HC not between", value1, value2, "HC");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITIsNull() {
            addCriterion("HC_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITIsNotNull() {
            addCriterion("HC_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITEqualTo(String value) {
            addCriterion("HC_LIMIT =", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITNotEqualTo(String value) {
            addCriterion("HC_LIMIT <>", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITGreaterThan(String value) {
            addCriterion("HC_LIMIT >", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITGreaterThanOrEqualTo(String value) {
            addCriterion("HC_LIMIT >=", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITLessThan(String value) {
            addCriterion("HC_LIMIT <", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITLessThanOrEqualTo(String value) {
            addCriterion("HC_LIMIT <=", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITLike(String value) {
            addCriterion("HC_LIMIT like", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITNotLike(String value) {
            addCriterion("HC_LIMIT not like", value, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITIn(List<String> values) {
            addCriterion("HC_LIMIT in", values, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITNotIn(List<String> values) {
            addCriterion("HC_LIMIT not in", values, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITBetween(String value1, String value2) {
            addCriterion("HC_LIMIT between", value1, value2, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_LIMITNotBetween(String value1, String value2) {
            addCriterion("HC_LIMIT not between", value1, value2, "HC_LIMIT");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGIsNull() {
            addCriterion("HC_JUDG is null");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGIsNotNull() {
            addCriterion("HC_JUDG is not null");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGEqualTo(Integer value) {
            addCriterion("HC_JUDG =", value, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGNotEqualTo(Integer value) {
            addCriterion("HC_JUDG <>", value, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGGreaterThan(Integer value) {
            addCriterion("HC_JUDG >", value, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGGreaterThanOrEqualTo(Integer value) {
            addCriterion("HC_JUDG >=", value, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGLessThan(Integer value) {
            addCriterion("HC_JUDG <", value, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGLessThanOrEqualTo(Integer value) {
            addCriterion("HC_JUDG <=", value, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGIn(List<Integer> values) {
            addCriterion("HC_JUDG in", values, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGNotIn(List<Integer> values) {
            addCriterion("HC_JUDG not in", values, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGBetween(Integer value1, Integer value2) {
            addCriterion("HC_JUDG between", value1, value2, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andHC_JUDGNotBetween(Integer value1, Integer value2) {
            addCriterion("HC_JUDG not between", value1, value2, "HC_JUDG");
            return (Criteria) this;
        }

        public Criteria andNOIsNull() {
            addCriterion("NO is null");
            return (Criteria) this;
        }

        public Criteria andNOIsNotNull() {
            addCriterion("NO is not null");
            return (Criteria) this;
        }

        public Criteria andNOEqualTo(String value) {
            addCriterion("NO =", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNONotEqualTo(String value) {
            addCriterion("NO <>", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNOGreaterThan(String value) {
            addCriterion("NO >", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNOGreaterThanOrEqualTo(String value) {
            addCriterion("NO >=", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNOLessThan(String value) {
            addCriterion("NO <", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNOLessThanOrEqualTo(String value) {
            addCriterion("NO <=", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNOLike(String value) {
            addCriterion("NO like", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNONotLike(String value) {
            addCriterion("NO not like", value, "NO");
            return (Criteria) this;
        }

        public Criteria andNOIn(List<String> values) {
            addCriterion("NO in", values, "NO");
            return (Criteria) this;
        }

        public Criteria andNONotIn(List<String> values) {
            addCriterion("NO not in", values, "NO");
            return (Criteria) this;
        }

        public Criteria andNOBetween(String value1, String value2) {
            addCriterion("NO between", value1, value2, "NO");
            return (Criteria) this;
        }

        public Criteria andNONotBetween(String value1, String value2) {
            addCriterion("NO not between", value1, value2, "NO");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITIsNull() {
            addCriterion("NO_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITIsNotNull() {
            addCriterion("NO_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITEqualTo(String value) {
            addCriterion("NO_LIMIT =", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITNotEqualTo(String value) {
            addCriterion("NO_LIMIT <>", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITGreaterThan(String value) {
            addCriterion("NO_LIMIT >", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITGreaterThanOrEqualTo(String value) {
            addCriterion("NO_LIMIT >=", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITLessThan(String value) {
            addCriterion("NO_LIMIT <", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITLessThanOrEqualTo(String value) {
            addCriterion("NO_LIMIT <=", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITLike(String value) {
            addCriterion("NO_LIMIT like", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITNotLike(String value) {
            addCriterion("NO_LIMIT not like", value, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITIn(List<String> values) {
            addCriterion("NO_LIMIT in", values, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITNotIn(List<String> values) {
            addCriterion("NO_LIMIT not in", values, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITBetween(String value1, String value2) {
            addCriterion("NO_LIMIT between", value1, value2, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_LIMITNotBetween(String value1, String value2) {
            addCriterion("NO_LIMIT not between", value1, value2, "NO_LIMIT");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGIsNull() {
            addCriterion("NO_JUDG is null");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGIsNotNull() {
            addCriterion("NO_JUDG is not null");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGEqualTo(String value) {
            addCriterion("NO_JUDG =", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGNotEqualTo(String value) {
            addCriterion("NO_JUDG <>", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGGreaterThan(String value) {
            addCriterion("NO_JUDG >", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGGreaterThanOrEqualTo(String value) {
            addCriterion("NO_JUDG >=", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGLessThan(String value) {
            addCriterion("NO_JUDG <", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGLessThanOrEqualTo(String value) {
            addCriterion("NO_JUDG <=", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGLike(String value) {
            addCriterion("NO_JUDG like", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGNotLike(String value) {
            addCriterion("NO_JUDG not like", value, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGIn(List<String> values) {
            addCriterion("NO_JUDG in", values, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGNotIn(List<String> values) {
            addCriterion("NO_JUDG not in", values, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGBetween(String value1, String value2) {
            addCriterion("NO_JUDG between", value1, value2, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andNO_JUDGNotBetween(String value1, String value2) {
            addCriterion("NO_JUDG not between", value1, value2, "NO_JUDG");
            return (Criteria) this;
        }

        public Criteria andCO_CO2IsNull() {
            addCriterion("CO_CO2 is null");
            return (Criteria) this;
        }

        public Criteria andCO_CO2IsNotNull() {
            addCriterion("CO_CO2 is not null");
            return (Criteria) this;
        }

        public Criteria andCO_CO2EqualTo(BigDecimal value) {
            addCriterion("CO_CO2 =", value, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2NotEqualTo(BigDecimal value) {
            addCriterion("CO_CO2 <>", value, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2GreaterThan(BigDecimal value) {
            addCriterion("CO_CO2 >", value, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CO_CO2 >=", value, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2LessThan(BigDecimal value) {
            addCriterion("CO_CO2 <", value, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CO_CO2 <=", value, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2In(List<BigDecimal> values) {
            addCriterion("CO_CO2 in", values, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2NotIn(List<BigDecimal> values) {
            addCriterion("CO_CO2 not in", values, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CO_CO2 between", value1, value2, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andCO_CO2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CO_CO2 not between", value1, value2, "CO_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2IsNull() {
            addCriterion("HC_CO2 is null");
            return (Criteria) this;
        }

        public Criteria andHC_CO2IsNotNull() {
            addCriterion("HC_CO2 is not null");
            return (Criteria) this;
        }

        public Criteria andHC_CO2EqualTo(BigDecimal value) {
            addCriterion("HC_CO2 =", value, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2NotEqualTo(BigDecimal value) {
            addCriterion("HC_CO2 <>", value, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2GreaterThan(BigDecimal value) {
            addCriterion("HC_CO2 >", value, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HC_CO2 >=", value, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2LessThan(BigDecimal value) {
            addCriterion("HC_CO2 <", value, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("HC_CO2 <=", value, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2In(List<BigDecimal> values) {
            addCriterion("HC_CO2 in", values, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2NotIn(List<BigDecimal> values) {
            addCriterion("HC_CO2 not in", values, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("HC_CO2 between", value1, value2, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andHC_CO2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HC_CO2 not between", value1, value2, "HC_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2IsNull() {
            addCriterion("NO_CO2 is null");
            return (Criteria) this;
        }

        public Criteria andNO_CO2IsNotNull() {
            addCriterion("NO_CO2 is not null");
            return (Criteria) this;
        }

        public Criteria andNO_CO2EqualTo(BigDecimal value) {
            addCriterion("NO_CO2 =", value, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2NotEqualTo(BigDecimal value) {
            addCriterion("NO_CO2 <>", value, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2GreaterThan(BigDecimal value) {
            addCriterion("NO_CO2 >", value, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_CO2 >=", value, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2LessThan(BigDecimal value) {
            addCriterion("NO_CO2 <", value, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_CO2 <=", value, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2In(List<BigDecimal> values) {
            addCriterion("NO_CO2 in", values, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2NotIn(List<BigDecimal> values) {
            addCriterion("NO_CO2 not in", values, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_CO2 between", value1, value2, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andNO_CO2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_CO2 not between", value1, value2, "NO_CO2");
            return (Criteria) this;
        }

        public Criteria andSMOKEIsNull() {
            addCriterion("SMOKE is null");
            return (Criteria) this;
        }

        public Criteria andSMOKEIsNotNull() {
            addCriterion("SMOKE is not null");
            return (Criteria) this;
        }

        public Criteria andSMOKEEqualTo(String value) {
            addCriterion("SMOKE =", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKENotEqualTo(String value) {
            addCriterion("SMOKE <>", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKEGreaterThan(String value) {
            addCriterion("SMOKE >", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKEGreaterThanOrEqualTo(String value) {
            addCriterion("SMOKE >=", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKELessThan(String value) {
            addCriterion("SMOKE <", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKELessThanOrEqualTo(String value) {
            addCriterion("SMOKE <=", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKELike(String value) {
            addCriterion("SMOKE like", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKENotLike(String value) {
            addCriterion("SMOKE not like", value, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKEIn(List<String> values) {
            addCriterion("SMOKE in", values, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKENotIn(List<String> values) {
            addCriterion("SMOKE not in", values, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKEBetween(String value1, String value2) {
            addCriterion("SMOKE between", value1, value2, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKENotBetween(String value1, String value2) {
            addCriterion("SMOKE not between", value1, value2, "SMOKE");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITIsNull() {
            addCriterion("SMOKE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITIsNotNull() {
            addCriterion("SMOKE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITEqualTo(String value) {
            addCriterion("SMOKE_LIMIT =", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITNotEqualTo(String value) {
            addCriterion("SMOKE_LIMIT <>", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITGreaterThan(String value) {
            addCriterion("SMOKE_LIMIT >", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITGreaterThanOrEqualTo(String value) {
            addCriterion("SMOKE_LIMIT >=", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITLessThan(String value) {
            addCriterion("SMOKE_LIMIT <", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITLessThanOrEqualTo(String value) {
            addCriterion("SMOKE_LIMIT <=", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITLike(String value) {
            addCriterion("SMOKE_LIMIT like", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITNotLike(String value) {
            addCriterion("SMOKE_LIMIT not like", value, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITIn(List<String> values) {
            addCriterion("SMOKE_LIMIT in", values, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITNotIn(List<String> values) {
            addCriterion("SMOKE_LIMIT not in", values, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITBetween(String value1, String value2) {
            addCriterion("SMOKE_LIMIT between", value1, value2, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_LIMITNotBetween(String value1, String value2) {
            addCriterion("SMOKE_LIMIT not between", value1, value2, "SMOKE_LIMIT");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGIsNull() {
            addCriterion("SMOKE_JUDG is null");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGIsNotNull() {
            addCriterion("SMOKE_JUDG is not null");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGEqualTo(Integer value) {
            addCriterion("SMOKE_JUDG =", value, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGNotEqualTo(Integer value) {
            addCriterion("SMOKE_JUDG <>", value, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGGreaterThan(Integer value) {
            addCriterion("SMOKE_JUDG >", value, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGGreaterThanOrEqualTo(Integer value) {
            addCriterion("SMOKE_JUDG >=", value, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGLessThan(Integer value) {
            addCriterion("SMOKE_JUDG <", value, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGLessThanOrEqualTo(Integer value) {
            addCriterion("SMOKE_JUDG <=", value, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGIn(List<Integer> values) {
            addCriterion("SMOKE_JUDG in", values, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGNotIn(List<Integer> values) {
            addCriterion("SMOKE_JUDG not in", values, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGBetween(Integer value1, Integer value2) {
            addCriterion("SMOKE_JUDG between", value1, value2, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andSMOKE_JUDGNotBetween(Integer value1, Integer value2) {
            addCriterion("SMOKE_JUDG not between", value1, value2, "SMOKE_JUDG");
            return (Criteria) this;
        }

        public Criteria andVSPIsNull() {
            addCriterion("VSP is null");
            return (Criteria) this;
        }

        public Criteria andVSPIsNotNull() {
            addCriterion("VSP is not null");
            return (Criteria) this;
        }

        public Criteria andVSPEqualTo(BigDecimal value) {
            addCriterion("VSP =", value, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPNotEqualTo(BigDecimal value) {
            addCriterion("VSP <>", value, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPGreaterThan(BigDecimal value) {
            addCriterion("VSP >", value, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VSP >=", value, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPLessThan(BigDecimal value) {
            addCriterion("VSP <", value, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VSP <=", value, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPIn(List<BigDecimal> values) {
            addCriterion("VSP in", values, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPNotIn(List<BigDecimal> values) {
            addCriterion("VSP not in", values, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VSP between", value1, value2, "VSP");
            return (Criteria) this;
        }

        public Criteria andVSPNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VSP not between", value1, value2, "VSP");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDIsNull() {
            addCriterion("WIND_SPEED is null");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDIsNotNull() {
            addCriterion("WIND_SPEED is not null");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDEqualTo(String value) {
            addCriterion("WIND_SPEED =", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDNotEqualTo(String value) {
            addCriterion("WIND_SPEED <>", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDGreaterThan(String value) {
            addCriterion("WIND_SPEED >", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDGreaterThanOrEqualTo(String value) {
            addCriterion("WIND_SPEED >=", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDLessThan(String value) {
            addCriterion("WIND_SPEED <", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDLessThanOrEqualTo(String value) {
            addCriterion("WIND_SPEED <=", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDLike(String value) {
            addCriterion("WIND_SPEED like", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDNotLike(String value) {
            addCriterion("WIND_SPEED not like", value, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDIn(List<String> values) {
            addCriterion("WIND_SPEED in", values, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDNotIn(List<String> values) {
            addCriterion("WIND_SPEED not in", values, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDBetween(String value1, String value2) {
            addCriterion("WIND_SPEED between", value1, value2, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_SPEEDNotBetween(String value1, String value2) {
            addCriterion("WIND_SPEED not between", value1, value2, "WIND_SPEED");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONIsNull() {
            addCriterion("WIND_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONIsNotNull() {
            addCriterion("WIND_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONEqualTo(Float value) {
            addCriterion("WIND_DIRECTION =", value, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONNotEqualTo(Float value) {
            addCriterion("WIND_DIRECTION <>", value, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONGreaterThan(Float value) {
            addCriterion("WIND_DIRECTION >", value, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONGreaterThanOrEqualTo(Float value) {
            addCriterion("WIND_DIRECTION >=", value, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONLessThan(Float value) {
            addCriterion("WIND_DIRECTION <", value, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONLessThanOrEqualTo(Float value) {
            addCriterion("WIND_DIRECTION <=", value, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONIn(List<Float> values) {
            addCriterion("WIND_DIRECTION in", values, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONNotIn(List<Float> values) {
            addCriterion("WIND_DIRECTION not in", values, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONBetween(Float value1, Float value2) {
            addCriterion("WIND_DIRECTION between", value1, value2, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andWIND_DIRECTIONNotBetween(Float value1, Float value2) {
            addCriterion("WIND_DIRECTION not between", value1, value2, "WIND_DIRECTION");
            return (Criteria) this;
        }

        public Criteria andTEMPERATUREIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTEMPERATUREIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTEMPERATUREEqualTo(String value) {
            addCriterion("TEMPERATURE =", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATURENotEqualTo(String value) {
            addCriterion("TEMPERATURE <>", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATUREGreaterThan(String value) {
            addCriterion("TEMPERATURE >", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATUREGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE >=", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATURELessThan(String value) {
            addCriterion("TEMPERATURE <", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATURELessThanOrEqualTo(String value) {
            addCriterion("TEMPERATURE <=", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATURELike(String value) {
            addCriterion("TEMPERATURE like", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATURENotLike(String value) {
            addCriterion("TEMPERATURE not like", value, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATUREIn(List<String> values) {
            addCriterion("TEMPERATURE in", values, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATURENotIn(List<String> values) {
            addCriterion("TEMPERATURE not in", values, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATUREBetween(String value1, String value2) {
            addCriterion("TEMPERATURE between", value1, value2, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andTEMPERATURENotBetween(String value1, String value2) {
            addCriterion("TEMPERATURE not between", value1, value2, "TEMPERATURE");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYIsNull() {
            addCriterion("HUMIDITY is null");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYIsNotNull() {
            addCriterion("HUMIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYEqualTo(String value) {
            addCriterion("HUMIDITY =", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYNotEqualTo(String value) {
            addCriterion("HUMIDITY <>", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYGreaterThan(String value) {
            addCriterion("HUMIDITY >", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYGreaterThanOrEqualTo(String value) {
            addCriterion("HUMIDITY >=", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYLessThan(String value) {
            addCriterion("HUMIDITY <", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYLessThanOrEqualTo(String value) {
            addCriterion("HUMIDITY <=", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYLike(String value) {
            addCriterion("HUMIDITY like", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYNotLike(String value) {
            addCriterion("HUMIDITY not like", value, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYIn(List<String> values) {
            addCriterion("HUMIDITY in", values, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYNotIn(List<String> values) {
            addCriterion("HUMIDITY not in", values, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYBetween(String value1, String value2) {
            addCriterion("HUMIDITY between", value1, value2, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andHUMIDITYNotBetween(String value1, String value2) {
            addCriterion("HUMIDITY not between", value1, value2, "HUMIDITY");
            return (Criteria) this;
        }

        public Criteria andATMOSPHEREIsNull() {
            addCriterion("ATMOSPHERE is null");
            return (Criteria) this;
        }

        public Criteria andATMOSPHEREIsNotNull() {
            addCriterion("ATMOSPHERE is not null");
            return (Criteria) this;
        }

        public Criteria andATMOSPHEREEqualTo(String value) {
            addCriterion("ATMOSPHERE =", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHERENotEqualTo(String value) {
            addCriterion("ATMOSPHERE <>", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHEREGreaterThan(String value) {
            addCriterion("ATMOSPHERE >", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHEREGreaterThanOrEqualTo(String value) {
            addCriterion("ATMOSPHERE >=", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHERELessThan(String value) {
            addCriterion("ATMOSPHERE <", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHERELessThanOrEqualTo(String value) {
            addCriterion("ATMOSPHERE <=", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHERELike(String value) {
            addCriterion("ATMOSPHERE like", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHERENotLike(String value) {
            addCriterion("ATMOSPHERE not like", value, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHEREIn(List<String> values) {
            addCriterion("ATMOSPHERE in", values, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHERENotIn(List<String> values) {
            addCriterion("ATMOSPHERE not in", values, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHEREBetween(String value1, String value2) {
            addCriterion("ATMOSPHERE between", value1, value2, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andATMOSPHERENotBetween(String value1, String value2) {
            addCriterion("ATMOSPHERE not between", value1, value2, "ATMOSPHERE");
            return (Criteria) this;
        }

        public Criteria andOACIsNull() {
            addCriterion("OAC is null");
            return (Criteria) this;
        }

        public Criteria andOACIsNotNull() {
            addCriterion("OAC is not null");
            return (Criteria) this;
        }

        public Criteria andOACEqualTo(String value) {
            addCriterion("OAC =", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACNotEqualTo(String value) {
            addCriterion("OAC <>", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACGreaterThan(String value) {
            addCriterion("OAC >", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACGreaterThanOrEqualTo(String value) {
            addCriterion("OAC >=", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACLessThan(String value) {
            addCriterion("OAC <", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACLessThanOrEqualTo(String value) {
            addCriterion("OAC <=", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACLike(String value) {
            addCriterion("OAC like", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACNotLike(String value) {
            addCriterion("OAC not like", value, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACIn(List<String> values) {
            addCriterion("OAC in", values, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACNotIn(List<String> values) {
            addCriterion("OAC not in", values, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACBetween(String value1, String value2) {
            addCriterion("OAC between", value1, value2, "OAC");
            return (Criteria) this;
        }

        public Criteria andOACNotBetween(String value1, String value2) {
            addCriterion("OAC not between", value1, value2, "OAC");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCEIsNull() {
            addCriterion("CONFIDENCE is null");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCEIsNotNull() {
            addCriterion("CONFIDENCE is not null");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCEEqualTo(String value) {
            addCriterion("CONFIDENCE =", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCENotEqualTo(String value) {
            addCriterion("CONFIDENCE <>", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCEGreaterThan(String value) {
            addCriterion("CONFIDENCE >", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCEGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIDENCE >=", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCELessThan(String value) {
            addCriterion("CONFIDENCE <", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCELessThanOrEqualTo(String value) {
            addCriterion("CONFIDENCE <=", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCELike(String value) {
            addCriterion("CONFIDENCE like", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCENotLike(String value) {
            addCriterion("CONFIDENCE not like", value, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCEIn(List<String> values) {
            addCriterion("CONFIDENCE in", values, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCENotIn(List<String> values) {
            addCriterion("CONFIDENCE not in", values, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCEBetween(String value1, String value2) {
            addCriterion("CONFIDENCE between", value1, value2, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andCONFIDENCENotBetween(String value1, String value2) {
            addCriterion("CONFIDENCE not between", value1, value2, "CONFIDENCE");
            return (Criteria) this;
        }

        public Criteria andVALIDITYIsNull() {
            addCriterion("VALIDITY is null");
            return (Criteria) this;
        }

        public Criteria andVALIDITYIsNotNull() {
            addCriterion("VALIDITY is not null");
            return (Criteria) this;
        }

        public Criteria andVALIDITYEqualTo(Integer value) {
            addCriterion("VALIDITY =", value, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYNotEqualTo(Integer value) {
            addCriterion("VALIDITY <>", value, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYGreaterThan(Integer value) {
            addCriterion("VALIDITY >", value, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYGreaterThanOrEqualTo(Integer value) {
            addCriterion("VALIDITY >=", value, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYLessThan(Integer value) {
            addCriterion("VALIDITY <", value, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYLessThanOrEqualTo(Integer value) {
            addCriterion("VALIDITY <=", value, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYIn(List<Integer> values) {
            addCriterion("VALIDITY in", values, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYNotIn(List<Integer> values) {
            addCriterion("VALIDITY not in", values, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYBetween(Integer value1, Integer value2) {
            addCriterion("VALIDITY between", value1, value2, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andVALIDITYNotBetween(Integer value1, Integer value2) {
            addCriterion("VALIDITY not between", value1, value2, "VALIDITY");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMEIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMEIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMEEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMENotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMEGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMELessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMELessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMEIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMENotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMEBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_TIMENotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "CREATED_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERIsNull() {
            addCriterion("CREATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERIsNotNull() {
            addCriterion("CREATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCREATED_USEREqualTo(String value) {
            addCriterion("CREATED_USER =", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotEqualTo(String value) {
            addCriterion("CREATED_USER <>", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERGreaterThan(String value) {
            addCriterion("CREATED_USER >", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER >=", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERLessThan(String value) {
            addCriterion("CREATED_USER <", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER <=", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERLike(String value) {
            addCriterion("CREATED_USER like", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotLike(String value) {
            addCriterion("CREATED_USER not like", value, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERIn(List<String> values) {
            addCriterion("CREATED_USER in", values, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotIn(List<String> values) {
            addCriterion("CREATED_USER not in", values, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERBetween(String value1, String value2) {
            addCriterion("CREATED_USER between", value1, value2, "CREATED_USER");
            return (Criteria) this;
        }

        public Criteria andCREATED_USERNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER not between", value1, value2, "CREATED_USER");
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