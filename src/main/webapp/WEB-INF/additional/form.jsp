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
<h2>FORMULARZ DODAWANIA NOWEGO POMIARU</h2>
<form:form method="post" modelAttribute="additional">
    <form:hidden path="id"/>
    <form:errors path="rightArmFat" cssClass="error"/><br>
    Procentowa zawartość tkanki tłuszczowej w prawej ręce: <form:input path="rightArmFat"/><br>

    <form:errors path="rightArmMuscle" cssClass="error"/><br>
    Masa mięśniowa w prawej ręce: <form:input path="rightArmMuscle"/><br>

    <form:errors path="leftArmFat" cssClass="error"/><br>
    Procentowa zawartość tkanki tłuszczowej w lewej ręce: <form:input path="leftArmFat"/><br>

    <form:errors path="leftArmMuscle" cssClass="error"/><br>
    Masa mięśniowa w lewej ręce: <form:input path="leftArmMuscle"/><br>

    <form:errors path="rightLegFat" cssClass="error"/><br>
    Procentowa zawartość tkanki tłuszczowej w prawej nodze: <form:input path="rightLegFat"/><br>

    <form:errors path="rightLegMuscle" cssClass="error"/><br>
    Masa mięśniowa w prawej nodze: <form:input path="rightLegMuscle"/><br>

    <form:errors path="leftLegFat" cssClass="error"/><br>
    Procentowa zawartość tkanki tłuszczowej w lewej nodze: <form:input path="leftLegFat"/><br>

    <form:errors path="leftLegMuscle" cssClass="error"/><br>
    Masa mięśniowa w lewej nodze: <form:input path="leftLegMuscle"/><br>

    <form:errors path="bodyFat" cssClass="error"/><br>
    Procentowa zawartość tkanki tłuszczowej w korpusie: <form:input path="bodyFat"/><br>

    <form:errors path="bodyMuscle" cssClass="error"/><br>
    Masa mięśniowa w korpusie: <form:input path="bodyMuscle"/><br>

    <input type="submit" value="Zapisz"/>
</form:form>

</body>
</html>
