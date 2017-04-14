package com.capitalone.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by uzh051 on 4/13/17.
 */

@WebServlet(value = "/cow")
public class DogServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello World");
        //req.getRequestDispatcher("Index.html").forward(req,resp);
        //resp.sendRedirect("Index.html");

    }
}
