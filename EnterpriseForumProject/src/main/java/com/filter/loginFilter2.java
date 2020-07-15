package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "loginFilter2", urlPatterns = "/user/*")
public class loginFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        if (!req.getRequestURI().contains("favicon.ico")) {
            Cookie[] cookies = req.getCookies();
            if (cookies == null) {
                resp.sendRedirect("/login.html");
                return;
            }
            String uName = "";
            String uPassword = "";
            for (Cookie cookie : cookies) {
                if ("uName".equals(cookie.getName())) {
                    uName = cookie.getValue();
                }
                if ("uPassword".equals(cookie.getName())) {
                    uPassword = cookie.getValue();
                }
            }
            if (uName.equals("") || uPassword.equals("")) {
                resp.sendRedirect("/login.html");
                return;
            }
            System.out.println(session.getAttribute("uName"));
            System.out.println(session.getAttribute("uPassword"));
            if (!uName.equals(session.getAttribute("uName")) || !uPassword.equals(session.getAttribute("uPassword"))) {
                resp.sendRedirect("/login.html");
            }
            if (session.getAttribute("uName") == null || session.getAttribute("uPassword") == null) {
                resp.sendRedirect("/login.html");
                return;
            }
            chain.doFilter(req, resp);
        }else {
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {

    }
}
