import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Show")
public class ShowCookie extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter out = response.getWriter();
        String title = "Show Cookies Example";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n");

        if (cookies != null) {
            out.println("<h2> Found Cookies Name and Value</h2>");
            for (Cookie c :
                    cookies) {
                out.print("Name : " + c.getName() + ",  ");
                out.print("Value: " + c.getValue() + " <br/>");
            }
        }
    }
}
