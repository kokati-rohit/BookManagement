package com.book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.book.model.Book;

public class Dao {
	private String url = "jdbc:mysql://localhost:3306/Bookstore";
	private String driver_name = "com.mysql.cj.jdbc.Driver";
	private String username = "root";
	private String password = "root";

	public Connection connection() throws SQLException {
		Connection con = null;
		try {
			Class.forName(driver_name);
			con = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;

	}

	public List<Book> getBookList() throws SQLException {
		Connection con = connection();

		String sql = "Select * from book";
		PreparedStatement pd = con.prepareStatement(sql);
		ResultSet rs = pd.executeQuery();
		List<Book> bookList = new ArrayList<Book>();
		while (rs.next()) {
			Book b = new Book();
			b.setBook_id(rs.getInt(1));
			b.setTitle(rs.getString(2));
			b.setAuthor(rs.getString(3));
			b.setPrice(rs.getInt(4));
			bookList.add(b);
		}

		return bookList;

	}

	public int addNewBook(Book b) throws SQLException {
		Connection con = connection();
		String sql = "Insert into book(title,author,price) values(?,?,?)";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, b.getTitle());
		pt.setString(2, b.getAuthor());
		pt.setInt(3, b.getPrice());
		int a = pt.executeUpdate();

		return a;

	}

	public Book getEdit(int id) throws SQLException {
		Connection con = connection();
		Book b = new Book();
		String sql = "Select * from book where book_id=?";
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setInt(1, id);
		ResultSet rs = pt.executeQuery();
		while (rs.next()) {

			b.setBook_id(rs.getInt(1));
			b.setTitle(rs.getString(2));
			b.setAuthor(rs.getString(3));
			b.setPrice(rs.getInt(4));

		}
		return b;

	}

	public int getUpdate(Book b) throws SQLException
	{
		Connection con=connection();
		String sql="update book set title = ?, author=?, price=? where book_id=?";
		PreparedStatement pt=con.prepareStatement(sql);
		pt.setString(1, b.getTitle());
		pt.setString(2, b.getAuthor());
		pt.setInt(3, b.getPrice());
		pt.setInt(4, b.getBook_id());
		int rs=pt.executeUpdate();	
		return rs;
		
	}
	
	public Integer getDelete(Integer id) throws SQLException
	{
		Connection con=connection();
		String sql="delete  from book where book_id=?";
		PreparedStatement pt=con.prepareStatement(sql);
		pt.setInt(1, id);
		int a=pt.executeUpdate();
		return a;
		
	}
}
