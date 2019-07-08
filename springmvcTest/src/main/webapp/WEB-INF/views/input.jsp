<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <form action="testConversionServiceConverer" method="POST">
        <!-- lastname-email-gender-department.id 例如: GG-gg@atguigu.com-0-105 -->
        Employee: <input type="text" name="employee"/>
        <input type="submit" value="Submit"/>
    </form>
    <br><br>

    <form:form action="${pageContext.request.contextPath }/emp" method="post" modelAttribute="employee">
        <form:errors path="*"></form:errors>
        <br>

        <c:if test="${employee.id == null}">
            LastName: <form:input path="lastName"/>
            <form:errors path="lastName"></form:errors>
        </c:if>
        <c:if test="${employee.id != null }">
            <form:hidden path="id"/>
            <input type="hidden" name="_method" value="PUT"/>
        </c:if>

        Email: <form:input path="email"/>
        <form:errors path="email"></form:errors>
        <br>
        <%
            Map<String, String> genders = new HashMap();
            genders.put("1", "Male");
            genders.put("0", "Female");

            request.setAttribute("genders", genders);
        %>
        Gender:
        <br>
        <form:radiobuttons path="gender" items="${genders }" delimiter="<br>"/>
        <br>
        Department: <form:select path="department.id"
                                 items="${departments }" itemLabel="departmentName" itemValue="id"></form:select>
        <br>
        Birth: <form:input path="birth"/>
        <form:errors path="birth"></form:errors>
        <br>
        Salary: <form:input path="salary"/>
        <br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
