<%--
  Created by IntelliJ IDEA.
  User: patis
  Date: 18.09.2020
  Time: 08:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Formularz dodawania nowego planu treningowego</title>
    <link rel="stylesheet" href="/css/style.css">
</head>

<body>
<h2><center>FORMULARZ DODAWANIA NOWEGO PLANU TRENINGOWEGO</center></h2>

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
        <form:form method="post" modelAttribute="exercises">
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
                    <td><form:textarea rows="6" cols="21" path="monday"/></td>
                    <td><form:textarea rows="6" cols="21" path="tuesday"/></td>
                    <td><form:textarea rows="6" cols="21" path="wednesday"/></td>
                    <td><form:textarea rows="6" cols="21" path="thursday"/></td>
                    <td><form:textarea rows="6" cols="21" path="friday"/></td>
                    <td><form:textarea rows="6" cols="21" path="saturday"/></td>
                    <td><form:textarea rows="6" cols="21" path="sunday"/></td>
                </tr>
            </table><br>
        <button  class="button1">Zapisz</button>
        </form:form>
</table>
</body>
</html>
