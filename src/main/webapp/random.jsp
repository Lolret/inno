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
<h1 align="center" class="page-header">

    <div><span style="color:#ff0000;">Л</span><span style="color:#ff1900;">и</span><span style="color:#ff3300;">ч</span><span
            style="color:#ff4c00;">н</span><span style="color:#ff6600;">ы</span><span
            style="color:#ff7f00;">й</span><span style="color:#cc9909;"> </span><span
            style="color:#99b212;">р</span><span style="color:#66cc1c;">а</span><span
            style="color:#33e525;">н</span><span style="color:#00ff2e;">д</span><span
            style="color:#00ff25;">о</span><span style="color:#00ff1c;">м</span><span
            style="color:#00ff12;">а</span><span style="color:#00ff09;">й</span><span
            style="color:#00ff00;">з</span><span style="color:#00ff33;">е</span><span
            style="color:#00ff66;">р</span><span style="color:#00ff99;"> </span><span
            style="color:#00ffcc;">М</span><span style="color:#00ffff;">и</span><span
            style="color:#00ccff;">х</span><span style="color:#0099ff;">а</span><span
            style="color:#0066ff;">и</span><span style="color:#0033ff;">л</span><span style="color:#0000ff;">а</span>
    </div>

</h1>


<form align="center" class="form-inline" action="" method="post">
    <div class="form-group mb-2">
        <input class="form-control-lg" type="text" name="count" value="<%
                if(request.getParameter("count") != null) {
            %><%=request.getParameter("count")%><%
                }%>"
               placeholder=" people count" autocomplete="off"
               style="font-size: 32px;">
        <input class="form-control-lg" type="text" name="excluded" placeholder=" excluded numbers"
               value="<%
                if(request.getParameter("excluded") != null) {
            %><%=request.getParameter("excluded")%><%
                }%>"
               autocomplete="off"
               style="font-size: 32px;">
        <input class=" btn-lg btn-danger" type="submit" value="Submit">
    </div>
</form>

<div align="center">
    <iframe src="https://money.yandex.ru/quickpay/button-widget?targets=%D0%96%D0%B5%D1%80%D1%82%D0%B2%D0%B0%20%D0%B1%D0%BE%D0%B3%D1%83%20%D0%B2%D0%B5%D1%80%D0%BE%D1%8F%D1%82%D0%BD%D0%BE%D1%81%D1%82%D0%B5%D0%B9&default-sum=100&button-text=14&yamoney-payment-type=on&button-size=m&button-color=orange&fio=on&successURL=&quickpay=small&account=410013598334456&"
            width="260" height="36" align="center" frameborder="0" allowtransparency="true" scrolling="no"></iframe>
</div>


<h1 align="center" style="background-color:Orange; font-size: 150px;">${enemy}</h1>


</body>
</html>
