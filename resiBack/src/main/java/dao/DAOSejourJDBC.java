package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Maison;
import model.Sejour;

public class DAOSejourJDBC implements DAOSejour {

	public Sejour selectById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 

		PreparedStatement ps = conn.prepareStatement("select * from sejour where id=?");

		ps.setInt(1, id);


		ResultSet rs = ps.executeQuery(); 

		Sejour a = null; 
		while (rs.next())
		{
			a = new Sejour(rs.getInt("id"), rs.getInt("idCompteHote"), rs.getInt("idCompteLocataire"), 
					rs.getDate("dateEntree"), rs.getDate("dateSortie"), rs.getInt("idMaison"),
					rs.getInt("idAvisSurHote"),rs.getInt("idAvisSurLocataire")); 
		}

		conn.close(); 
		return a;
	}
	
	

	public List<Sejour> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM sejour"); 
		
		ResultSet rs = ps.executeQuery();
		
		Sejour a=null; 
		List<Sejour> list= new ArrayList(); 
		while (rs.next())
			{
			a = new Sejour(rs.getInt("id"), rs.getInt("idCompteHote"), rs.getInt("idCompteLocataire"), 
					rs.getDate("dateEntree"), rs.getDate("dateSortie"), rs.getInt("idMaison"),
					rs.getInt("idAvisSurHote"),rs.getInt("idAvisSurLocataire")); 
				list.add(a); 
			}
		ps.close();
		conn.close();
		
		return list;
	}

	public void insert(Sejour a) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO sejour (idCompteHote, idCompteLocataire, "
				+ "dateEntree, dateSortie, idMaison, idAvisSurHote, idAvisSurLocataire) VALUES (?,?,?,?,?,?,?)"); 
		
		ps.setInt(1, a.getIdCompteHote());
		ps.setInt(2, a.getIdCompteLocataire());
		ps.setDate(3, (Date) a.getDateEntree());
		ps.setDate(4, (Date) a.getDateSortie());
		ps.setInt(5, a.getIdMaison());
		ps.setInt(6, a.getIdAvisSurHote());
		ps.setInt(7, a.getIdAvisSurLocataire());
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		}
		catch (Exception e) {e.printStackTrace();}
		
	}

	public void update(Sejour a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
			
		PreparedStatement ps = conn.prepareStatement("Update sejour set idCompteHote=?, idCompteLocataire=?,"
				+ "dateEntree=?, dateSortie=?, idMaison=?, idAvisSurHote=?, idAvisSurLocataire=? where id=?"); 
		
		ps.setInt(1, a.getIdCompteHote());
		ps.setInt(2, a.getIdCompteLocataire());
		ps.setDate(3, (Date) a.getDateEntree());
		ps.setDate(4, (Date) a.getDateSortie());
		ps.setInt(5, a.getIdMaison());
		ps.setInt(6, a.getIdAvisSurHote());
		ps.setInt(7, a.getIdAvisSurLocataire());
		ps.setInt(8, a.getId());
		
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		
	}

	public void delete(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("DELETE from sejour where id=?"); 
	
		ps.setInt(1,id);
		ps.executeUpdate(); 
		ps.close(); 
		
		conn.close();
		
	}

}
