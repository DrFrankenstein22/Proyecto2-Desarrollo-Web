<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <h1>User List</h1>
    <ul>
        <c:forEach var="user" items="${users}">
            <li>${user}</li>
        </c:forEach>
    </ul>
    <h2>Add New User</h2>
    <form action="users" method="post">
        <label for="user">User Name:</label>
        <input type="text" id="user" name="user" required>
        <input type="submit" value="Add User">
    </form>
</body>
</html>
