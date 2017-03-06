package com.anlaiye.swt.ionhttpclient.convert;


import com.anlaiye.swt.ionhttpclient.exception.DataException;

/**
 * 介绍：json解析接口
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/2
 */

public interface ConvertJson<T> {

    T convert(String str) throws DataException;



}
