<%--
  Created by IntelliJ IDEA.
  User: dol
  Date: 27/04/2018
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>InterestMoney</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="/interestMoney" method="post">
  <label>Enter your Money: </label><br/>
  <input type="number" name="numberMoney" placeholder="Enter Money: "/><br/>
  <label>Enter your Rate: </label><br/>
  <input type="number" name="rate" placeholder="Enter RATE" ><br/>
  <label>Enter your Month: </label><br/>
  <input type="number" name="month" placeholder="Enter Month: "/><br/>
  <input type = "submit" id = "submit" value = "Calculator"/>
</form>
</body>
</html>