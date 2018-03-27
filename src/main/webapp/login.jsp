<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
    <%--if (request.getMethod().equalsIgnoreCase("post"))--%>
<%--%>--%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile");
    }
%>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
    <h2>Please log in:</h2>
    <form action="/login.jsp" method="POST">
        <label for="username">Username:</label>
        <input type="text" id="username">
        <label for="password">Password:</label>
        <input type="password" id="password">
        <button type="submit">Login</button>
    </form>
    </body>
</html>
