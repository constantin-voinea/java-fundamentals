package servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author cvoinea
 * servlet = a java class that extends HttpServlet class
 * programming model:  input stream --> servlet --> output stream
 * javax.servletGenericServlet -> generic servlet, abstract class
 * httpservlet -> handles http requests and responses
 * -> can be extended by developers
 * <p>
 * Tomcat = open source web server and servlet container
 * Catalina = Tomcat servlet container
 */

@WebServlet("/hi")
public class HelloWorldServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // get a reference to the servlet context -- interface between servlet and servlet container (Catalina)
        ServletContext context = req.getServletContext();

        int tempCounter = 0;
        Object counterAttribute = context.getAttribute("counter");
        if (counterAttribute != null) {
            AtomicInteger counter = (AtomicInteger) counterAttribute;
            tempCounter = counter.incrementAndGet();
        } else {
            AtomicInteger count = new AtomicInteger(0);
            context.setAttribute("counter", count);
        }

        String name = req.getParameter("name");
        Locale locale = req.getLocale();
        String languageTag = locale.toLanguageTag().substring(0, 2);

        String greeting;
        switch (languageTag) {
            case "fr": {
                greeting = "Bonjour, ";
                break;
            }
            case "de": {
                greeting = "Guten Tag, ";
                break;
            }
            case "en": {
                greeting = "Hello, ";
                break;
            }
            default: {
                greeting = "Salut, ";
                languageTag = "ro";
            }
        }

        resp.setHeader("Content-Language", languageTag);
        resp.getWriter().println(greeting + (name != null ? name : "") + "!");
        resp.getWriter().println("servlet count = " + tempCounter);
    }
}
