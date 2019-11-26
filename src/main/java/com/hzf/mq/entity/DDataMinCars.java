package com.hzf.mq.entity;

import java.util.Date;

public class DDataMinCars {
    private Integer id;

    private String station_id;

    private String data_code;

    private String test_time;

    private String plate_umber;

    private String plate_color;

    private Float car_speed;

    private Float car_accel;

    private Float car_vsp;

    private Float no_data;

    private Float co2_data;

    private Float co_data;

    private Float hc_data;

    private Float pm_data;

    private Float wind_speed;

    private Float wind_direction;

    private Float temp;

    private Float hum;

    private Float pressure;

    private String test_address;

    private String road_way;

    private String test_result;

    private String is_black;

    private String car_type;

    private Date created_at;

    private Date updated_at;

    private String picture_url;

    private String tele_times;

    private String car_picture;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStation_id() {
        return station_id;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id == null ? null : station_id.trim();
    }

    public String getData_code() {
        return data_code;
    }

    public void setData_code(String data_code) {
        this.data_code = data_code == null ? null : data_code.trim();
    }

    public String getTest_time() {
        return test_time;
    }

    public void setTest_time(String test_time) {
        this.test_time = test_time == null ? null : test_time.trim();
    }

    public String getPlate_umber() {
        return plate_umber;
    }

    public void setPlate_umber(String plate_umber) {
        this.plate_umber = plate_umber == null ? null : plate_umber.trim();
    }

    public String getPlate_color() {
        return plate_color;
    }

    public void setPlate_color(String plate_color) {
        this.plate_color = plate_color == null ? null : plate_color.trim();
    }

    public Float getCar_speed() {
        return car_speed;
    }

    public void setCar_speed(Float car_speed) {
        this.car_speed = car_speed;
    }

    public Float getCar_accel() {
        return car_accel;
    }

    public void setCar_accel(Float car_accel) {
        this.car_accel = car_accel;
    }

    public Float getCar_vsp() {
        return car_vsp;
    }

    public void setCar_vsp(Float car_vsp) {
        this.car_vsp = car_vsp;
    }

    public Float getNo_data() {
        return no_data;
    }

    public void setNo_data(Float no_data) {
        this.no_data = no_data;
    }

    public Float getCo2_data() {
        return co2_data;
    }

    public void setCo2_data(Float co2_data) {
        this.co2_data = co2_data;
    }

    public Float getCo_data() {
        return co_data;
    }

    public void setCo_data(Float co_data) {
        this.co_data = co_data;
    }

    public Float getHc_data() {
        return hc_data;
    }

    public void setHc_data(Float hc_data) {
        this.hc_data = hc_data;
    }

    public Float getPm_data() {
        return pm_data;
    }

    public void setPm_data(Float pm_data) {
        this.pm_data = pm_data;
    }

    public Float getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(Float wind_speed) {
        this.wind_speed = wind_speed;
    }

    public Float getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(Float wind_direction) {
        this.wind_direction = wind_direction;
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getHum() {
        return hum;
    }

    public void setHum(Float hum) {
        this.hum = hum;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public String getTest_address() {
        return test_address;
    }

    public void setTest_address(String test_address) {
        this.test_address = test_address == null ? null : test_address.trim();
    }

    public String getRoad_way() {
        return road_way;
    }

    public void setRoad_way(String road_way) {
        this.road_way = road_way == null ? null : road_way.trim();
    }

    public String getTest_result() {
        return test_result;
    }

    public void setTest_result(String test_result) {
        this.test_result = test_result == null ? null : test_result.trim();
    }

    public String getIs_black() {
        return is_black;
    }

    public void setIs_black(String is_black) {
        this.is_black = is_black == null ? null : is_black.trim();
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type == null ? null : car_type.trim();
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url == null ? null : picture_url.trim();
    }

    public String getTele_times() {
        return tele_times;
    }

    public void setTele_times(String tele_times) {
        this.tele_times = tele_times == null ? null : tele_times.trim();
    }

    public String getCar_picture() {
        return car_picture;
    }

    public void setCar_picture(String car_picture) {
        this.car_picture = car_picture == null ? null : car_picture.trim();
    }

    @Override
    public String toString() {
        return "DDataMinCars{" +
                "id=" + id +
                ", station_id='" + station_id + '\'' +
                ", data_code='" + data_code + '\'' +
                ", test_time='" + test_time + '\'' +
                ", plate_umber='" + plate_umber + '\'' +
                ", plate_color='" + plate_color + '\'' +
                ", car_speed=" + car_speed +
                ", car_accel=" + car_accel +
                ", car_vsp=" + car_vsp +
                ", no_data=" + no_data +
                ", co2_data=" + co2_data +
                ", co_data=" + co_data +
                ", hc_data=" + hc_data +
                ", pm_data=" + pm_data +
                ", wind_speed=" + wind_speed +
                ", wind_direction=" + wind_direction +
                ", temp=" + temp +
                ", hum=" + hum +
                ", pressure=" + pressure +
                ", test_address='" + test_address + '\'' +
                ", road_way='" + road_way + '\'' +
                ", test_result='" + test_result + '\'' +
                ", is_black='" + is_black + '\'' +
                ", car_type='" + car_type + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", picture_url='" + picture_url + '\'' +
                ", tele_times='" + tele_times + '\'' +
                ", car_picture='" + car_picture + '\'' +
                '}';
    }
}