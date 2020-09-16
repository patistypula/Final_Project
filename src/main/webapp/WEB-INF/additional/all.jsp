<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 16.09.2020
  Time: 11:42
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
        <td>Prawa ręka, %fat</td>
        <td>Prawa ręka, masa mięśniowa [kg]</td>
        <td>Lewa ręka, %fat</td>
        <td>Lewa ręka, masa mięśniowa [kg]</td>
        <td>Prawa noga, %fat</td>
        <td>Prawa noga, masa mięśniowa [kg]</td>
        <td>Lewa noga, %fat</td>
        <td>Lewa noga, masa mięśniowa [kg]</td>
        <td>Korpus, %fat</td>
        <td>Korpus, masa mięśniowa [kg]</td>
        <td></td>
    </tr>
    <c:forEach items="${additionals}" var="additional">
        <tr>
            <td>${additional.created}</td>
            <td>${additional.rightArmFat}</td>
            <td>${additional.rightArmMuscle}</td>
            <td>${additional.leftArmFat}</td>
            <td>${additional.leftArmMuscle}</td>
            <td>${additional.rightLegFat}</td>
            <td>${additional.rightLegMuscle}</td>
            <td>${additional.leftLegFat}</td>
            <td>${additional.leftLegMuscle}</td>
            <td>${additional.bodyFat}</td>
            <td>${additional.bodyMuscle}</td>
            <td>
                <a href="/additional/edit/${additional.id}">Edytuj</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
