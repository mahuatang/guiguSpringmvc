package com.guigu.test.handlers;

import com.guigu.test.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.util.Date;
import java.util.Map;

@SessionAttributes(value = {"user"}, types = {String.class})
@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
    private static final String SUCCESS = "success";

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("testRedirect");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/testView")
    public String testView(){
        System.out.println("testView");
        return "helloView";
    }

    @RequestMapping("/testViewAndViewResolver")
    public String testViewAndViewResolver() {
        System.out.println("testViewAndViewResolver");
        return SUCCESS;
    }

    @ModelAttribute
    public void getUser(@RequestParam(value="id",required=false) Integer id,
                        Map<String, Object> map){
        System.out.println("modelAttribute method");
        if(id != null){
            //模拟从数据库中获取对象
            User user = new User(1, "Tom", "123456", "tom@atguigu.com", 12);
            System.out.println("从数据库中获取一个对象: " + user);

            map.put("user", user);
        }
    }

    @RequestMapping(value = "/testModelAttribute", method = RequestMethod.POST)
    public String testModelAttribute(User user) {
        System.out.println("User: " + user + "******");
        return SUCCESS;
    }

    @RequestMapping(value = "/testSessionAttributes", method = RequestMethod.GET)
    public String testSessionAttributes(Map<String, Object> map) {
        User user = new User();
        map.put("user", user);
        map.put("school", "guigu");
        return SUCCESS;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        System.out.println(map.getClass().getName());
        map.put("haha", "zhanglong");
        return SUCCESS;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView(SUCCESS);
        modelAndView.addObject("time", new Date());
        return modelAndView;
    }

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out) {
        System.out.println("request:: " + request);
        System.out.println("response:: " + response);
        System.out.println("out::  " + out);
        return SUCCESS;
    }

    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println("testPojo:" + user);
        return SUCCESS;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println("testCookieValue: sessionId: " + sessionId);
        return SUCCESS;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(
            @RequestHeader(value = "Accept-Language") String al) {
        System.out.println("testRequestHeader, Accept-Language: " + al);
        return SUCCESS;
    }

    @RequestMapping(value = "testRequestParam")
    public String testRequestParam(@RequestParam("username") String cc, @RequestParam(value = "age", required = false, defaultValue = "21") int aa ) {
        System.out.println("testRequestParam: username = " + cc + ", age = " + aa);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String testRestDelete(@PathVariable Integer id) {
        System.out.println("testRets delete: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String testRestPut(@PathVariable Integer id) {
        System.out.println("testRest put " + id);
        return SUCCESS;
    }

    @RequestMapping(value="/testRest", method = RequestMethod.POST)
    public String testRest() {
        System.out.println("testRest POST ");
        return SUCCESS;
    }

    @RequestMapping(value="/testRest/{id}", method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id) {
        System.out.println("testRest get : " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        System.out.println("testPathVariable: " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testAntPath/**/abc")
    public String testAntPath() {
        System.out.println("testAntPath");
        return SUCCESS;
    }

    @RequestMapping(value = "testParamsAndHeaders", params = {"username", "age"}/*, headers = {"Accept-Language=en-US,zh;q=0.8"}*/)
    public String testParamsAndHeaders() {
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.GET)
    public String testMethod() {
        System.out.println("testMethod");
        return SUCCESS;
    }

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {
        System.out.println("testRequestMapping");
        return SUCCESS;
    }
}
