<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 18.09.2020
  Time: 08:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formularz dodawania nowego planu diety</title>
    <style>
        .error {
            color:red;
        }
        .button {
            display: block;
            background-color: #4169E1;
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            border-radius: 8px;
        }
    </style>
</head>
<body>
<h2><center>DODAWANIE NOWEGO PLANU DIETY</center></h2>

<table>
    <tr>
        <a href="/personDetails/all">
            <button class="button">Lista wszystkich pacjentów</button>
        </a>
        <br>
        <br>
    </tr>
    <tr></tr>
    <tr>
<table border="1" width="100%">
    <form:form method="post" modelAttribute="diets">
        <form:hidden path="id"/>
        <form:hidden path="person"/>
        <table border="1" width="100%">
            <tr>
                <td><center>PONIEDZIAŁEK</center></td>
                <td><center>WTOREK</center></td>
                <td><center>ŚRODA</center></td>
                <td><center>CZWARTEK</center></td>
                <td><center>PIĄTEK</center></td>
                <td><center>SOBOTA</center></td>
                <td><center>NIEDZIELA</center></td>
            </tr>
            <tr>
                <td><form:textarea rows="6" cols="24" path="monday"/></td>
                <td><form:textarea rows="6" cols="24" path="tuesday"/></td>
                <td><form:textarea rows="6" cols="24" path="wednesday"/></td>
                <td><form:textarea rows="6" cols="24" path="thursday"/></td>
                <td><form:textarea rows="6" cols="24" path="friday"/></td>
                <td><form:textarea rows="6" cols="24" path="saturday"/></td>
                <td><form:textarea rows="6" cols="24" path="sunday"/></td>
            </tr>
        </table>
    </form:form>
</table>
        <br>
        <button  class="button">Zapisz</button>
    </tr>
</table>
</body>
</html>
