package by.it.academy.marusevich;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (value = "/2")
public class ServletAnnotations extends HttpServlet {
    long postCount = 0;
    long getCount = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getCount++;

        String message = "Hello Servlet! ";
        message += "Number of doGet = " + getCount + "; ";
        message += "Thread name = " + Thread.currentThread().getName() + "; ";

        resp.setContentType("text/html");
        resp.getWriter().write(message);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        postCount++;

        String message = "Hello Servlet! ";
        message += "Number of doPost = " + postCount + "; ";
        message += "Thread name = " + Thread.currentThread().getName() + "; ";

        resp.setContentType("text/html");
        resp.getWriter().write(message);
    }
}
