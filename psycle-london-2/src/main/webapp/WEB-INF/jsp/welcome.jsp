<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
body {
	background-image: url('http://crunchify.com/bg.png');
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bike Information</title>
</head>
<body>
	<p>Bike information:</p>
	<table>
		<c:forEach items="${bikes}" var="bikeinfo">
			<tr> <td>Name:  		 <c:out value="${bikeinfo.bikeName}"  /></td></tr>
			<tr> <td>Colour: 		 <c:out value="${bikeinfo.bikeColour}" 	  /></tr>
			<tr> <td>Height:  	     <c:out value="${bikeinfo.bikeHeight}"    /></tr>
			<tr> <td>Type:    	     <c:out value="${bikeinfo.bikeType}" 	  /></td></tr>
			<tr ><td>Gears:  		 <c:out value="${bikeinfo.bikeGears}"     /></td></tr>
			<tr> <td>Cost:         	 <c:out value="${bikeinfo.bikeCost}" 	  /></td></tr>
			<tr> <td>GenderType:     <c:out value="${bikeinfo.bikeGenderType}" /></td></tr>
			<tr> <td>Attribute:      <c:forEach items="${bikeinfo.attributes}" var="attr">
									 	 <tr><td><c:out value="${attr}"/> </td></tr>
									 </c:forEach>
									  <br>  
				</td></tr>
		</c:forEach>
	</table>
	<!-- 
	
	<table>
		<c:forEach items="${bikes}" var="bikeinfo">
			<tr>
				<td>Name:  		     <c:out value="${bikeinfo.bikeName}" /></td>
				<td>Colour: 		 <c:out value="${bikeinfo.bikeColour}" /></td>
				<td>Height:  	     <c:out value="${bikeinfo.bikeHeight}" /></td>
				<td>Type:    	     <c:out value="${bikeinfo.bikeType}" /></td>
				<td>Gears:  		 <c:out value="${bikeinfo.bikeGears}" /></td>
				<td>Cost:         	 <c:out value="${bikeinfo.bikeCost}" /></td>
				<td>GenderType:      <c:out value="${bikeinfo.bikeGenderType}" /></td>
				<td>Attribute:     <c:out value="${bikeinfo.attributes}" /></td>
						
				
			</tr>
			<br>
		</c:forEach>
	</table>
	 -->
</body>
</html>