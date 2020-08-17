package ru.geekbrains.errorHadler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Error404", urlPatterns = "/error404")
public class Error404 extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(Error404.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Error page 404");
        resp.getWriter().println("<h1>Ошибка! Нет такой страницы</h1>");
    }
}
