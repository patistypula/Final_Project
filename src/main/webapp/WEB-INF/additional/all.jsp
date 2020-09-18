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
<h2><center>HISTORIA POMIARÓW</center></h2>
RH - Right Hand <br>
LH - Left Hand <br>
RL - Right Leg <br>
LL - Left Leg <br>
<br>
<table border="1" width="100%">
    <tr>
        <td>Data</td>
        <td>Data modyfikacji</td>
        <td>RH %fat</td>
        <td>RH [kg]</td>
        <td>LH %fat</td>
        <td>LH [kg]</td>
        <td>RL %fat</td>
        <td>RL [kg]</td>
        <td>LL %fat</td>
        <td>LL [kg]</td>
        <td>Body %fat</td>
        <td>Body [kg]</td>
        <td></td>
    </tr>
    <c:forEach items="${additionals}" var="additional">
        <tr>
            <td>${additional.created}</td>
            <td>${additional.updated}</td>
            <td><center>${additional.rightArmFat}</center></td>
            <td><center>${additional.rightArmMuscle}</center></td>
            <td><center>${additional.leftArmFat}</center></td>
            <td><center>${additional.leftArmMuscle}</center></td>
            <td><center>${additional.rightLegFat}</center></td>
            <td><center>${additional.rightLegMuscle}</center></td>
            <td><center>${additional.leftLegFat}</center></td>
            <td><center>${additional.leftLegMuscle}</center></td>
            <td><center>${additional.bodyFat}</center></td>
            <td><center>${additional.bodyMuscle}</center></td>
            <td>
                <a href="/additional/edit/${additional.id}">Edytuj</a>
            </td>
        </tr>
    </c:forEach>
</table>

<br>
<a href="/personDetails/all">Lista pacjentów</a>

</body>
</html>
