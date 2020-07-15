package com.filter;

import com.pojo.BbsUserInfo;
import com.service.IBbsUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebFilter(filterName = "loginFilter", urlPatterns = "/login.do")
public class loginFilter implements Filter {

    @Autowired
    IBbsUserInfoService userInfoService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if (!req.getRequestURI().contains("favicon.ico")) {
            Cookie[] cookies = req.getCookies();
            if (cookies == null) {
                chain.doFilter(req, resp);
                return;
            }
            BbsUserInfo userInfo = new BbsUserInfo();
            for (Cookie cookie : cookies) {
                if ("uName".equals(cookie.getName())) {
                    userInfo.setUName(cookie.getValue());
                }
                if ("uPassword".equals(cookie.getName())) {
                    userInfo.setUPassword(cookie.getValue());
                }
            }
            if (userInfo.getUName() == null || userInfo.getUPassword() == null) {
                chain.doFilter(req, resp);
                return;
            }
            if (userInfo.getUName().equals("") || userInfo.getUPassword().equals("")) {
                chain.doFilter(req, resp);
                return;
            }

            List<BbsUserInfo> bbsUserInfoList = userInfoService.list();
            for (int i = 0; i < bbsUserInfoList.size(); i++) {
                if (userInfo.getUName().equals(bbsUserInfoList.get(i).getUName()) && userInfo.getUPassword().equals(bbsUserInfoList.get(i).getUPassword())) {
                    userInfo = bbsUserInfoList.get(i);
                    break;
                }
            }
            if (userInfo == null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("uName")) {
                        cookies[i].setValue(null);
                    }
                    if (cookies[i].getName().equals("uPassword")) {
                        cookies[i].setValue(null);
                    }
                }
                chain.doFilter(req, resp);
                return;
            }
        }
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
