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
    <style>
        .button {
            display: block;
            background-color: #4169E1;
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            border-radius: 8px;
        }
    </style>
</head>
<body>
<center><h2>Logowanie się</h2></center>
<form method="post" action="/login">
    <div><label> Login : <input type="text" name="username"/> </label></div>
    <div><label> Hasło: <input type="password" name="password"/> </label></div>
    <div><input type="submit" value="Zaloguj się"/></div>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</body>
</html>
