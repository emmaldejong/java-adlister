import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
    private int hitCount;
    private boolean reset;

    public void init() {
        // reset hit counter
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("<h1>Counter!</h1>");
        hitCount++;
        response.getWriter().println("<h2>Total Number of hits: " + hitCount + "</h2>");
        if(reset == true) {
            init();
        }
    }
}
