package com.yc;

import java.io.InputStream;

/**
 * @program: httpserver
 * @description:
 * @author: 作者
 * @create: 2021-03-09 19:24
 */
public class HttpServletRequest {
    private InputStream iis;
    private String  method;
    //..
    public HttpServletRequest(InputStream iis){
        this.iis=iis;
    }
    public void parse(){
        //在这个方法中解析出method
        //请求行，请求头域，实体。。参数
    }
    public String  getMethod(){
        return this.method;
    }
}
