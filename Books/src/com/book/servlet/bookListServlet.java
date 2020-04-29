package com.book.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.dao.Dao;
import com.book.model.Book;

@WebServlet("/bookListServlet")
public class bookListServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		System.out.println("in servlet................");
		Dao dao = new Dao();
		try {
			List<Book> list = dao.getBookList();
			req.setAttribute("List", list);
			RequestDispatcher rd= req.getRequestDispatcher("BookList.jsp");
			
			rd.forward(req, res);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
