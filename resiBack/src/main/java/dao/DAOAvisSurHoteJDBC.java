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
import model.Compte;

public class DAOAvisSurHoteJDBC implements DAOAvisSurHote {

	public AvisSurHote selectById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 

		PreparedStatement ps = conn.prepareStatement("select * from avissurhote where id=?");

		ps.setInt(1, id);


		ResultSet rs = ps.executeQuery(); 

		AvisSurHote a = null; 
		while (rs.next())
		{
			a = new AvisSurHote (rs.getInt("id"), rs.getInt("idHote"), rs.getInt("idLocataire"), 
					rs.getString("libelle"), rs.getInt("note"), rs.getDate("dateCreation")); 
		}

		conn.close(); 
		return a;
	}

	public List<AvisSurHote> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM avissurhote"); 
		
		ResultSet rs = ps.executeQuery();
		
		AvisSurHote a=null; 
		List<AvisSurHote> list= new ArrayList(); 
		while (rs.next())
			{
				a = new AvisSurHote (rs.getInt("id"), rs.getInt("idHote"), rs.getInt("idLocataire"), 
					rs.getString("libelle"), rs.getInt("note"), rs.getDate("dateCreation")); 
				list.add(a); 
			}
		ps.close();
		conn.close();
		
		return list;
	}
	
	

	public void insert(AvisSurHote a) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO avissurhote (idHote, idLocataire, libelle,"
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

	
	
	public void update(AvisSurHote a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
			
		PreparedStatement ps = conn.prepareStatement("Update avissurhote set idHote=?, idLocataire=?, libelle=?, note=?, "
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
		
		PreparedStatement ps = conn.prepareStatement("DELETE from avissurhote where id=?"); 
	
		ps.setInt(1,id);
		ps.executeUpdate(); 
		ps.close(); 
		
		conn.close();
		
	}

}
