package com.yc;

import java.io.OutputStream;

/**
 * @program: httpserver
 * @description:
 * @author: 作者
 * @create: 2021-03-09 19:24
 */
public class HttpServletResponse {
    private OutputStream oos;
    private HttpServletRequest request;

    public HttpServletResponse(OutputStream oos, HttpServletRequest request) {
        this.oos=oos;
        this.request=request;
    }

    public void sendRedirect() {
    }
}

