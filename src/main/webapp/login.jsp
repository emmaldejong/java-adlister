<%--
  Created by IntelliJ IDEA.
  User: emmadejong
  Date: 3/27/18
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
    <form action="/login.jsp" method="POST">
        <h2>Please log in:</h2>
        <label for="username">Username:</label>
        <input type="text" id="username">
        <label for="password">Password:</label>
        <input type="password" id="password">
        <button type="submit">Login</button>
    </form>
    </body>
</html>
