package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.AvisSurHote;
import model.AvisSurLocataire;

public class DAOAvisSurLocataireJDBC implements DAOAvisSurLocataire {

	public AvisSurLocataire selectById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 

		PreparedStatement ps = conn.prepareStatement("select * from avissurlocataire where id=?");

		ps.setInt(1, id);


		ResultSet rs = ps.executeQuery(); 

		AvisSurLocataire a = null; 
		while (rs.next())
		{
			a = new AvisSurLocataire (rs.getInt("id"), rs.getInt("idHote"), rs.getInt("idLocataire"), 
					rs.getString("libelle"), rs.getInt("note"), rs.getDate("dateCreation")); 
		}

		conn.close(); 
		return a;
	}

	public List<AvisSurLocataire> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM avissurlocataire"); 
		
		ResultSet rs = ps.executeQuery();
		
		AvisSurLocataire a=null; 
		List<AvisSurLocataire> list= new ArrayList(); 
		while (rs.next())
			{
				a = new AvisSurLocataire (rs.getInt("id"), rs.getInt("idHote"), rs.getInt("idLocataire"), 
					rs.getString("libelle"), rs.getInt("note"), rs.getDate("dateCreation")); 
				list.add(a); 
			}
		ps.close();
		conn.close();
		
		return list;
	}
	
	

	public void insert(AvisSurLocataire a) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO avissurlocataire (idHote, idLocataire, libelle,"
				+ " note, date) VALUES (?,?,?,?,?)"); 
		
		ps.setInt(1, a.getIdHote());
		ps.setInt(2, a.getIdLocataire());
		ps.setString(3, a.getLibelle());
		ps.setInt(4, a.getNote());
		ps.setDate(5, (Date) a.getDate());
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		}
		catch (Exception e) {e.printStackTrace();}
		
	}

	
	
	public void update(AvisSurLocataire a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
			
		PreparedStatement ps = conn.prepareStatement("Update avissurlocataire set idHote=?, idLocataire=?, libelle=?, note=?, "
				+ "date=? where id=?"); 
		
		ps.setInt(1, a.getIdHote());
		ps.setInt(2, a.getIdLocataire());
		ps.setString(3, a.getLibelle());
		ps.setInt(4, a.getNote());
		ps.setDate(5, (Date) a.getDate());
		ps.setInt(6, a.getId());
		
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
	}

	public void delete(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("DELETE from avissurlocataire where id=?"); 
	
		ps.setInt(1,id);
		ps.executeUpdate(); 
		ps.close(); 
		
		conn.close();
		
	}

}
