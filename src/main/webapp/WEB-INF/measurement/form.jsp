<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 15.09.2020
  Time: 09:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formularz dodawania nowego pomiaru</title>
    <style>
        .error {
            color:red;
        }
    </style>
</head>
<body>
<h2><center>DODAWANIE NOWEGO POMIARU</center></h2>

<form:form method="post" modelAttribute="measurements">
    <form:hidden path="id"/>
    <form:hidden path="person"></form:hidden>
    <form:errors path="bodyFatPercentage" cssClass="error"/><br>
    Procentowa zawartość tkanki tłuszczowej: <form:input path="bodyFatPercentage"/> % <br>

    <form:errors path="bodyWeight" cssClass="error"/><br>
    Masa ciała: <form:input path="bodyWeight"/> kg <br>

    <form:errors path="bodyWaterPercentage" cssClass="error"/><br>
    Procentowa zawartość wody w organiźmie: <form:input path="bodyWaterPercentage"/> %<br>

    <form:errors path="visceralFat" cssClass="error"/><br>
    Poziom tkanki tłuszczowej wisceralnej: <form:input path="visceralFat"/> level<br>

    <form:errors path="muscleMass" cssClass="error"/><br>
    Masa mięśniowa: <form:input path="muscleMass"/> kg<br>

    <form:errors path="bodyBuildingIndex" cssClass="error"/><br>
    Wskaźnik budowy ciała: <form:input path="bodyBuildingIndex"/><br>

    <form:errors path="boneMass" cssClass="error"/><br>
    Poziom mineralny kości: <form:input path="boneMass"/> kg <br>

    <form:errors path="BMI" cssClass="error"/><br>
    BMI: <form:input path="BMI"/><br>

    <form:errors path="metabolicAge" cssClass="error"/><br>
    Wiek metaboliczny: <form:input path="metabolicAge"/> lat/a<br>

    <form:errors path="basalMetabolicRate" cssClass="error"/><br>
    Podstawowa przemiana materii: <form:input path="basalMetabolicRate"/> kcal <br>
    <br>
    <input type="submit" value="Zapisz"/>
</form:form>

<br>
<a href="/personDetails/all">Lista pacjentów</a>

</body>
</html>
