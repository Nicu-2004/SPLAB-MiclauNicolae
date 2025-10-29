package splab.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class RequestLoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("[LOG] Before request: " + req.getMethod() + " " + req.getRequestURI());
        chain.doFilter(request, response);
        System.out.println("[LOG] After request: " + req.getMethod() + " " + req.getRequestURI());
    }
}
