package com.abc.graduationproject.bean;

import java.util.ArrayList;
import java.util.List;

public class projectTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public projectTaskExample() {
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andToprojectidIsNull() {
            addCriterion("toProjectId is null");
            return (Criteria) this;
        }

        public Criteria andToprojectidIsNotNull() {
            addCriterion("toProjectId is not null");
            return (Criteria) this;
        }

        public Criteria andToprojectidEqualTo(Integer value) {
            addCriterion("toProjectId =", value, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidNotEqualTo(Integer value) {
            addCriterion("toProjectId <>", value, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidGreaterThan(Integer value) {
            addCriterion("toProjectId >", value, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("toProjectId >=", value, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidLessThan(Integer value) {
            addCriterion("toProjectId <", value, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidLessThanOrEqualTo(Integer value) {
            addCriterion("toProjectId <=", value, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidIn(List<Integer> values) {
            addCriterion("toProjectId in", values, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidNotIn(List<Integer> values) {
            addCriterion("toProjectId not in", values, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidBetween(Integer value1, Integer value2) {
            addCriterion("toProjectId between", value1, value2, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andToprojectidNotBetween(Integer value1, Integer value2) {
            addCriterion("toProjectId not between", value1, value2, "toprojectid");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceIsNull() {
            addCriterion("taskIntroduce is null");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceIsNotNull() {
            addCriterion("taskIntroduce is not null");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceEqualTo(String value) {
            addCriterion("taskIntroduce =", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceNotEqualTo(String value) {
            addCriterion("taskIntroduce <>", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceGreaterThan(String value) {
            addCriterion("taskIntroduce >", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceGreaterThanOrEqualTo(String value) {
            addCriterion("taskIntroduce >=", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceLessThan(String value) {
            addCriterion("taskIntroduce <", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceLessThanOrEqualTo(String value) {
            addCriterion("taskIntroduce <=", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceLike(String value) {
            addCriterion("taskIntroduce like", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceNotLike(String value) {
            addCriterion("taskIntroduce not like", value, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceIn(List<String> values) {
            addCriterion("taskIntroduce in", values, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceNotIn(List<String> values) {
            addCriterion("taskIntroduce not in", values, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceBetween(String value1, String value2) {
            addCriterion("taskIntroduce between", value1, value2, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andTaskintroduceNotBetween(String value1, String value2) {
            addCriterion("taskIntroduce not between", value1, value2, "taskintroduce");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberIsNull() {
            addCriterion("peopleNumber is null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberIsNotNull() {
            addCriterion("peopleNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberEqualTo(Integer value) {
            addCriterion("peopleNumber =", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberNotEqualTo(Integer value) {
            addCriterion("peopleNumber <>", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberGreaterThan(Integer value) {
            addCriterion("peopleNumber >", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("peopleNumber >=", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberLessThan(Integer value) {
            addCriterion("peopleNumber <", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberLessThanOrEqualTo(Integer value) {
            addCriterion("peopleNumber <=", value, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberIn(List<Integer> values) {
            addCriterion("peopleNumber in", values, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberNotIn(List<Integer> values) {
            addCriterion("peopleNumber not in", values, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberBetween(Integer value1, Integer value2) {
            addCriterion("peopleNumber between", value1, value2, "peoplenumber");
            return (Criteria) this;
        }

        public Criteria andPeoplenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("peopleNumber not between", value1, value2, "peoplenumber");
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