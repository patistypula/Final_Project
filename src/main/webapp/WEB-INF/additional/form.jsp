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
        <td><form:input path="rightArmFat"/></td>
        <td><form:input path="leftArmFat"/></td>
        <td><form:input path="rightLegFat"/></td>
        <td><form:input path="leftLegFat"/></td>
        <td><form:input path="bodyFat"/></td>
    </tr>
    <tr>
        <td>kg</td>
        <td><form:input path="rightArmMuscle"/></td>
        <td><form:input path="leftArmMuscle"/></td>
        <td><form:input path="rightLegMuscle"/></td>
        <td><form:input path="leftLegMuscle"/></td>
        <td><form:input path="bodyMuscle"/></td>
    </tr>
</table><br>
    <input type="submit" value="Zapisz"/>
</form:form>

<br>
<a href="/personDetails/all">Lista pacjentów</a>

</body>
</html>
