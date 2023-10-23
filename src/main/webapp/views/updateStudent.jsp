<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 20/10/2023
  Time: 7:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/StudentController?action=update" method="post">
    <label for="studentId">Student ID</label>
    <input type="text" id="studentId" name="studentId" value="${updateStudent.studentId}" readonly/><br>
    <label for="studentName">Student Name</label>
    <input type="text" id="studentName" name="studentName" value="${updateStudent.studentName}"/><br>
    <label for="age">Age</label>
    <input type="number" id="age" name="age" value="${updateStudent.age}"/><br>
    <label for="birthDate">Student Name</label>
    <input type="date" id="birthDate" name="birthDate" value="${updateStudent.birthDate}"/><br>
    <label for="active">Status</label>
    <input type="radio" id="active" name="status" ${updateStudent.status?'checked':''} value="true"/><label for="active">Active</label>
    <input type="radio" id="inactive" name="status" value="false" ${updateStudent.status?'':'checked'}/><label for="inactive">Inactive</label><br>
    <input type="submit" value="Update"/>
</form>
</body>
</html>
