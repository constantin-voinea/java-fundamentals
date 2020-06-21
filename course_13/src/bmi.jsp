<%--
  Created by IntelliJ IDEA.
  User: cvoinea
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI calculator</title>
</head>
<body>
<form name="bmiForm" action="bmi" method="POST">
    <table>
        <tr>
            <td>Your Weight (kg) :</td>
            <td><label>
                <input type="text" name="weight"/>
            </label></td>
        </tr>
        <tr>
            <td>Your Height (m) :</td>
            <td><label>
                <input type="text" name="height"/>
            </label></td>
        </tr>
        <th><input type="submit" value="Submit" name="find"/></th>
        <th><input type="reset" value="Reset" name="reset"/></th>
    </table>
    <h2>Your BMI is: <%=response.getHeader("BMI")%>
    </h2>
</form>
</body>
</html>
