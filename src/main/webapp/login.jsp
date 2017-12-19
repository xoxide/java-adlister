<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Login"></jsp:param>
    </jsp:include>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<div class="container">
    <form action="login.jsp" method="post">
        <div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" name="email" class="form-control" id="email">
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="password" name="pwd" class="form-control" id="pwd">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>
