<%--
  Created by IntelliJ IDEA.
  User: cvoinea
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>my first jsp</title>
</head>
<body>
    <h1>Hello, <%= request.getParameter("name")%></h1>
</body>
</html>
