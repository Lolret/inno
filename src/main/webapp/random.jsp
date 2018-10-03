<%--
  Created by IntelliJ IDEA.
  User: Rikki
  Date: 01.10.2018
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link rel="icon" href="https://www.shareicon.net/download/2015/09/20/104107_fire_512x512.png">
    <title>Рандомайзер Михаила</title>
</head>
<body>
<h1 align="center" class="page-header">Личный рандомайзер Михаила</h1>


<form align="center" class="form-inline" action="/random" method="post">
    <div class="form-group mb-2">
        <input  class="form-control-lg" type="text" name="count" placeholder="People count" autocomplete="off"
        style="font-size: 32px;">
        <input  class=" btn-lg btn-danger"  type="submit" value="Submit">
    </div>
</form>



<h1 align="center" style="background-color:Orange; font-size: 150px;">${enemy}</h1>
</body>
</html>
