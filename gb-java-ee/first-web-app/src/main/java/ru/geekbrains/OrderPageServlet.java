package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "OrderPageServlet", urlPatterns = "/order")
public class OrderPageServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(OrderPageServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Order page");
        resp.getWriter().println("<h1>Заказ</h1>");
    }

}