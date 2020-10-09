<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 15.09.2020
  Time: 09:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dodawanie nowego pomiaru</title>
    <link rel="stylesheet" href="/css/style.css">
    <style>
        .error {
            color:red;
        }
    </style>
</head>

<body>
<h2><center>FORMULARZ DODAWANIA NOWEGO POMIARU</center></h2>
RH - Right Hand<br>
LH - Left Hand<br>
RL - Right Leg<br>
LL - Left Leg<br>
<br>

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
        <form:form method="post" modelAttribute="additionals">
        <form:hidden path="id"/>
        <form:hidden path="person"/>
        <table border="1" width="50%">
            <tr>
                <td></td>
                <td><center>RH</center></td>
                <td><center>LH</center></td>
                <td><center>RL</center></td>
                <td><center>LL</center></td>
                <td><center>BODY</center></td>
            </tr>
            <tr>
                <td>%</td>
                <form:errors path="rightArmFat" cssClass="error"/>
                <td><form:input path="rightArmFat"/></td>
                <form:errors path="leftArmFat" cssClass="error"/>
                <td><form:input path="leftArmFat"/></td>
                <form:errors path="rightLegFat" cssClass="error"/>
                <td><form:input path="rightLegFat"/></td>
                <form:errors path="leftLegFat" cssClass="error"/>
                <td><form:input path="leftLegFat"/></td>
                <form:errors path="bodyFat" cssClass="error"/>
                <td><form:input path="bodyFat"/></td>
            </tr>
            <tr>
                <td>kg</td>
                <form:errors path="rightArmMuscle" cssClass="error"/>
                <td><form:input path="rightArmMuscle"/></td>
                <form:errors path="leftArmMuscle" cssClass="error"/>
                <td><form:input path="leftArmMuscle"/></td>
                <form:errors path="rightLegMuscle" cssClass="error"/>
                <td><form:input path="rightLegMuscle"/></td>
                <form:errors path="leftLegMuscle" cssClass="error"/>
                <td><form:input path="leftLegMuscle"/></td>
                <form:errors path="bodyMuscle" cssClass="error"/>
                <td><form:input path="bodyMuscle"/></td>
            </tr>
        </table>
            <br>
            <button class="button1">Zapisz</button>
        </form:form>
    </tr>
</table>

</body>
</html>
