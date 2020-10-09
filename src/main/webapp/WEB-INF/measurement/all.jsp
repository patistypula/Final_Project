<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 16.09.2020
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Historia pomiarów</title>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<h2><center>HISTORIA POMIARÓW</center></h2>

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
        <td>Procentowa zawartość tkanki tłuszczowej</td>
        <td>Masa ciała</td>
        <td>Procentowa zawartość wody w organiźmie</td>
        <td>Poziom tkanki tłuszczowej wisceralnej</td>
        <td>Masa mięśniowa</td>
        <td>Wskaźnik budowy ciała</td>
        <td>Poziom mineralny kości</td>
        <td>BMI</td>
        <td>Wiek metaboliczny</td>
        <td>Podstawowa przemiana materii</td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td> </td>
        <td><center>%</center></td>
        <td><center>kg</center></td>
        <td><center>%</center></td>
        <td><center>level</center></td>
        <td><center>kg</center></td>
        <td><center>-</center></td>
        <td><center>kg</center></td>
        <td><center>-</center></td>
        <td><center>lat/a</center></td>
        <td><center>kcal</center></td>
        <td></td>
    </tr>
    <c:forEach items="${measurements}" var="measurement">
        <tr>
            <td><center>${measurement.created}</center></td>
            <td><center>${measurement.updated}</center></td>
            <td><center>${measurement.bodyFatPercentage}</center></td>
            <td><center>${measurement.bodyWeight}</center></td>
            <td><center>${measurement.bodyWaterPercentage}</center></td>
            <td><center>${measurement.visceralFat}</center></td>
            <td><center>${measurement.muscleMass}</center></td>
            <td><center>${measurement.bodyBuildingIndex}</center></td>
            <td><center>${measurement.boneMass}</center></td>
            <td><center>${measurement.BMI}</center></td>
            <td><center>${measurement.metabolicAge}</center></td>
            <td><center>${measurement.basalMetabolicRate}</center></td>
            <td>
                <a href="/measurement/edit/${measurement.id}">
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
