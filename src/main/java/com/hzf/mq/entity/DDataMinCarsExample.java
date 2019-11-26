package com.hzf.mq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DDataMinCarsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DDataMinCarsExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStation_idIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStation_idIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStation_idEqualTo(String value) {
            addCriterion("station_id =", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idNotEqualTo(String value) {
            addCriterion("station_id <>", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idGreaterThan(String value) {
            addCriterion("station_id >", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idGreaterThanOrEqualTo(String value) {
            addCriterion("station_id >=", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idLessThan(String value) {
            addCriterion("station_id <", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idLessThanOrEqualTo(String value) {
            addCriterion("station_id <=", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idLike(String value) {
            addCriterion("station_id like", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idNotLike(String value) {
            addCriterion("station_id not like", value, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idIn(List<String> values) {
            addCriterion("station_id in", values, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idNotIn(List<String> values) {
            addCriterion("station_id not in", values, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idBetween(String value1, String value2) {
            addCriterion("station_id between", value1, value2, "station_id");
            return (Criteria) this;
        }

        public Criteria andStation_idNotBetween(String value1, String value2) {
            addCriterion("station_id not between", value1, value2, "station_id");
            return (Criteria) this;
        }

        public Criteria andData_codeIsNull() {
            addCriterion("data_code is null");
            return (Criteria) this;
        }

        public Criteria andData_codeIsNotNull() {
            addCriterion("data_code is not null");
            return (Criteria) this;
        }

        public Criteria andData_codeEqualTo(String value) {
            addCriterion("data_code =", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeNotEqualTo(String value) {
            addCriterion("data_code <>", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeGreaterThan(String value) {
            addCriterion("data_code >", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeGreaterThanOrEqualTo(String value) {
            addCriterion("data_code >=", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeLessThan(String value) {
            addCriterion("data_code <", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeLessThanOrEqualTo(String value) {
            addCriterion("data_code <=", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeLike(String value) {
            addCriterion("data_code like", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeNotLike(String value) {
            addCriterion("data_code not like", value, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeIn(List<String> values) {
            addCriterion("data_code in", values, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeNotIn(List<String> values) {
            addCriterion("data_code not in", values, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeBetween(String value1, String value2) {
            addCriterion("data_code between", value1, value2, "data_code");
            return (Criteria) this;
        }

        public Criteria andData_codeNotBetween(String value1, String value2) {
            addCriterion("data_code not between", value1, value2, "data_code");
            return (Criteria) this;
        }

        public Criteria andTest_timeIsNull() {
            addCriterion("test_time is null");
            return (Criteria) this;
        }

        public Criteria andTest_timeIsNotNull() {
            addCriterion("test_time is not null");
            return (Criteria) this;
        }

        public Criteria andTest_timeEqualTo(String value) {
            addCriterion("test_time =", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeNotEqualTo(String value) {
            addCriterion("test_time <>", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeGreaterThan(String value) {
            addCriterion("test_time >", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeGreaterThanOrEqualTo(String value) {
            addCriterion("test_time >=", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeLessThan(String value) {
            addCriterion("test_time <", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeLessThanOrEqualTo(String value) {
            addCriterion("test_time <=", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeLike(String value) {
            addCriterion("test_time like", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeNotLike(String value) {
            addCriterion("test_time not like", value, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeIn(List<String> values) {
            addCriterion("test_time in", values, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeNotIn(List<String> values) {
            addCriterion("test_time not in", values, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeBetween(String value1, String value2) {
            addCriterion("test_time between", value1, value2, "test_time");
            return (Criteria) this;
        }

        public Criteria andTest_timeNotBetween(String value1, String value2) {
            addCriterion("test_time not between", value1, value2, "test_time");
            return (Criteria) this;
        }

        public Criteria andPlate_umberIsNull() {
            addCriterion("plate_umber is null");
            return (Criteria) this;
        }

        public Criteria andPlate_umberIsNotNull() {
            addCriterion("plate_umber is not null");
            return (Criteria) this;
        }

        public Criteria andPlate_umberEqualTo(String value) {
            addCriterion("plate_umber =", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberNotEqualTo(String value) {
            addCriterion("plate_umber <>", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberGreaterThan(String value) {
            addCriterion("plate_umber >", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_umber >=", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberLessThan(String value) {
            addCriterion("plate_umber <", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberLessThanOrEqualTo(String value) {
            addCriterion("plate_umber <=", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberLike(String value) {
            addCriterion("plate_umber like", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberNotLike(String value) {
            addCriterion("plate_umber not like", value, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberIn(List<String> values) {
            addCriterion("plate_umber in", values, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberNotIn(List<String> values) {
            addCriterion("plate_umber not in", values, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberBetween(String value1, String value2) {
            addCriterion("plate_umber between", value1, value2, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_umberNotBetween(String value1, String value2) {
            addCriterion("plate_umber not between", value1, value2, "plate_umber");
            return (Criteria) this;
        }

        public Criteria andPlate_colorIsNull() {
            addCriterion("plate_color is null");
            return (Criteria) this;
        }

        public Criteria andPlate_colorIsNotNull() {
            addCriterion("plate_color is not null");
            return (Criteria) this;
        }

        public Criteria andPlate_colorEqualTo(String value) {
            addCriterion("plate_color =", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorNotEqualTo(String value) {
            addCriterion("plate_color <>", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorGreaterThan(String value) {
            addCriterion("plate_color >", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorGreaterThanOrEqualTo(String value) {
            addCriterion("plate_color >=", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorLessThan(String value) {
            addCriterion("plate_color <", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorLessThanOrEqualTo(String value) {
            addCriterion("plate_color <=", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorLike(String value) {
            addCriterion("plate_color like", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorNotLike(String value) {
            addCriterion("plate_color not like", value, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorIn(List<String> values) {
            addCriterion("plate_color in", values, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorNotIn(List<String> values) {
            addCriterion("plate_color not in", values, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorBetween(String value1, String value2) {
            addCriterion("plate_color between", value1, value2, "plate_color");
            return (Criteria) this;
        }

        public Criteria andPlate_colorNotBetween(String value1, String value2) {
            addCriterion("plate_color not between", value1, value2, "plate_color");
            return (Criteria) this;
        }

        public Criteria andCar_speedIsNull() {
            addCriterion("car_speed is null");
            return (Criteria) this;
        }

        public Criteria andCar_speedIsNotNull() {
            addCriterion("car_speed is not null");
            return (Criteria) this;
        }

        public Criteria andCar_speedEqualTo(Float value) {
            addCriterion("car_speed =", value, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedNotEqualTo(Float value) {
            addCriterion("car_speed <>", value, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedGreaterThan(Float value) {
            addCriterion("car_speed >", value, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedGreaterThanOrEqualTo(Float value) {
            addCriterion("car_speed >=", value, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedLessThan(Float value) {
            addCriterion("car_speed <", value, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedLessThanOrEqualTo(Float value) {
            addCriterion("car_speed <=", value, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedIn(List<Float> values) {
            addCriterion("car_speed in", values, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedNotIn(List<Float> values) {
            addCriterion("car_speed not in", values, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedBetween(Float value1, Float value2) {
            addCriterion("car_speed between", value1, value2, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_speedNotBetween(Float value1, Float value2) {
            addCriterion("car_speed not between", value1, value2, "car_speed");
            return (Criteria) this;
        }

        public Criteria andCar_accelIsNull() {
            addCriterion("car_accel is null");
            return (Criteria) this;
        }

        public Criteria andCar_accelIsNotNull() {
            addCriterion("car_accel is not null");
            return (Criteria) this;
        }

        public Criteria andCar_accelEqualTo(Float value) {
            addCriterion("car_accel =", value, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelNotEqualTo(Float value) {
            addCriterion("car_accel <>", value, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelGreaterThan(Float value) {
            addCriterion("car_accel >", value, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelGreaterThanOrEqualTo(Float value) {
            addCriterion("car_accel >=", value, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelLessThan(Float value) {
            addCriterion("car_accel <", value, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelLessThanOrEqualTo(Float value) {
            addCriterion("car_accel <=", value, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelIn(List<Float> values) {
            addCriterion("car_accel in", values, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelNotIn(List<Float> values) {
            addCriterion("car_accel not in", values, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelBetween(Float value1, Float value2) {
            addCriterion("car_accel between", value1, value2, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_accelNotBetween(Float value1, Float value2) {
            addCriterion("car_accel not between", value1, value2, "car_accel");
            return (Criteria) this;
        }

        public Criteria andCar_vspIsNull() {
            addCriterion("car_vsp is null");
            return (Criteria) this;
        }

        public Criteria andCar_vspIsNotNull() {
            addCriterion("car_vsp is not null");
            return (Criteria) this;
        }

        public Criteria andCar_vspEqualTo(Float value) {
            addCriterion("car_vsp =", value, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspNotEqualTo(Float value) {
            addCriterion("car_vsp <>", value, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspGreaterThan(Float value) {
            addCriterion("car_vsp >", value, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspGreaterThanOrEqualTo(Float value) {
            addCriterion("car_vsp >=", value, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspLessThan(Float value) {
            addCriterion("car_vsp <", value, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspLessThanOrEqualTo(Float value) {
            addCriterion("car_vsp <=", value, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspIn(List<Float> values) {
            addCriterion("car_vsp in", values, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspNotIn(List<Float> values) {
            addCriterion("car_vsp not in", values, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspBetween(Float value1, Float value2) {
            addCriterion("car_vsp between", value1, value2, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andCar_vspNotBetween(Float value1, Float value2) {
            addCriterion("car_vsp not between", value1, value2, "car_vsp");
            return (Criteria) this;
        }

        public Criteria andNo_dataIsNull() {
            addCriterion("no_data is null");
            return (Criteria) this;
        }

        public Criteria andNo_dataIsNotNull() {
            addCriterion("no_data is not null");
            return (Criteria) this;
        }

        public Criteria andNo_dataEqualTo(Float value) {
            addCriterion("no_data =", value, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataNotEqualTo(Float value) {
            addCriterion("no_data <>", value, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataGreaterThan(Float value) {
            addCriterion("no_data >", value, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataGreaterThanOrEqualTo(Float value) {
            addCriterion("no_data >=", value, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataLessThan(Float value) {
            addCriterion("no_data <", value, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataLessThanOrEqualTo(Float value) {
            addCriterion("no_data <=", value, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataIn(List<Float> values) {
            addCriterion("no_data in", values, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataNotIn(List<Float> values) {
            addCriterion("no_data not in", values, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataBetween(Float value1, Float value2) {
            addCriterion("no_data between", value1, value2, "no_data");
            return (Criteria) this;
        }

        public Criteria andNo_dataNotBetween(Float value1, Float value2) {
            addCriterion("no_data not between", value1, value2, "no_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataIsNull() {
            addCriterion("co2_data is null");
            return (Criteria) this;
        }

        public Criteria andCo2_dataIsNotNull() {
            addCriterion("co2_data is not null");
            return (Criteria) this;
        }

        public Criteria andCo2_dataEqualTo(Float value) {
            addCriterion("co2_data =", value, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataNotEqualTo(Float value) {
            addCriterion("co2_data <>", value, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataGreaterThan(Float value) {
            addCriterion("co2_data >", value, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataGreaterThanOrEqualTo(Float value) {
            addCriterion("co2_data >=", value, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataLessThan(Float value) {
            addCriterion("co2_data <", value, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataLessThanOrEqualTo(Float value) {
            addCriterion("co2_data <=", value, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataIn(List<Float> values) {
            addCriterion("co2_data in", values, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataNotIn(List<Float> values) {
            addCriterion("co2_data not in", values, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataBetween(Float value1, Float value2) {
            addCriterion("co2_data between", value1, value2, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo2_dataNotBetween(Float value1, Float value2) {
            addCriterion("co2_data not between", value1, value2, "co2_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataIsNull() {
            addCriterion("co_data is null");
            return (Criteria) this;
        }

        public Criteria andCo_dataIsNotNull() {
            addCriterion("co_data is not null");
            return (Criteria) this;
        }

        public Criteria andCo_dataEqualTo(Float value) {
            addCriterion("co_data =", value, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataNotEqualTo(Float value) {
            addCriterion("co_data <>", value, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataGreaterThan(Float value) {
            addCriterion("co_data >", value, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataGreaterThanOrEqualTo(Float value) {
            addCriterion("co_data >=", value, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataLessThan(Float value) {
            addCriterion("co_data <", value, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataLessThanOrEqualTo(Float value) {
            addCriterion("co_data <=", value, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataIn(List<Float> values) {
            addCriterion("co_data in", values, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataNotIn(List<Float> values) {
            addCriterion("co_data not in", values, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataBetween(Float value1, Float value2) {
            addCriterion("co_data between", value1, value2, "co_data");
            return (Criteria) this;
        }

        public Criteria andCo_dataNotBetween(Float value1, Float value2) {
            addCriterion("co_data not between", value1, value2, "co_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataIsNull() {
            addCriterion("hc_data is null");
            return (Criteria) this;
        }

        public Criteria andHc_dataIsNotNull() {
            addCriterion("hc_data is not null");
            return (Criteria) this;
        }

        public Criteria andHc_dataEqualTo(Float value) {
            addCriterion("hc_data =", value, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataNotEqualTo(Float value) {
            addCriterion("hc_data <>", value, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataGreaterThan(Float value) {
            addCriterion("hc_data >", value, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataGreaterThanOrEqualTo(Float value) {
            addCriterion("hc_data >=", value, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataLessThan(Float value) {
            addCriterion("hc_data <", value, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataLessThanOrEqualTo(Float value) {
            addCriterion("hc_data <=", value, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataIn(List<Float> values) {
            addCriterion("hc_data in", values, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataNotIn(List<Float> values) {
            addCriterion("hc_data not in", values, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataBetween(Float value1, Float value2) {
            addCriterion("hc_data between", value1, value2, "hc_data");
            return (Criteria) this;
        }

        public Criteria andHc_dataNotBetween(Float value1, Float value2) {
            addCriterion("hc_data not between", value1, value2, "hc_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataIsNull() {
            addCriterion("pm_data is null");
            return (Criteria) this;
        }

        public Criteria andPm_dataIsNotNull() {
            addCriterion("pm_data is not null");
            return (Criteria) this;
        }

        public Criteria andPm_dataEqualTo(Float value) {
            addCriterion("pm_data =", value, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataNotEqualTo(Float value) {
            addCriterion("pm_data <>", value, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataGreaterThan(Float value) {
            addCriterion("pm_data >", value, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataGreaterThanOrEqualTo(Float value) {
            addCriterion("pm_data >=", value, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataLessThan(Float value) {
            addCriterion("pm_data <", value, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataLessThanOrEqualTo(Float value) {
            addCriterion("pm_data <=", value, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataIn(List<Float> values) {
            addCriterion("pm_data in", values, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataNotIn(List<Float> values) {
            addCriterion("pm_data not in", values, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataBetween(Float value1, Float value2) {
            addCriterion("pm_data between", value1, value2, "pm_data");
            return (Criteria) this;
        }

        public Criteria andPm_dataNotBetween(Float value1, Float value2) {
            addCriterion("pm_data not between", value1, value2, "pm_data");
            return (Criteria) this;
        }

        public Criteria andWind_speedIsNull() {
            addCriterion("wind_speed is null");
            return (Criteria) this;
        }

        public Criteria andWind_speedIsNotNull() {
            addCriterion("wind_speed is not null");
            return (Criteria) this;
        }

        public Criteria andWind_speedEqualTo(Float value) {
            addCriterion("wind_speed =", value, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedNotEqualTo(Float value) {
            addCriterion("wind_speed <>", value, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedGreaterThan(Float value) {
            addCriterion("wind_speed >", value, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedGreaterThanOrEqualTo(Float value) {
            addCriterion("wind_speed >=", value, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedLessThan(Float value) {
            addCriterion("wind_speed <", value, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedLessThanOrEqualTo(Float value) {
            addCriterion("wind_speed <=", value, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedIn(List<Float> values) {
            addCriterion("wind_speed in", values, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedNotIn(List<Float> values) {
            addCriterion("wind_speed not in", values, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedBetween(Float value1, Float value2) {
            addCriterion("wind_speed between", value1, value2, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_speedNotBetween(Float value1, Float value2) {
            addCriterion("wind_speed not between", value1, value2, "wind_speed");
            return (Criteria) this;
        }

        public Criteria andWind_directionIsNull() {
            addCriterion("wind_direction is null");
            return (Criteria) this;
        }

        public Criteria andWind_directionIsNotNull() {
            addCriterion("wind_direction is not null");
            return (Criteria) this;
        }

        public Criteria andWind_directionEqualTo(Float value) {
            addCriterion("wind_direction =", value, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionNotEqualTo(Float value) {
            addCriterion("wind_direction <>", value, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionGreaterThan(Float value) {
            addCriterion("wind_direction >", value, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionGreaterThanOrEqualTo(Float value) {
            addCriterion("wind_direction >=", value, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionLessThan(Float value) {
            addCriterion("wind_direction <", value, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionLessThanOrEqualTo(Float value) {
            addCriterion("wind_direction <=", value, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionIn(List<Float> values) {
            addCriterion("wind_direction in", values, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionNotIn(List<Float> values) {
            addCriterion("wind_direction not in", values, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionBetween(Float value1, Float value2) {
            addCriterion("wind_direction between", value1, value2, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andWind_directionNotBetween(Float value1, Float value2) {
            addCriterion("wind_direction not between", value1, value2, "wind_direction");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(Float value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(Float value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(Float value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(Float value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(Float value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(Float value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<Float> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<Float> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(Float value1, Float value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(Float value1, Float value2) {
            addCriterion("temp not between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andHumIsNull() {
            addCriterion("hum is null");
            return (Criteria) this;
        }

        public Criteria andHumIsNotNull() {
            addCriterion("hum is not null");
            return (Criteria) this;
        }

        public Criteria andHumEqualTo(Float value) {
            addCriterion("hum =", value, "hum");
            return (Criteria) this;
        }

        public Criteria andHumNotEqualTo(Float value) {
            addCriterion("hum <>", value, "hum");
            return (Criteria) this;
        }

        public Criteria andHumGreaterThan(Float value) {
            addCriterion("hum >", value, "hum");
            return (Criteria) this;
        }

        public Criteria andHumGreaterThanOrEqualTo(Float value) {
            addCriterion("hum >=", value, "hum");
            return (Criteria) this;
        }

        public Criteria andHumLessThan(Float value) {
            addCriterion("hum <", value, "hum");
            return (Criteria) this;
        }

        public Criteria andHumLessThanOrEqualTo(Float value) {
            addCriterion("hum <=", value, "hum");
            return (Criteria) this;
        }

        public Criteria andHumIn(List<Float> values) {
            addCriterion("hum in", values, "hum");
            return (Criteria) this;
        }

        public Criteria andHumNotIn(List<Float> values) {
            addCriterion("hum not in", values, "hum");
            return (Criteria) this;
        }

        public Criteria andHumBetween(Float value1, Float value2) {
            addCriterion("hum between", value1, value2, "hum");
            return (Criteria) this;
        }

        public Criteria andHumNotBetween(Float value1, Float value2) {
            addCriterion("hum not between", value1, value2, "hum");
            return (Criteria) this;
        }

        public Criteria andPressureIsNull() {
            addCriterion("pressure is null");
            return (Criteria) this;
        }

        public Criteria andPressureIsNotNull() {
            addCriterion("pressure is not null");
            return (Criteria) this;
        }

        public Criteria andPressureEqualTo(Float value) {
            addCriterion("pressure =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(Float value) {
            addCriterion("pressure <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(Float value) {
            addCriterion("pressure >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(Float value) {
            addCriterion("pressure >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(Float value) {
            addCriterion("pressure <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(Float value) {
            addCriterion("pressure <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<Float> values) {
            addCriterion("pressure in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<Float> values) {
            addCriterion("pressure not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(Float value1, Float value2) {
            addCriterion("pressure between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(Float value1, Float value2) {
            addCriterion("pressure not between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andTest_addressIsNull() {
            addCriterion("test_address is null");
            return (Criteria) this;
        }

        public Criteria andTest_addressIsNotNull() {
            addCriterion("test_address is not null");
            return (Criteria) this;
        }

        public Criteria andTest_addressEqualTo(String value) {
            addCriterion("test_address =", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressNotEqualTo(String value) {
            addCriterion("test_address <>", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressGreaterThan(String value) {
            addCriterion("test_address >", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressGreaterThanOrEqualTo(String value) {
            addCriterion("test_address >=", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressLessThan(String value) {
            addCriterion("test_address <", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressLessThanOrEqualTo(String value) {
            addCriterion("test_address <=", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressLike(String value) {
            addCriterion("test_address like", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressNotLike(String value) {
            addCriterion("test_address not like", value, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressIn(List<String> values) {
            addCriterion("test_address in", values, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressNotIn(List<String> values) {
            addCriterion("test_address not in", values, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressBetween(String value1, String value2) {
            addCriterion("test_address between", value1, value2, "test_address");
            return (Criteria) this;
        }

        public Criteria andTest_addressNotBetween(String value1, String value2) {
            addCriterion("test_address not between", value1, value2, "test_address");
            return (Criteria) this;
        }

        public Criteria andRoad_wayIsNull() {
            addCriterion("road_way is null");
            return (Criteria) this;
        }

        public Criteria andRoad_wayIsNotNull() {
            addCriterion("road_way is not null");
            return (Criteria) this;
        }

        public Criteria andRoad_wayEqualTo(String value) {
            addCriterion("road_way =", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayNotEqualTo(String value) {
            addCriterion("road_way <>", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayGreaterThan(String value) {
            addCriterion("road_way >", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayGreaterThanOrEqualTo(String value) {
            addCriterion("road_way >=", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayLessThan(String value) {
            addCriterion("road_way <", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayLessThanOrEqualTo(String value) {
            addCriterion("road_way <=", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayLike(String value) {
            addCriterion("road_way like", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayNotLike(String value) {
            addCriterion("road_way not like", value, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayIn(List<String> values) {
            addCriterion("road_way in", values, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayNotIn(List<String> values) {
            addCriterion("road_way not in", values, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayBetween(String value1, String value2) {
            addCriterion("road_way between", value1, value2, "road_way");
            return (Criteria) this;
        }

        public Criteria andRoad_wayNotBetween(String value1, String value2) {
            addCriterion("road_way not between", value1, value2, "road_way");
            return (Criteria) this;
        }

        public Criteria andTest_resultIsNull() {
            addCriterion("test_result is null");
            return (Criteria) this;
        }

        public Criteria andTest_resultIsNotNull() {
            addCriterion("test_result is not null");
            return (Criteria) this;
        }

        public Criteria andTest_resultEqualTo(String value) {
            addCriterion("test_result =", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultNotEqualTo(String value) {
            addCriterion("test_result <>", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultGreaterThan(String value) {
            addCriterion("test_result >", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultGreaterThanOrEqualTo(String value) {
            addCriterion("test_result >=", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultLessThan(String value) {
            addCriterion("test_result <", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultLessThanOrEqualTo(String value) {
            addCriterion("test_result <=", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultLike(String value) {
            addCriterion("test_result like", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultNotLike(String value) {
            addCriterion("test_result not like", value, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultIn(List<String> values) {
            addCriterion("test_result in", values, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultNotIn(List<String> values) {
            addCriterion("test_result not in", values, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultBetween(String value1, String value2) {
            addCriterion("test_result between", value1, value2, "test_result");
            return (Criteria) this;
        }

        public Criteria andTest_resultNotBetween(String value1, String value2) {
            addCriterion("test_result not between", value1, value2, "test_result");
            return (Criteria) this;
        }

        public Criteria andIs_blackIsNull() {
            addCriterion("is_black is null");
            return (Criteria) this;
        }

        public Criteria andIs_blackIsNotNull() {
            addCriterion("is_black is not null");
            return (Criteria) this;
        }

        public Criteria andIs_blackEqualTo(String value) {
            addCriterion("is_black =", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackNotEqualTo(String value) {
            addCriterion("is_black <>", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackGreaterThan(String value) {
            addCriterion("is_black >", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackGreaterThanOrEqualTo(String value) {
            addCriterion("is_black >=", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackLessThan(String value) {
            addCriterion("is_black <", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackLessThanOrEqualTo(String value) {
            addCriterion("is_black <=", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackLike(String value) {
            addCriterion("is_black like", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackNotLike(String value) {
            addCriterion("is_black not like", value, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackIn(List<String> values) {
            addCriterion("is_black in", values, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackNotIn(List<String> values) {
            addCriterion("is_black not in", values, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackBetween(String value1, String value2) {
            addCriterion("is_black between", value1, value2, "is_black");
            return (Criteria) this;
        }

        public Criteria andIs_blackNotBetween(String value1, String value2) {
            addCriterion("is_black not between", value1, value2, "is_black");
            return (Criteria) this;
        }

        public Criteria andCar_typeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCar_typeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCar_typeEqualTo(String value) {
            addCriterion("car_type =", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeGreaterThan(String value) {
            addCriterion("car_type >", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeLessThan(String value) {
            addCriterion("car_type <", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeLike(String value) {
            addCriterion("car_type like", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeNotLike(String value) {
            addCriterion("car_type not like", value, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeIn(List<String> values) {
            addCriterion("car_type in", values, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "car_type");
            return (Criteria) this;
        }

        public Criteria andCar_typeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "car_type");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreated_atIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_atEqualTo(Date value) {
            addCriterion("created_at =", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThan(Date value) {
            addCriterion("created_at >", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThan(Date value) {
            addCriterion("created_at <", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atIn(List<Date> values) {
            addCriterion("created_at in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andCreated_atNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "created_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdated_atEqualTo(Date value) {
            addCriterion("updated_at =", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThan(Date value) {
            addCriterion("updated_at <", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atIn(List<Date> values) {
            addCriterion("updated_at in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andUpdated_atNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updated_at");
            return (Criteria) this;
        }

        public Criteria andPicture_urlIsNull() {
            addCriterion("picture_url is null");
            return (Criteria) this;
        }

        public Criteria andPicture_urlIsNotNull() {
            addCriterion("picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicture_urlEqualTo(String value) {
            addCriterion("picture_url =", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotEqualTo(String value) {
            addCriterion("picture_url <>", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlGreaterThan(String value) {
            addCriterion("picture_url >", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlGreaterThanOrEqualTo(String value) {
            addCriterion("picture_url >=", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlLessThan(String value) {
            addCriterion("picture_url <", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlLessThanOrEqualTo(String value) {
            addCriterion("picture_url <=", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlLike(String value) {
            addCriterion("picture_url like", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotLike(String value) {
            addCriterion("picture_url not like", value, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlIn(List<String> values) {
            addCriterion("picture_url in", values, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotIn(List<String> values) {
            addCriterion("picture_url not in", values, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlBetween(String value1, String value2) {
            addCriterion("picture_url between", value1, value2, "picture_url");
            return (Criteria) this;
        }

        public Criteria andPicture_urlNotBetween(String value1, String value2) {
            addCriterion("picture_url not between", value1, value2, "picture_url");
            return (Criteria) this;
        }

        public Criteria andTele_timesIsNull() {
            addCriterion("tele_times is null");
            return (Criteria) this;
        }

        public Criteria andTele_timesIsNotNull() {
            addCriterion("tele_times is not null");
            return (Criteria) this;
        }

        public Criteria andTele_timesEqualTo(String value) {
            addCriterion("tele_times =", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesNotEqualTo(String value) {
            addCriterion("tele_times <>", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesGreaterThan(String value) {
            addCriterion("tele_times >", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesGreaterThanOrEqualTo(String value) {
            addCriterion("tele_times >=", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesLessThan(String value) {
            addCriterion("tele_times <", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesLessThanOrEqualTo(String value) {
            addCriterion("tele_times <=", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesLike(String value) {
            addCriterion("tele_times like", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesNotLike(String value) {
            addCriterion("tele_times not like", value, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesIn(List<String> values) {
            addCriterion("tele_times in", values, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesNotIn(List<String> values) {
            addCriterion("tele_times not in", values, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesBetween(String value1, String value2) {
            addCriterion("tele_times between", value1, value2, "tele_times");
            return (Criteria) this;
        }

        public Criteria andTele_timesNotBetween(String value1, String value2) {
            addCriterion("tele_times not between", value1, value2, "tele_times");
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