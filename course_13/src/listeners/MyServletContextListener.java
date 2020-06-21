package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author cvoinea
 */

@WebListener("/*") // specify the path to which this listener applies
public class MyServletContextListener implements ServletContextListener {

    // called after init() and before doGet()
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.log("== MyServletContextListener --> contextInitialized() ==");
    }

    // called after destroy()
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.log("== MyServletContextListener --> contextDestroyed() ==");
    }
}
