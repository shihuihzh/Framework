package com.hzh.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servelt 例子
 * Created by Zhanhao Wong on 2016/10/31.
 */
@WebServlet(name="exampleServlet", urlPatterns = "/example/servlet")
public class ExampleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("This is a Servlet Example!");

    }
}
