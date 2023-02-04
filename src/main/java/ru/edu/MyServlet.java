package ru.edu;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws IOException {

        PrintWriter writer = resp.getWriter();
        // Возвратить HTML-страницу
        writer.write("<html>");
        writer.write("<body>");
        writer.write("<h1> MyServlet .doGet " + new Date() + "</h1>");
        writer.write("</body>");
        writer.write("</html>");

    }
}
