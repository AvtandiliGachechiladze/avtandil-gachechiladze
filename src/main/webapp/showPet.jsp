<jsp:useBean id="pet" scope="request" type="ge.edu.btu.avtandil.gachechiladze.regform.Pet"/>
<%--
  Created by IntelliJ IDEA.
  User: avtan
  Date: 3/24/2021
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pet info</title>
</head>
<body>
    <h1>registered pet info: ${pet.ViewPetInfo()}</h1>
</body>
</html>
