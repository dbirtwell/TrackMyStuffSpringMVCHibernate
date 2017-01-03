<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<style>           
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}     
table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
  width: 50%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
   border: 1px solid gray;
   width: 25%;
   text-align: left;
   padding: 5px 10px;
}
</style>
<title>TrackMyStuff</title>
</head>
<body>
<h3>Track My Stuff</h3>
<form:form method="post" modelAttribute="item" action="${pageContext.request.contextPath}/addItem">
<table>
		<tr>
		  <th colspan="2">Add Item</th>
		</tr>
		<tr>
		<form:hidden path="id" />
          <td><form:label path="itemName">Item Name:</form:label></td>
          <td><form:input path="itemName" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
		  <td><form:label path="itemType">Type:</form:label></td>
          <td><form:input path="itemType" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="itemLocation">Location:</form:label></td>
          <td><form:input path="itemLocation" size="30" maxlength="30"></form:input></td>
		</tr>
		<tr>
		  <td><form:label path="itemDescription">Description:</form:label></td>
          <td><form:input path="itemDescription" size="30" maxlength="30"></form:input></td>
		</tr>		
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Item List</h3>
<c:if test="${!empty listOfItems}">
	<table class="tg">
	<tr>
		<th width="80">Id</th>
		<th width="120">Item Name</th>
		<th width="120">Type</th>
		<th width="120">Location</th>
		<th width="120">Description</th>		
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listOfItems}" var="item">
		<tr>
			<td>${item.id}</td>
			<td>${item.itemName}</td>
			<td>${item.itemType}</td>
			<td>${item.itemLocation}</td>
			<td>${item.itemDescription}</td>			
			<td><a href="<c:url value='/updateItem/${item.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/deleteItem/${item.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
