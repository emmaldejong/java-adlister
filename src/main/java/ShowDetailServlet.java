import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowDetailServlet", urlPatterns = "/show")
public class ShowDetailServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Ad ad = DaoFactory.getAdsDao().all().get(id - 1);
        request.setAttribute("ad", ad);
//        String back = request.getParameter("back");
//        if (back != null && back.equalsIgnoreCase("return")) {
//            response.sendRedirect("/ads/index.jsp");
//        }
        request.getRequestDispatcher("/ads/show.jsp").forward(request, response);
    }
}
