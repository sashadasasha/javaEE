package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MenuServlet", urlPatterns = "/menu_servlet")
public class MenuServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(MenuServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("menu");
        resp.getWriter().println("<menu>" +
                "<li><a href='" + req.getContextPath() + "/main'>Главная</a></li>" +
                "<li><a href='" + req.getContextPath() + "/catalog'>Каталог</a></li>" +
                "<li><a href='" + req.getContextPath() + "/product'>Продукт</a></li>" +
                "<li><a href='" + req.getContextPath() + "/cart'>Корзина</a></li>" +
                "<li><a href='" + req.getContextPath() + "/order'>Заказ</a></li>" +
                "</menu>");
    }
}
