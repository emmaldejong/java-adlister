<%--
  Created by IntelliJ IDEA.
  User: emmadejong
  Date: 4/4/18
  Time: 7:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register!" />
    </jsp:include>
</head>
    <body>
        <jsp:include page="/WEB-INF/partials/navbar.jsp" />
        <div class="container">
            <h1>Please Register:</h1>
            <form action="/register" method="post">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input id="username" name="username" class="form-control" type="text">
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input id="email" name="email" class="form-control" type="text">
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input name="password" id="password" type="password" class="form-control">
                </div>
                <button type="submit" class="btn btn-primary btn-block" value="Register!">Sign Up</button>
            </form>
        </div>
    </body>
</html>