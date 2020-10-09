<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 05.10.2020
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body background="images/dietetyka.jpg">
<center><h2>Logowanie się</h2></center>
<form method="post" action="/login">
    <center><div><label> Login : <input type="text" name="username"/> </label></div></center><br>
    <center><div><label> Hasło: <input type="password" name="password"/> </label></div></center><br>
    <center><div><input class="button1" type="submit" value="Zaloguj się"/></div></center>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
