<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 06.09.2020
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona główna</title>
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
<h1><center>WITAMY NA STRONIE GŁÓWNEJ</center></h1>
<br>
<center>
    <a href="/personDetails/add">
    <button class="button">Dodawanie nowego pacjenta</button>
</a>
</center>
<br>
<br>

<center>
    <a href="/personDetails/all">
    <button class="button">Lista wszystkich pacjentów</button>
</a>
</center>

</body>
</html>
