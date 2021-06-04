package com.yc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class NetTask implements Runnable {
    private Socket s;
    private InputStream iis;
    private OutputStream oos;

    public NetTask(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        //取出流 socket
        try{
            this.iis=this.s.getInputStream();
            this.oos=this.s.getOutputStream();
            //request功能就是解析？请求行、请求头域，请求实体。。。
            HttpServletRequest request=new HttpServletRequest(this.iis);
            request.parse();
            //为什么在response中要有一个request呢？因为响应时要知道请求中请求的资源地址
            HttpServletResponse response=new HttpServletResponse(this.oos,request);
            response.sendRedirect();

            this.s.close();//http协议，无状态
        }catch (IOException ex){

        }
    }
}
