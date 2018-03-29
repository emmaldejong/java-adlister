import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuesGameServlet", urlPatterns = "/guess")
public class GuesGameServlet extends HttpServlet {
    private int correctGuess = 19;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guess = Integer.parseInt(request.getParameter("guess"));
        request.setAttribute("guess", guess);

        String message;

        if(guess == correctGuess) {
            message = "You guessed " + guess + ", which is correct!";
        } else if (guess > correctGuess) {
            message = "You guessed " + guess + " but that was too high!";
        } else {
            message = "You guessed " + guess + " but that was too low!";
        }

        String again = request.getParameter("again");
        if (again != null && again.equalsIgnoreCase("again")) {
            response.sendRedirect("/enterNumber.jsp");
        }
        request.setAttribute("message", message);
        request.getRequestDispatcher("/guessRedirect.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/enterNumber.jsp").forward(request, response);
    }
}
