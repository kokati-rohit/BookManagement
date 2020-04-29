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
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Dao dao=new Dao();
		int id=Integer.parseInt(req.getParameter("id"));
		try {
			Book a=dao.getEdit(id);
			req.setAttribute("list", a);
			RequestDispatcher rd=req.getRequestDispatcher("EditBook.jsp");
			rd.forward(req, res);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
