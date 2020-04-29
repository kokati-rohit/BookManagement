package com.book.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.Dao;
import com.book.model.Book;
@WebServlet("/AddNewBookServlet")
public class AddNewBookServlet extends HttpServlet
{
	public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Dao dao= new Dao();
		Book b=new Book();
		b.setTitle(req.getParameter("title"));
		b.setAuthor(req.getParameter("author"));
		b.setPrice(Integer.parseInt(req.getParameter("price")));
		try {
			int c=dao.addNewBook(b);
			if (c>0) {
				RequestDispatcher rd=req.getRequestDispatcher("bookListServlet");
				rd.forward(req, res);
							}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
