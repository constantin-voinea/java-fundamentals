package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author cvoinea
 */
@WebServlet("/count")
public class ServletSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // get a reference to the session
        // HttpSessions object --> provides access to environment variables and info associated with communication between a specific client and a web app
        HttpSession session = req.getSession();

        int tempCounter = 0;
        Object counterAttribute = session.getAttribute("counter");
        if (counterAttribute != null) {
            AtomicInteger counter = (AtomicInteger) counterAttribute;
            tempCounter = counter.incrementAndGet();
        } else {
            AtomicInteger count = new AtomicInteger(0);
            session.setAttribute("counter", count);
        }

        // report the current session count
        resp.getWriter().println("Session count = " + tempCounter);
    }
}
