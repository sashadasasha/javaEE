package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CatalogPageServlet", urlPatterns = "/catalog")
public class CatalogPageServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(CatalogPageServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Catalog page");
        resp.getWriter().println("<h1>Каталог товаров</h1>");
    }

}