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
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet
{
	public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		Dao dao=new Dao();
		Book b=new Book();
		b.setBook_id(Integer.parseInt(req.getParameter("id")));
		b.setTitle(req.getParameter("title"));
		b.setAuthor(req.getParameter("author"));
		b.setPrice(Integer.parseInt(req.getParameter("id")));
		try {
			int c = dao.getUpdate(b);
			if(c>0) {
			RequestDispatcher rd= req.getRequestDispatcher("BookList.jsp");
			rd.forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
