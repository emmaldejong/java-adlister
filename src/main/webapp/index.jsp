<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String login = request.getParameter("login");
if (login != null && login.equalsIgnoreCase("login")) {
    response.sendRedirect("/login.jsp");
}
 %>

<html>
    <head>
        <title><%= "Home Page" %></title>
        <jsp:include page="partials/head.jsp"/>
    </head>
    <body>
        <jsp:include page="partials/navbar.jsp"/>
        <div class="text-center">
            <h1 class="center">Welcome to the Homepage!</h1>
        </div>
        <div class="text-center">
            <form>
                <input type="submit" value="Login" name="login" class="btn btn-default">
            </form>
        </div>
        <div class="text-center">
            <img src="https://www.bizswoop.com/wp-content/uploads/2017/09/PS_LogosEcv1.png" alt="shopping cart">
        </div>
    </body>
</html>
