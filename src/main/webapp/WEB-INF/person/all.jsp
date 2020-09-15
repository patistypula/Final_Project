<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 15.09.2020
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista pacjentów</title>
</head>
<body>
<h2>LISTA PACJENTÓW</h2>
<table border="1" width="50%">
    <tr>
        <td>Imię:</td>
        <td>Nazwisko:</td>
        <td>Płeć:</td>
        <td>Wiek:</td>
        <td>Wzrost:</td>
        <td>Pomiary podstawowe:</td>
        <td>Pomiary dodatkowe:</td>
        <td>Historia pomiarów:</td>
        <td></td>
    </tr>
    <c:forEach items="${persons}" var="person">
        <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.gender}</td>
            <td>${person.age}</td>
            <td>${person.height}</td>
            <td>
                <a href="/measurement/add/${person.id}">Dodaj</a>
            </td>
            <td>
                <a href="/additional/add/${person.id}">Dodaj</a>
            </td>
            <td>
                <a href="/measurement/history/${person.id}">Podstawowy</a><br>
                <a href="/additional/history/${person.id}">Dodatkowy</a>
            </td>
            <td>
                <a href="/personDetails/edit/${person.id}">Edytuj</a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
