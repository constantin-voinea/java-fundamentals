package filters;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author cvoinea
 * filter types examples: authentication, data compression, logging, tokenizing, encryption, validation
 */

@WebFilter("/*") //specify the path to which this filter applies
public class MyFilter extends HttpFilter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // code to execute before servlet - can modify request before reaching to servlet
        PrintWriter out = response.getWriter();
        out.println("filter before servlet execution: " + this.getFilterName());

        chain.doFilter(request, response); // sends request to next resource

        // code to execute after servlet - can modify response
        out.println("filter after servlet execution: " + this.getFilterName());

    }
}
