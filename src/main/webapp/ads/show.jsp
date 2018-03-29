<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Show Ad Details</title>
    </head>
    <body>
        <div class="container-fluid">
            <h1>Ad Information Listed Below:</h1>
            <hr>
            <div class="col-md-6">
                <%--<c:forEach var="ad" items="${ads}">--%>
                    <h1>${ad.title}</h1>
                    <p>${ad.description}</p>
                    <input type="button" value="Return" onclick="window.location='/ads'">
                    <%--<input type="submit" name="back" value="Return to All Ads" id="back">--%>
                <%--</c:forEach>--%>
            </div>
        </div>
    </body>
</html>
