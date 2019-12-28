<%@ page import="com.yyh.po.Student" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YanYuHang
  Date: 2019/12/28
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" align="center" width="50%">
    <tr align="center">
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>学生年龄</td>
    </tr>
    <%
        List<Student> stuList = (List<Student>) request.getAttribute("stuList");
        for (Student stu : stuList) {
    %>
    <tr align="center">
        <td><%=stu.getStuid()%>
        </td>
        <td><%=stu.getStuname()%>
        </td>
        <td><%=stu.getStupwd()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
