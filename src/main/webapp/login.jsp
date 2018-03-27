<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username == null) {
        username = "akdsfhjald";
    }
    if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    }
%>

<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
    <h2>Please log in:</h2>
    <form method="post" action="/login.jsp">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username">
        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
        <input type="submit" value="Login">
    </form>
    </body>
</html>

