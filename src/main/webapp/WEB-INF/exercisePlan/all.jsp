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
    <style>
        table {
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: left;
        }
        tr:nth-child(even) {
            background-color: #eee;
        }
        tr:nth-child(odd) {
            background-color: #fff;
        }
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
<h2><center>HISTORIA PLANÓW TRENINGOWYCH</center></h2>
<table>
    <tr>
        <a href="/personDetails/all">
            <button class="button">Lista wszystkich pacjentów</button>
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
                    <button class="button">Edytuj</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
    </tr>
</table>
</body>
</html>
