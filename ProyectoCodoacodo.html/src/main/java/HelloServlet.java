import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "helloServlet" , value = "/hello-servlet")

public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() { message = "Hello Word!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("Text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    public void destroy() {

    }
}
