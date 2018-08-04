package com.www.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 莫心 on 2018/8/3.
 */

/**
 * 创建一个总的实体类来引用gson包中的各个实体类，则在gson包中创建一个Weather类
 */
public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
