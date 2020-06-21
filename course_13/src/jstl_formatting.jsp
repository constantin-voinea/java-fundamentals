<%--
  Created by IntelliJ IDEA.
  User: cvoinea
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="now" class="java.util.Date"/>
<fmt:formatDate var="date_time" value="${now}" pattern="EEEE', ' dd MMMM ', time: 'hh:mm aa"/>
<h1>
    <c:set var="languageCode" value="${header['accept-language']}"/>
    <c:choose>
        <c:when test="${fn:startsWith(languageCode, 'fr')}">Bonjour, </c:when>
        <c:when test="${fn:startsWith(languageCode, 'de')}">Guten tag, </c:when>
        <c:when test="${fn:startsWith(languageCode, 'en')}">Hello, </c:when>
        <c:otherwise>Salut, </c:otherwise>
    </c:choose>
    ${param.name}. It's ${date_time}
</h1>
</body>
</html>
