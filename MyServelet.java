import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            if (action.equals("shuffleArray")) {
                List<Integer> shuffledArray = ShuffleArray.shuffleArray();
                request.setAttribute("shuffledArray", shuffledArray);
            } else if (action.equals("romanToInteger")) {
                String romanNumeral = request.getParameter("romanNumeral");
                int integer = RomanToInteger.romanToInteger(romanNumeral);
                request.setAttribute("romanToIntegerResult", integer);
            } else if (action.equals("checkPangram")) {
                String inputSentence = request.getParameter("inputSentence");
                boolean isPangram = PangramCheck.isPangram(inputSentence);
                request.setAttribute("isPangramResult", isPangram);
            }
        }

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request, response);
    }
}
