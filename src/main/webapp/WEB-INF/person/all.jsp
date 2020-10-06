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
        .button2 {
            display: block;
            background-color: #D3D3D3;
            border: none;
            color: black;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 13px;
            border-radius: 8px;
        }
    </style>
</head>

<body>
<div style="float: right;">
    <a href="/logout">
        <button class="button">Wyloguj się</button>
    </a>
</div>

<h2><center>LISTA PACJENTÓW</center></h2>

<div class="d-flex justify-content-right mb-3">
    <p>Wyszukiwarka pacjentów: </p>
    <form method="get" action="/personDetails/search">
        <label>
            <input type="text" name="lastName" placeholder="Wpisz nazwisko pacjenta"/>
        </label>
        <label>
            <button class="button" type="submit">Szukaj</button>
        </label>
    </form>
</div>

<table>
<tr>
    <a href="/personDetails/all">
        <button class="button">Lista wszystkich pacjentów</button>
    </a>
    <br>
    <br>
</tr>
    <tr>
    <a href="/personDetails/add">
        <button class="button">Dodawanie nowego pacjenta</button>
    </a>
        <br>
        <br>
    </tr>
    <tr>
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
                <center><a href="/measurement/add/${person.id}">
                    <button class="button2">Dodaj</button>
                </a>
                </center>
            </td>
            <td>
                <center><a href="/additional/add/${person.id}">
                    <button class="button2">Dodaj</button>
                </a>
                </center>
            </td>
            <td>
                <a href="/measurement/history/${person.id}">
                    <button class="button2">Podstawowy</button>
                </a>
                <a href="/additional/history/${person.id}">
                    <button class="button2">Dodatkowy</button>
                </a>
            </td>
            <td>
                <a href="/diet/add/${person.id}">
                    <button class="button2">Dodaj</button>
                </a>

                <a href="/diet/history/${person.id}">
                    <button class="button2">Szczegóły</button>
                </a>
            </td>
            <td>
                <a href="/exercise/add/${person.id}">
                    <button class="button2">Dodaj</button>
                </a>

                <a href="/exercise/history/${person.id}">
                    <button class="button2">Szczegóły</button>
                </a>
            </td>
            <td>
                <a href="/personDetails/edit/${person.id}">
                    <button class="button2">Edytuj</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
    </tr>
</table>
</body>
</html>
