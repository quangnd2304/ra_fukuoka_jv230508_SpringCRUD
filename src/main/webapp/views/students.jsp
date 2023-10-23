<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 18/10/2023
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>List Student</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>Student ID</th>
        <th>Student Name</th>
        <th>Age</th>
        <th>BirthDate</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${listStudents}" var="student">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>${student.age}</td>
                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${student.birthDate}"/></td>
                <td>${student.status?"Active":"Inactive"}</td>
                <td>
                    <a href="<%=request.getContextPath()%>/StudentController?action=initUpdate&&studentId=${student.studentId}">Update</a>
                    <a href="<%=request.getContextPath()%>/StudentController?action=delete&&studentId=${student.studentId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<a href="<%=request.getContextPath()%>/studentController/initCreate">Create New Student</a>
</body>
</html>
