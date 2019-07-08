<%--
  Created by IntelliJ IDEA.
  User: yurui
  Date: 2018/6/24
  Time: 下午7:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <a href="springmvc/testRedirect">Test Redirect</a>
  <br><br>

  <a href="springmvc/testView">Test View</a>
  <br><br>

  <a href="/springmvc/testViewAndViewResolver">Test ViewAndViewResolver</a>
  <br><br>

  <br>
  <form action="/springmvc/testModelAttribute" method="post">
    <input type="hidden" name="id" value="1"/>
    username:<input type="text" value="tom" name="username"><br>
    email:<input type="text" value="tom@email" name="email"><br>
    age:<input type="text" value="1" name="age"><br>
    <input type="submit" value="submit">
  </form>

  <br><br>
  <a href="springmvc/testSessionAttributes">testSessionAttributes</a>

  <br><br>
  <a href="springmvc/testMap">Test Map</a>

  <br>
  <a href="springmvc/testModelAndView">Test ModelAndView</a>
  <br><br>
  <br><br>
  <a href="springmvc/testServletAPI">testServletAPI</a>
  <br><br>
  <br>
  <form action="/springmvc/testPojo" method="post">
    username:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    email:<input type="text" name="email"><br>
    age:<input type="text" name="age"><br>
    address.province:<input type="text" name="address.province"><br>
    address.city:<input type="text" name="address.city"><br>

    <input type="submit" value="submit">
  </form>

  <a href="springmvc/testCookieValue">Test CookieValue</a>
  <br><br>

  <a href="springmvc/testRequestHeader">Test RequestHeader</a>
  <br><br>

  <br><br>
  <a href="springmvc/testRequestParam?username=guigu">Test RequestParam</a>

  <br><br>
  <form action="/springmvc/testRest/66" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value = "testRest put">
  </form>

  <br><br>
  <form action="/springmvc/testRest/33" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value = "testRest delete">
  </form>

  <br><br>
  <form action="/springmvc/testRest" method="post">
    <input type="submit" value = "testRest post">
  </form>

  <br><br>
  <a href="springmvc/testRest/22">TestRest Get</a>

  <br><br>
  <a href="springmvc/testPathVariable/1">Test PathVariable</a>

  <br><br>
  <a href="/springmvc/testAntPath/as/dadsf/dsaf/asdf/df/abc">testAntPath</a>

  <br><br>
  <a href="springmvc/testParamsAndHeaders?username=zhanglong&age=20">testParamsAndHeaders</a>

  <br><br>
  <a href="springmvc/testMethod">Test Method</a>

  <br><br>
  <a href="springmvc/testRequestMapping">Test RequestMapping</a>

  <br><br>
  <a href="helloworld">Hello World</a>
  </body>
</html>
