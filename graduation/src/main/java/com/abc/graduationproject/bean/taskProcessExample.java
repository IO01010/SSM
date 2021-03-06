package com.abc.graduationproject.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class taskProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public taskProcessExample() {
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

        public Criteria andMembertaskidIsNull() {
            addCriterion("memberTaskId is null");
            return (Criteria) this;
        }

        public Criteria andMembertaskidIsNotNull() {
            addCriterion("memberTaskId is not null");
            return (Criteria) this;
        }

        public Criteria andMembertaskidEqualTo(Integer value) {
            addCriterion("memberTaskId =", value, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidNotEqualTo(Integer value) {
            addCriterion("memberTaskId <>", value, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidGreaterThan(Integer value) {
            addCriterion("memberTaskId >", value, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberTaskId >=", value, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidLessThan(Integer value) {
            addCriterion("memberTaskId <", value, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidLessThanOrEqualTo(Integer value) {
            addCriterion("memberTaskId <=", value, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidIn(List<Integer> values) {
            addCriterion("memberTaskId in", values, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidNotIn(List<Integer> values) {
            addCriterion("memberTaskId not in", values, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidBetween(Integer value1, Integer value2) {
            addCriterion("memberTaskId between", value1, value2, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andMembertaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberTaskId not between", value1, value2, "membertaskid");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("process is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("process is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("process =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("process <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("process >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("process >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("process <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("process <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("process like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("process not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("process in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("process not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("process between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("process not between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessdateIsNull() {
            addCriterion("processDate is null");
            return (Criteria) this;
        }

        public Criteria andProcessdateIsNotNull() {
            addCriterion("processDate is not null");
            return (Criteria) this;
        }

        public Criteria andProcessdateEqualTo(Date value) {
            addCriterion("processDate =", value, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateNotEqualTo(Date value) {
            addCriterion("processDate <>", value, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateGreaterThan(Date value) {
            addCriterion("processDate >", value, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateGreaterThanOrEqualTo(Date value) {
            addCriterion("processDate >=", value, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateLessThan(Date value) {
            addCriterion("processDate <", value, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateLessThanOrEqualTo(Date value) {
            addCriterion("processDate <=", value, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateIn(List<Date> values) {
            addCriterion("processDate in", values, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateNotIn(List<Date> values) {
            addCriterion("processDate not in", values, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateBetween(Date value1, Date value2) {
            addCriterion("processDate between", value1, value2, "processdate");
            return (Criteria) this;
        }

        public Criteria andProcessdateNotBetween(Date value1, Date value2) {
            addCriterion("processDate not between", value1, value2, "processdate");
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