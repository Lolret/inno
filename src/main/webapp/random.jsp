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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <title>Рандомайзер для Михаила!</title>
</head>
<body>
<h1 class="page-header">Рандомайзер Михаила</h1>

<div class="form-group">
<form class="form-control" action="/random" method="post">
    <input class="form-check-input" type="text" name="count"  placeholder="People count" autocomplete="off">
    <input class="btn btn-primary" type="submit" value="Submit">
</form>
</div>
<h1 class="page-header">${enemy}
</h1>

</body>
</html>
