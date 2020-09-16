<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 16.09.2020
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Historia pomiarów</title>
</head>
<body>
<h2>HISTORIA POMIARÓW</h2>
<table border="1" width="100%">
    <tr>
        <td>Data</td>
        <td>Procentowa zawartość tkanki tłuszczowej, %</td>
        <td>Masa ciała, kg</td>
        <td>Procentowa zawartość wody w organiźmie, %</td>
        <td>Poziom tkanki tłuszczowej wisceralnej, level</td>
        <td>Masa mięśniowa, kg</td>
        <td>Wskaźnik budowy ciała</td>
        <td>Poziom mineralny kości, kg</td>
        <td>BMI</td>
        <td>Wiek metaboliczny, lat/a</td>
        <td>Podstawowa przemiana materii, kcal</td>
        <td></td>
    </tr>
    <c:forEach items="${measurements}" var="measurement">
        <tr>
            <td>${measurement.created}</td>
            <td>${measurement.bodyFatPercentage}</td>
            <td>${measurement.bodyWeight}</td>
            <td>${measurement.bodyWaterPercentage}</td>
            <td>${measurement.visceralFat}</td>
            <td>${measurement.muscleMass}</td>
            <td>${measurement.bodyBuildingIndex}</td>
            <td>${measurement.boneMass}</td>
            <td>${measurement.BMI}</td>
            <td>${measurement.metabolicAge}</td>
            <td>${measurement.basalMetabolicRate}</td>
            <td>
                <a href="/measurement/edit/${measurement.id}">Edytuj</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
