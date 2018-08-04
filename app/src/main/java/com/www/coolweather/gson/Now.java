package com.www.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 莫心 on 2018/8/3.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
