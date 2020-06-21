<%--
  Created by IntelliJ IDEA.
  User: cvoinea
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>use java beans</title>
</head>
<body>
    <h1>
        <jsp:useBean id="helper" class="servlets.HelloHelper" scope="application"/>
        <%=helper.getGreeting(request.getLocale())%> ${param.name}
    </h1>
</body>
</html>
