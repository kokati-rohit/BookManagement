<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <form action="AddNewBookServlet">
            <header style="padding-top: 50px;">
                
            </header>
        <div class="container">
        
            <div>
                <h1 style="text-align: center;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif serif;"><b>Books Management</b></h1>
            </div></br>
            <div class="row">
                <a href="NewBook.jsp" style="padding-left: 350px;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"><h3><u><b> New Book</b></u></h3></a>
                <a href="bookListServlet" style="padding-left: 150px;font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;"><h3><u><b>List All Books</b></u></h3></a>
        
            </div>
            <div style="text-align: center; font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;">
                <h3><b>Add New Book</b></h3>
            </div><br>
            <table align="center" border="1">
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
         </body>
</html>