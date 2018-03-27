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
        <jsp:include page="partials/head.jsp"/>
    </head>
    <body>
    <jsp:include page="partials/navbar.jsp"/>
    <div class="container">
        <h2>Please log in:</h2>
        <form method="post" action="/login.jsp">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" placeholder="enter username...">
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" placeholder="enter password...">
            </div>
            <input type="submit" value="Login" class="btn btn-default">
        </form>
    </div>
    </body>
</html>

