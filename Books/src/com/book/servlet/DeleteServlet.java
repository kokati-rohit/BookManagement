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
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		Dao dao=new Dao();
		int id=Integer.parseInt(req.getParameter("id"));
		try {
			int c=dao.getDelete(id);
			if(c>0) {
			RequestDispatcher rd=req.getRequestDispatcher("DeleteSuccessfully.jsp");
			rd.forward(req, res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
