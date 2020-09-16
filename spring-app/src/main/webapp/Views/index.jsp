<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Contacts</h1>
    <font color='green'>${succMsg}</font>
    <font color='red'>${errMsg}</font>
<form:form action="savecontact" method="POST" modelAttribute="c">
<table>
  <tr>
   <td>Contact Name</td>
   <td><form:input path="cname"/></td>
  </tr>
  
  <tr>
   <td>Contact Email</td>
   <td><form:input path="cemail"/></td>
  </tr>
  
  <tr>
   <td>Contact Number</td>
   <td><form:input path="cnum"/></td>
  </tr>
  
   <tr>
   <td><input type="submit" value="save contact"/></td>
   </tr>
</table>
</form:form>
</body>
</html>