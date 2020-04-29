<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <style type="text/css">
        table,td,th{
        border: 2px solid;
        }
        td,th,tr{
        padding: 5px;
        }
        </style>
    </head>
    <body>
        <form action="UpdateServlet">
            <header style="padding-top: 50px;">
                
            </header>
        <div class="container">
        
            <div>
                <h1 style="text-align: center;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif serif;"><b>Books Management</b></h1>
            </div></br>
            <div class="row">
                <a href="NewBook.jsp" style="padding-left: 350px;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"><h3><u><b> New Book</b></u></h3></a>
                <a href="bookListServlet" style="padding-left: 150px;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"><h3><u><b>List All Books</b></u></h3></a>
        
            </div></br>
            <div align="center" >
            	<label style="text-align: center; font-family: serif;"><h3><b>The Selected Book Is</b></h3></label></br>
            	<table border="1px" >
            	<tr>
            	<th>Id</th>
            	<th>Title</th>
            	<th>Author</th>
            	<th>Price</th>
            	</tr>
            	<tr>
            	<td>${list.book_id}</td>
            	<td>${list.title}</td>
            	<td>${list.author}</td>
            	<td>${list.price}</td>
            	</tr>
            	</table>
            </div></br>
            <div style="text-align: center; font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;">
                <h3><b>Edit Book</b></h3>
            </div><br>
            <table align="center" border="1">
            	<tr>
            	<th>ID</th>
                    <td "> <input type="text" name="id" value="${list.book_id}"  readonly ></td>
            	</tr>
                <tr>
                    <th>Title</th>
                    <td><input type="text" name="title" required></td>
                </tr>
                <tr>
                    <th>Author</th>
                    <td><input type="text" name="author" required></td>

                </tr>
                <tr>
                    <th>Price</th>
                    <td><input type="text" name="price" required></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="save"></td>
                </tr>

            </table>
            </div>
            </form>
    </body>
</html>