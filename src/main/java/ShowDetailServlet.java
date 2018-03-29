import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowDetailServlet", urlPatterns = "/show")
public class ShowDetailServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));
//        Ad ad = DaoFactory.getAdsDao().findById(id);
        request.getRequestDispatcher("/ads/show.jsp").forward(request, response);
    }

}
