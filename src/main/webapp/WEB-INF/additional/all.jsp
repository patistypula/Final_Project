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
    <style>
        table {
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: left;
        }
        tr:nth-child(even) {
            background-color: #eee;
        }
        tr:nth-child(odd) {
            background-color: #fff;
        }
    </style>
</head>
<body>
<h2><center>HISTORIA POMIARÓW</center></h2>
<a href="/personDetails/all">Lista pacjentów</a><br>
<br>
RH - Right Hand <br>
LH - Left Hand <br>
RL - Right Leg <br>
LL - Left Leg <br>
<br>
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
                <a href="/additional/edit/${additional.id}">Edytuj</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
