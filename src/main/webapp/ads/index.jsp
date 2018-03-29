<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Ads Index</title>
        <jsp:include page="/partials/head.jsp">
            <jsp:param name="title" value="Please Log In" />
        </jsp:include>
    </head>
    <body>
        <jsp:include page="/partials/navbar.jsp" />
        <div class="container-fluid">
            <h1>All Ads Are Listed Below:</h1>
            <hr>
            <div class="col-md-6">
                <c:forEach var="ad" items="${ads}">
                    <h1>${ad.title}</h1>
                    <p>${ad.description}</p>
                    <form action="/show" method="get">
                        <button type="submit" name="id" value="${ad.id}">View Details</button>
                    </form>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
