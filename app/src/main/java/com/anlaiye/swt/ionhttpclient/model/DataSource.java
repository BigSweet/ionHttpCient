package com.anlaiye.swt.ionhttpclient.model;

import com.anlaiye.swt.ionhttpclient.net.NetInterfaceFactory;
import com.anlaiye.swt.ionhttpclient.listener.RequestListner;
import com.anlaiye.swt.ionhttpclient.util.DataUtil;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/2
 */

public class DataSource {
    //测试
    public static void getUrl(RequestListner<AdListBean> requestListner) {
        NetInterfaceFactory.getNetInterface().doRequest(DataUtil.getUrl(), requestListner);
    }
}
