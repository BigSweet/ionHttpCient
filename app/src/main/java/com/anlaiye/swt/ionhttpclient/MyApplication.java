package com.anlaiye.swt.ionhttpclient;

import android.app.Application;

import com.anlaiye.swt.ionhttpclient.net.IonNetInterface;
import com.anlaiye.swt.ionhttpclient.net.MyIntercept;
import com.anlaiye.swt.ionhttpclient.util.NetworkUtils;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/3
 */

public class MyApplication  extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        NetworkUtils.setContext(this);
        IonNetInterface.get().start(this);
        IonNetInterface.get().setInterceptNet(new MyIntercept());
    }
}
