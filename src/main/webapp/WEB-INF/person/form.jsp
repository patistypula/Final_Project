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
    <style>
        .error {
            color:red;
        }
    </style>
</head>
<body>
<h2><center>FORMULARZ DODAWANIA NOWEGO PACJENTA</center></h2>
<left><a href="/personDetails/all">Lista pacjentów</a></left>
<form:form method="post" modelAttribute="persons">
    <form:hidden path="id"/>
    <form:errors path="firstName" cssClass="error"/><br>
    Imię: <form:input path="firstName"/><br>

    <form:errors path="lastName" cssClass="error"/><br>
    Nazwisko: <form:input path="lastName"/><br>

    <form:errors path="gender" cssClass="error"/><br>
    Mężczyzna: <form:radiobutton path="gender" value="M"/><br>
    Kobieta: <form:radiobutton path="gender" value="F"/><br>

    <form:errors path="yearOfBirth" cssClass="error"/><br>
    Data urodzenia: <form:input path="yearOfBirth"/><br>

    <form:errors path="height" cssClass="error"/><br>
    Wzrost: <form:input path="height"/> cm <br>
    <br>
    <input type="submit" value="Zapisz"/>
</form:form>
<br>


</body>
</html>
