<%--
  Created by IntelliJ IDEA.
  User: This MC
  Date: 20/10/2023
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Student</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/studentController/create" method="post">
        <label for="studentName">Student Name</label>
        <input type="text" id="studentName" name="studentName"/><br>
        <label for="age">Age</label>
        <input type="number" id="age" name="age"/><br>
        <label for="birthDate">Student Name</label>
        <input type="date" id="birthDate" name="birthDate"/><br>
        <label for="active">Status</label>
        <input type="radio" id="active" name="status" checked value="true"/><label for="active">Active</label>
        <input type="radio" id="inactive" name="status" value="false"/><label for="inactive">Inactive</label><br>
        <input type="submit" value="Create"/>
    </form>
</body>
</html>
