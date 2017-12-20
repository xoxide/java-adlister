import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
    public class LoginServlet extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            CurrentUser user = new CurrentUser(username,password);

            if (user.isAuthorized()) {
                response.sendRedirect("profile.jsp");
            }else {
                response.sendRedirect("login");
            }
        }
}
