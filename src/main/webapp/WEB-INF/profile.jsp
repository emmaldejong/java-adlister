<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Hello, ${user}!</h1>
        <h1>Viewing your profile.</h1>
        <form action="/logout" method="post">
            <input type="submit" value="Logout"/>
        </form>
    </div>

</body>
</html>
