package com.tools;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Tools {

    public static void send(HttpServletResponse response, String message) {

        try {
            response.getWriter().write("<script>");
            response.getWriter().write("alert(\"" + message + "\");");
            response.getWriter().write("</script>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendUrl(HttpServletResponse response, String message, String url) {

        response.setCharacterEncoding("UTF-8");

        try {
            response.getWriter().write("<script>");
            response.getWriter().write("alert(\"" + message + "\");");
            response.getWriter().write("window.location.href=\"" + url + "\"");
            response.getWriter().write("</script>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reLogin(HttpServletResponse response,String message) {
        response.setCharacterEncoding("UTF-8");

        try {
            response.getWriter().write("<script>");
            response.getWriter().write("alert(\"" + message + "\");");
            response.getWriter().write("if (top.location !== self.location) {");
            response.getWriter().write("top.location.href=\"http://localhost:8080/mall/admin/login.ny\"}");
            response.getWriter().write("</script>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}