<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="theme.css">
<style>
table, th, td {
  border: 2px solid ;
}
th, td,table {
  padding: 5px;
}
</style>
</head>
<body>
<form action="bookListServlet">

    <header style="padding-top: 50px;">
        
    </header>
<div class="container">

    <div>
        <h1 style="text-align: center;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"><b>Books Management</b></h1>
    </div></br>
    <div class="row">
        <a href="newBook.jsp" style="padding-left: 350px;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"><h3><u><b> New Book</b></u></h3></a>
        <a href="bookListServlet" style="padding-left: 150px;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"><h3><u><b>List All Books</b></u></h3></a>

    </div>
    <div style="text-align: center; font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;">
        <h3><b>List Of Books</b></h3>
    </div><br>
    <div> 
        <table  align="center" >
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
            
            <c:forEach var="i" items="${List}">
            <tr>
                  <td>${i.book_id}</td> 
                  <td>${i.title}</td>
                  <td>${i.author}</td>
                  <td>${i.price}</td>
                  <td><a href="EditServlet?id=${i.book_id}">Edit</a>
                    <a href="DeleteServlet?id=${i.book_id}" style="padding-left: 10px;">Delete</a></td> 
                
                
            </tr>
        </c:forEach>
        </table>
    </div>

</div>
</form>
</body>
</html>