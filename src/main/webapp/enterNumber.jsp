<%--
  Created by IntelliJ IDEA.
  User: emmadejong
  Date: 3/28/18
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Enter Number</title>
    </head>
    <body>
    <form action="/guess" method="post">
        <label for="guess">Guess a number:</label>
        <input type="text" id="guess" name="guess">
    </form>
    </body>
</html>
