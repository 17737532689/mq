package com.hzf.mq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DAttachmentResExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DAttachmentResExample() {
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

        public Criteria andRES_IDIsNull() {
            addCriterion("RES_ID is null");
            return (Criteria) this;
        }

        public Criteria andRES_IDIsNotNull() {
            addCriterion("RES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRES_IDEqualTo(Integer value) {
            addCriterion("RES_ID =", value, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDNotEqualTo(Integer value) {
            addCriterion("RES_ID <>", value, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDGreaterThan(Integer value) {
            addCriterion("RES_ID >", value, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("RES_ID >=", value, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDLessThan(Integer value) {
            addCriterion("RES_ID <", value, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDLessThanOrEqualTo(Integer value) {
            addCriterion("RES_ID <=", value, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDIn(List<Integer> values) {
            addCriterion("RES_ID in", values, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDNotIn(List<Integer> values) {
            addCriterion("RES_ID not in", values, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDBetween(Integer value1, Integer value2) {
            addCriterion("RES_ID between", value1, value2, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andRES_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("RES_ID not between", value1, value2, "RES_ID");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTYPEEqualTo(Integer value) {
            addCriterion("TYPE =", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThan(Integer value) {
            addCriterion("TYPE <", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEIn(List<Integer> values) {
            addCriterion("TYPE in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHIsNull() {
            addCriterion("FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHIsNotNull() {
            addCriterion("FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHEqualTo(String value) {
            addCriterion("FILE_PATH =", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHNotEqualTo(String value) {
            addCriterion("FILE_PATH <>", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHGreaterThan(String value) {
            addCriterion("FILE_PATH >", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_PATH >=", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHLessThan(String value) {
            addCriterion("FILE_PATH <", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHLessThanOrEqualTo(String value) {
            addCriterion("FILE_PATH <=", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHLike(String value) {
            addCriterion("FILE_PATH like", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHNotLike(String value) {
            addCriterion("FILE_PATH not like", value, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHIn(List<String> values) {
            addCriterion("FILE_PATH in", values, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHNotIn(List<String> values) {
            addCriterion("FILE_PATH not in", values, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHBetween(String value1, String value2) {
            addCriterion("FILE_PATH between", value1, value2, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andFILE_PATHNotBetween(String value1, String value2) {
            addCriterion("FILE_PATH not between", value1, value2, "FILE_PATH");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONIsNull() {
            addCriterion("EXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONIsNotNull() {
            addCriterion("EXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONEqualTo(String value) {
            addCriterion("EXTENSION =", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotEqualTo(String value) {
            addCriterion("EXTENSION <>", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONGreaterThan(String value) {
            addCriterion("EXTENSION >", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONGreaterThanOrEqualTo(String value) {
            addCriterion("EXTENSION >=", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONLessThan(String value) {
            addCriterion("EXTENSION <", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONLessThanOrEqualTo(String value) {
            addCriterion("EXTENSION <=", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONLike(String value) {
            addCriterion("EXTENSION like", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotLike(String value) {
            addCriterion("EXTENSION not like", value, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONIn(List<String> values) {
            addCriterion("EXTENSION in", values, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotIn(List<String> values) {
            addCriterion("EXTENSION not in", values, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONBetween(String value1, String value2) {
            addCriterion("EXTENSION between", value1, value2, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andEXTENSIONNotBetween(String value1, String value2) {
            addCriterion("EXTENSION not between", value1, value2, "EXTENSION");
            return (Criteria) this;
        }

        public Criteria andSIZEIsNull() {
            addCriterion("SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSIZEIsNotNull() {
            addCriterion("SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSIZEEqualTo(String value) {
            addCriterion("SIZE =", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZENotEqualTo(String value) {
            addCriterion("SIZE <>", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZEGreaterThan(String value) {
            addCriterion("SIZE >", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZEGreaterThanOrEqualTo(String value) {
            addCriterion("SIZE >=", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZELessThan(String value) {
            addCriterion("SIZE <", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZELessThanOrEqualTo(String value) {
            addCriterion("SIZE <=", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZELike(String value) {
            addCriterion("SIZE like", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZENotLike(String value) {
            addCriterion("SIZE not like", value, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZEIn(List<String> values) {
            addCriterion("SIZE in", values, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZENotIn(List<String> values) {
            addCriterion("SIZE not in", values, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZEBetween(String value1, String value2) {
            addCriterion("SIZE between", value1, value2, "SIZE");
            return (Criteria) this;
        }

        public Criteria andSIZENotBetween(String value1, String value2) {
            addCriterion("SIZE not between", value1, value2, "SIZE");
            return (Criteria) this;
        }

        public Criteria andMD5IsNull() {
            addCriterion("MD5 is null");
            return (Criteria) this;
        }

        public Criteria andMD5IsNotNull() {
            addCriterion("MD5 is not null");
            return (Criteria) this;
        }

        public Criteria andMD5EqualTo(String value) {
            addCriterion("MD5 =", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5NotEqualTo(String value) {
            addCriterion("MD5 <>", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5GreaterThan(String value) {
            addCriterion("MD5 >", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5GreaterThanOrEqualTo(String value) {
            addCriterion("MD5 >=", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5LessThan(String value) {
            addCriterion("MD5 <", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5LessThanOrEqualTo(String value) {
            addCriterion("MD5 <=", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5Like(String value) {
            addCriterion("MD5 like", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5NotLike(String value) {
            addCriterion("MD5 not like", value, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5In(List<String> values) {
            addCriterion("MD5 in", values, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5NotIn(List<String> values) {
            addCriterion("MD5 not in", values, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5Between(String value1, String value2) {
            addCriterion("MD5 between", value1, value2, "MD5");
            return (Criteria) this;
        }

        public Criteria andMD5NotBetween(String value1, String value2) {
            addCriterion("MD5 not between", value1, value2, "MD5");
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

        public Criteria andUPDATED_USERIsNull() {
            addCriterion("UPDATED_USER is null");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERIsNotNull() {
            addCriterion("UPDATED_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USEREqualTo(String value) {
            addCriterion("UPDATED_USER =", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERNotEqualTo(String value) {
            addCriterion("UPDATED_USER <>", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERGreaterThan(String value) {
            addCriterion("UPDATED_USER >", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER >=", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERLessThan(String value) {
            addCriterion("UPDATED_USER <", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER <=", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERLike(String value) {
            addCriterion("UPDATED_USER like", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERNotLike(String value) {
            addCriterion("UPDATED_USER not like", value, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERIn(List<String> values) {
            addCriterion("UPDATED_USER in", values, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERNotIn(List<String> values) {
            addCriterion("UPDATED_USER not in", values, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERBetween(String value1, String value2) {
            addCriterion("UPDATED_USER between", value1, value2, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_USERNotBetween(String value1, String value2) {
            addCriterion("UPDATED_USER not between", value1, value2, "UPDATED_USER");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMEIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMEIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMEEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMENotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMEGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMELessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMELessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMEIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMENotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMEBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "UPDATED_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATED_TIMENotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "UPDATED_TIME");
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