package com.www.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 莫心 on 2018/8/2.
 */

public class HttpUtil {

    //和服务器的交互来获取全国所有省市县的数据
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        //创建一个OkHttpClient的实例
        OkHttpClient client = new OkHttpClient();
        //若想发起一条HTTP的请求，则创建一个Request的对象，并通过url()方法来设置目标网络的地址
        Request request = new Request.Builder().url(address).build();
        //注册一个回调来处理服务器响应
        client.newCall(request).enqueue(callback);
    }

}
