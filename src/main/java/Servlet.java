import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        PrintWriter out = resp.getWriter();
        req.setAttribute("number",result);
        RequestDispatcher rd = req.getRequestDispatcher("square");
        rd.forward(req,resp);

//        out.println(
//                "<a href='#'>Result is" + result + "</a>"
//        );

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("num3"));
        int num2 = Integer.parseInt(req.getParameter("num4"));
        int result = num1 > num2 ? num1 - num2 : num2 - num1;
        PrintWriter out = resp.getWriter();
        out.println("Result is " + result);
    }

}
