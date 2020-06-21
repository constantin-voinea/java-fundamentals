<%--
  Created by IntelliJ IDEA.
  User: cvoinea
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <c:set var="languageCode" value="${(header['accept-language'].split(','))[0]}"/>
    <c:choose>
        <c:when test="${languageCode == 'fr'}">Bonjour, </c:when>
        <c:when test="${languageCode == 'de'}">Guten tag, </c:when>
        <c:when test="${languageCode == 'en'}">Hello, </c:when>
        <c:otherwise>Salut, </c:otherwise>
    </c:choose>
    ${param.name}
</h1>
</body>
</html>
