package com.www.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 莫心 on 2018/8/2.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;       //记录市的名字
    private String weatherId;       //记录市的代号
    private int cityId;             //记录当前所属市的id值


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countName) {
        this.countyName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
