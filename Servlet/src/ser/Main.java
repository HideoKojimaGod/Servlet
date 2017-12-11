package ser;

import java.io.*;
import  javax.servlet.*;
import javax.servlet.http.*;

public class Main extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = "RandomNumber has generated:";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<HTML><HEAD><TITLE>");
        out.println("RandomNumber");
        out.println("</TITLE></HEAD><BODY>");
        out.println("H1" + title + "H1");
        out.println("<P>" + Math.random()*100);
        out.println("<P><a href=\"Main\">Change number</a></p>");
        out.println("</BODY></HTML>");

        out.close();

    }
}
