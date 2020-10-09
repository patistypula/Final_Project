<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 15.09.2020
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formularz dodawania nowego pacjenta</title>
    <link rel="stylesheet" href="/css/style.css">
    <style>
        .error {
            color:red;
        }
    </style>
</head>
<body>
<h2><center>FORMULARZ DODAWANIA NOWEGO PACJENTA</center></h2>

<table>
    <tr>
        <a href="/personDetails/all">
            <button class="button1">Lista wszystkich pacjentów</button>
        </a>
        <br>
    </tr>
    <tr></tr>
    <tr>
        <form:form method="post" modelAttribute="persons">
            <form:hidden path="id"/>
            <form:errors path="firstName" cssClass="error"/><br>
            Imię <form:input path="firstName"/><br>

            <form:errors path="lastName" cssClass="error"/><br>
            Nazwisko <form:input path="lastName"/><br>

            <form:errors path="gender" cssClass="error"/><br>
            Kobieta <form:radiobutton path="gender" value="F"/><br>
            Mężczyzna <form:radiobutton path="gender" value="M"/><br>

            <form:errors path="yearOfBirth" cssClass="error"/><br>
            Data urodzenia (dd.mm.yyyy) <form:input path="yearOfBirth"/><br>

            <form:errors path="height" cssClass="error"/><br>
            Wzrost <form:input path="height"/> cm<br>
        <br>
        <button  class="button1">Zapisz</button>
    </form:form>
    </tr>
</table>

</body>
</html>
