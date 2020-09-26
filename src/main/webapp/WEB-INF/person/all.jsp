<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 15.09.2020
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Lista pacjentów</title>
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
    </style>
</head>
<body>
<h2><center>LISTA PACJENTÓW</center></h2>

<div class="d-flex justify-content-right mb-3">
    <p>Wyszukiwarka pacjentów: </p>
    <form method="get" action="/personDetails/search">
        <label>
            <input type="text" name="lastName" placeholder="Wpisz nazwisko pacjenta"/>
        </label>
        <label>
            <button type="submit">Szukaj</button>
        </label>
    </form>
</div>
<br>
<table border="1" width="100%">
    <tr>
        <td>Imię:</td>
        <td>Nazwisko:</td>
        <td>Płeć:</td>
        <td>Wiek:</td>
        <td>Wzrost:</td>
        <td>Pomiary podstawowe:</td>
        <td>Pomiary dodatkowe:</td>
        <td>Historia pomiarów:</td>
        <td>Plan diety:</td>
        <td>Plan ćwiczeń:</td>
        <td></td>
    </tr>
    <c:forEach items="${persons}" var="person" varStatus="myIndex">
        <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td><center>${person.gender}</center></td>
            <td><center>${ages[myIndex.index]}</center></td>
            <td><center>${person.height}</center></td>
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
                <a href="/diet/add/${person.id}">Dodaj</a>
                <a href="/diet/history/${person.id}">Szczegóły</a>
            </td>
            <td>
                <a href="/exercise/add/${person.id}">Dodaj</a>
                <a href="/exercise/history/${person.id}">Szczegóły</a>
            </td>
            <td>
                <a href="/personDetails/edit/${person.id}">Edytuj</a>
            </td>
        </tr>
    </c:forEach>
</table>

<br>
<a href="/personDetails/add">Dodawanie nowego pacjenta</a>
</body>
</html>
