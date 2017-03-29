package com.example.administrator.binderservice;

/**
 * Created by Administrator on 2017/3/29.
 */

public interface IStudent {
    /**
     * 通过no访问name
     * @param no
     * @return
     */
    public String getNameByNumber(int no);
}
