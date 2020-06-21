package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cvoinea
 */
@WebServlet("/bmi")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String height = request.getParameter("height");
        String weight = request.getParameter("weight");

        double bmi = calculateBmi(Double.parseDouble(weight), Double.parseDouble(height));

        request.setAttribute("bmi", bmi);
        response.setHeader("BMI", String.valueOf(bmi));

        RequestDispatcher dispatcher = request.getRequestDispatcher("bmi.jsp");
        // forward the response
        dispatcher.forward(request, response);
    }

    private double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }
}
