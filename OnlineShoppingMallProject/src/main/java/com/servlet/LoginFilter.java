package com.servlet;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@Order(1)
@WebFilter(filterName = "loginFilter", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "URL", value = "http://localhost:8080")
})
public class LoginFilter implements Filter {

    private String url;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.url = filterConfig.getInitParameter("URL");
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}