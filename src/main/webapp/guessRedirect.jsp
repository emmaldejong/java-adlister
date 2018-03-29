<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: emmadejong
  Date: 3/28/18
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Number Redirect Page</title>
    </head>
    <body>
        <h1>${message}</h1>

        <c:if test="${!message.equals('You guessed correctly!')}">
            <form>
                <input type="submit" value="guess again" name="again" class="btn btn-default">
            </form>
        </c:if>
    </body>
</html>
