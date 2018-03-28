import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NameServlet", urlPatterns = ("/name"))
public class NameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //specify where to get the information from
        req.getRequestDispatcher("/name.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //"name" has to match the name you specified as the name on the input of the form
        String name = req.getParameter("name");
        //set value in the request object
        req.setAttribute("name", name);
        //specify where to send the user
        req.getRequestDispatcher("/howdy.jsp").forward(req, resp);
    }
}
