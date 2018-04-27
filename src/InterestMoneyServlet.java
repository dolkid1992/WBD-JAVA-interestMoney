import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InterestMoneyServlet" ,urlPatterns = "/interestMoney")
public class InterestMoneyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float money = Float.parseFloat(request.getParameter("numberMoney"));
        float rate = Float.parseFloat(request.getParameter("rate"));
        float month = Float.parseFloat(request.getParameter("month"));

        float interestMoney = money + ((money*(rate/100))*month);

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Money: " + money+ "</h1>");
        writer.println("<h1>Rate: " + rate+ "</h1>");
        writer.println("<h1>Month: " + month+ "</h1>");
        writer.println("<h1>Interest Money: " + interestMoney+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
