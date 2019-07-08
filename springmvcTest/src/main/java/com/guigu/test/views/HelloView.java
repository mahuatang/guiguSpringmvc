package com.guigu.test.views;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

@Component
public class HelloView implements View {

    @Override
    public String getContentType() {
        System.out.println("view getContentType");
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("render...");
        response.getWriter().print("hello view, time: " + new Date());
    }
}
