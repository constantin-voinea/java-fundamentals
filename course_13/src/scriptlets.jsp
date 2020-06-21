<%--
  Created by IntelliJ IDEA.
  User: cvoinea
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Locale" %>
<html>
<head>
    <title>scriptlets</title>
</head>
<body>
    <h1>
        <%
            String name = request.getParameter("name");
            Locale locale = request.getLocale();
            String languageTag = locale.toLanguageTag().substring(0, 2);

            String greeting;
            switch (languageTag) {
                case "fr": {
                    greeting = "Bonjour, ";
                    break;
                }
                case "de": {
                    greeting = "Guten Tag, ";
                    break;
                }
                case "en": {
                    greeting = "Hello, ";
                    break;
                }
                default: {
                    greeting = "Salut, ";
                    languageTag = "ro";
                }
            }
            response.setHeader("Content-Language", languageTag);
            // use jspwriter out
            out.println(greeting + (name != null ? name : "") + "!");
        %>
    </h1>
</body>
</html>
