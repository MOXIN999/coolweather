package com.www.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 莫心 on 2018/8/3.
 */

public class Basic {

    /**
     * 因为JSON中的一些字段可能不太适合直接作为Java字段来命名，因此利用
     * SerializedName注解的方式来让JSON字段和Java字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
