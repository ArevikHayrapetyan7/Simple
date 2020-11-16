// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Delete")
public class DeleteCookies extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        Cookie[] cookies = null;

        // Get an array of Cookies associated with this domain
        cookies = request.getCookies();

        // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Deleting cookies Example";
        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " +
                        "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" );

        if( cookies != null ) {
            out.println("<h2> </h2>");

            for (int i = 0; i < cookies.length; i++) {
                if ((cookies[i].getName()).compareTo("first_name") == 0) {
                    cookies[i].setMaxAge(0);
                    response.addCookie(cookies[i]);
                }
            }

                out.print("Name : " + request.getCookies().length);

        }else {
            out.println("<h2>No cookies founds</h2>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
