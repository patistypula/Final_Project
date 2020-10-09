<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 18.09.2020
  Time: 08:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Historia planów treningowych</title>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<h2><center>HISTORIA PLANÓW TRENINGOWYCH</center></h2>
<table>
    <tr>
        <a href="/personDetails/all">
            <button class="button1">Lista wszystkich pacjentów</button>
        </a>
        <br>
        <br>
    </tr>
    <tr></tr>
    <tr>
        <table border="1" width="100%">
            <tr>
                <td>Data</td>
                <td>Data modyfikacji</td>
                <td><center>PONIEDZIAŁEK</center></td>
                <td><center>WTOREK</center></td>
                <td><center>ŚRODA</center></td>
                <td><center>CZWARTEK</center></td>
                <td><center>PIĄTEK</center></td>
                <td><center>SOBOTA</center></td>
                <td><center>NIEDZIELA</center></td>
                <td></td>
            </tr>
        <c:forEach items="${exercises}" var="exercise">
            <tr>
                <td>${exercise.created}</td>
                <td>${exercise.updated}</td>
                <td>${exercise.monday}</td>
                <td>${exercise.tuesday}</td>
                <td>${exercise.wednesday}</td>
                <td>${exercise.thursday}</td>
                <td>${exercise.friday}</td>
                <td>${exercise.saturday}</td>
                <td>${exercise.sunday}</td>
                <td>
                <a href="/exercise/edit/${exercise.id}">
                    <button class="button1">Edytuj</button>
                </a>
                </td>
            </tr>
        </c:forEach>
        </table>
    </tr>
</table>
</body>
</html>
