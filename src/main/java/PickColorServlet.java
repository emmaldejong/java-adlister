import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String favColor = request.getParameter("favColor");
        //grabbing the value from the color form
        request.setAttribute("favColor", favColor);
        request.getRequestDispatcher("/redirectColor.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //if they go to /pickcolor, here we are sending them to the form .jsp where they can do so
        request.getRequestDispatcher("/enterColor.jsp").forward(request, response);
    }
}
