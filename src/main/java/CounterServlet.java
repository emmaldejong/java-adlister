import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
    private int hitCount;

    public void init() {
        // reset hit counter
        hitCount = 0;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>Counter!</h1>");
        response.getWriter().println("<h2>Total Number of hits: " + hitCount + "</h2>");
        String reset = request.getParameter("reset");
        if (reset != null && reset.equalsIgnoreCase("reset")) {
            hitCount = 0;
        } else {
            hitCount++;
        }
        response.getWriter().println("<form>");
        response.getWriter().println("<input name = 'reset' value='Reset' type='submit'>");
        response.getWriter().println("</form>");
    }
}
