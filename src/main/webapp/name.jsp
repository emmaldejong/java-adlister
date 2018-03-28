<%--
  Created by IntelliJ IDEA.
  User: emmadejong
  Date: 3/28/18
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%--below specifies that you can write your HTML on the page--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Enter Name</title>
    </head>
    <body>
        <%--the action has to point to the url pattern in the servlet--%>
        <form action="/name" method="post">
            <label for="enter-name">Enter Your Name:</label>
            <input type="text" id="enter-name" name="name">
        </form>
    </body>
</html>
