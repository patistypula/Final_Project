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
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<h2><center>HISTORIA POMIARÓW</center></h2>

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
        RH - Right Hand
        <br>
    </tr>
    <tr>
        LH - Left Hand
        <br>
    </tr>
    <tr>
        RL - Right Leg
        <br>
    </tr>
    <tr>
        LL - Left Leg
        <br>
    </tr>
    <br>
    <tr>
        <table border="1" width="100%">
            <tr>
                <td>Data</td>
                <td>Data modyfikacji</td>
                <td><center>RH</center></td>
                <td><center>RH</center></td>
                <td><center>LH</center></td>
                <td><center>LH</center></td>
                <td><center>RL</center></td>
                <td><center>RL</center></td>
                <td><center>LL</center></td>
                <td><center>LL</center></td>
                <td><center>BODY</center></td>
                <td><center>BODY</center></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><center>%fat</center></td>
                <td><center>kg</center></td>
                <td><center>%fat</center></td>
                <td><center>kg</center></td>
                <td><center>%fat</center></td>
                <td><center>kg</center></td>
                <td><center>%fat</center></td>
                <td><center>kg</center></td>
                <td><center>%fat</center></td>
                <td><center>kg</center></td>
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
                <a href="/additional/edit/${additional.id}">
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
