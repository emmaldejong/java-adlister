<%--
  Created by IntelliJ IDEA.
  User: emmadejong
  Date: 3/28/18
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Pick Color</title>
    </head>
    <body>
    <form action="/pickcolor" method="post">
        <label for="enter-color">Enter Your Favorite Color:</label>
        <input type="text" id="enter-color" name="favColor">
    </form>
    </body>
</html>
