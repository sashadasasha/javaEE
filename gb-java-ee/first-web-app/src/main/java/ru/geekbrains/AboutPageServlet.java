package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AboutPageServlet", urlPatterns = "/about")
public class AboutPageServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(AboutPageServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("About page");
        getServletContext().getRequestDispatcher("/WEB-INF/about.jsp").forward(req, resp);
    }
}
