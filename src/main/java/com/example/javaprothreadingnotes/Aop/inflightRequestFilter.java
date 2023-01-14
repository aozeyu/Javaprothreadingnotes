package com.example.javaprothreadingnotes.Aop;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class inflightRequestFilter implements Filter {
    private final int maxRequests = 3;
    private AtomicInteger currentRequests = new AtomicInteger(0);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (currentRequests.get() > maxRequests) {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
            byte[] byteMessage = "Service Unavailable. Please retry after sometime..".getBytes(StandardCharsets.UTF_8);
            response.getOutputStream().write(byteMessage);
            return;
        }
        //自增并加一
        currentRequests.incrementAndGet();
        try {
            filterChain.doFilter(servletRequest,servletResponse);
        }finally {
          currentRequests.decrementAndGet();
        }

    }
}
