package by.it.academy.marusevich;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletWebXml extends HttpServlet {
    long visitCount = 0;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        visitCount++;

        String message = "Hello Servlet! ";
        message += "Number of visits = " + visitCount + "; ";
        message += "Thread name = " + Thread.currentThread().getName() + "; ";

        resp.setContentType("text/html");
        resp.getWriter().write(message);
    }
}
