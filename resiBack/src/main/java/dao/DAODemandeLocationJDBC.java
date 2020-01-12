package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Compte;
import model.DemandeLocation;

public class DAODemandeLocationJDBC implements DAODemandeLocation {

	public DemandeLocation selectById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 

		PreparedStatement ps = conn.prepareStatement("select * from demandelocation where id=?");

		ps.setInt(1, id);


		ResultSet rs = ps.executeQuery(); 

		DemandeLocation c = null; 
		while (rs.next())
		{
			c = new DemandeLocation(rs.getInt("id"), rs.getInt("idMaison"), rs.getInt("idCompteLocataire"), 
					rs.getDate("dateEntree"), rs.getDate("dateSortie"), rs.getString("validation")); 

		}

		conn.close(); 
		return c;
	}
	
	

	public List<DemandeLocation> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM demandelocation"); 
		
		ResultSet rs = ps.executeQuery();
		
		DemandeLocation c=null; 
		List<DemandeLocation> list= new ArrayList(); 
		while (rs.next())
			{
				c = new DemandeLocation(rs.getInt("id"), rs.getInt("idMaison"), rs.getInt("idCompteLocataire"), 
					rs.getDate("dateEntree"), rs.getDate("dateSortie"), rs.getString("validation")); 
				list.add(c); 
			}
		ps.close();
		conn.close();
		
		return list;
	}

	public void insert(DemandeLocation c) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO demandelocation (idMaison, idCompteLocataire, "
				+ "dateEntree, dateSortie, validation) VALUES (?,?,?,?,?)"); 
		
		ps.setInt(1, c.getIdMaison());
		ps.setInt(2, c.getIdCompteLocataire());
		ps.setDate(3, (Date) c.getDateEntree());
		ps.setDate(4, (Date) c.getDateSortie());
		ps.setString(5, c.getValidation());

		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		}
		catch (Exception e) {e.printStackTrace();}
		
	}

	public void update(DemandeLocation a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
			
		PreparedStatement ps = conn.prepareStatement("Update demandelocation set idMaison=?, "
				+ "idCompteLocataire=?, dateEntree=?, dateSortie=?, validation=? where id=?"); 
		
		ps.setInt(1, a.getIdMaison());
		ps.setInt(2, a.getIdCompteLocataire());
		ps.setDate(3, (Date) a.getDateEntree());
		ps.setDate(4, (Date) a.getDateSortie());
		ps.setString(5, a.getValidation());
		ps.setInt(6, a.getId());
		
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		
	}

	public void delete(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("DELETE from demandelocation where id=?"); 
	
		ps.setInt(1,id);
		ps.executeUpdate(); 
		ps.close(); 
		
		conn.close();
		
	}

}
