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

public class DAOCompteJDBC implements DAOCompte {

	public Compte selectById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 

		PreparedStatement ps = conn.prepareStatement("select * from compte where id=?");

		ps.setInt(1, id);


		ResultSet rs = ps.executeQuery(); 

		Compte c = null; 
		while (rs.next())
		{
			c = new Compte (rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("mdp"), rs.getString("tel"), rs.getDate("dateCreation")); 

		}

		conn.close(); 
		return c;
	}

	public List<Compte> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM compte"); 
		
		ResultSet rs = ps.executeQuery();
		
		Compte c=null; 
		List<Compte> list= new ArrayList(); 
		while (rs.next())
			{
			c = new Compte (rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("mdp"), rs.getString("tel"), rs.getDate("dateCreation"));
				list.add(c); 
			}
		ps.close();
		conn.close();
		
		return list;
	}

	public void insert(Compte c) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO compte (nom, prenom, email, mdp, tel, dateCreation) VALUES (?,?,?,?,?,?)"); 
		
		ps.setString(1, c.getNom());
		ps.setString(2, c.getPrenom());
		ps.setString(3, c.getEmail());
		ps.setString(4, c.getMdp());
		ps.setString(5, c.getTel());
		ps.setDate(6, (Date) c.getDate());
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		}
		catch (Exception e) {e.printStackTrace();}
		
	}

	public void update(Compte c) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
			
		PreparedStatement ps = conn.prepareStatement("Update compte set nom=?, prenom=?, email=?, mdp=?, tel=?, dateCreation=? where id=?"); 
		
		ps.setString(1, c.getNom());
		ps.setString(2, c.getPrenom());
		ps.setString(3, c.getEmail());
		ps.setString(4, c.getMdp());
		ps.setString(5, c.getTel());
		ps.setDate(6, (Date) c.getDate());
		ps.setInt(7, c.getId());
		
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		
	}

	public void delete(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("DELETE from compte where id=?"); 
	
		ps.setInt(1,id);
		ps.executeUpdate(); 
		ps.close(); 
		
		conn.close();
		
	}

	public Compte checkConnect(String email, String mdp) 
	{
		Compte c= null; 
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 

			PreparedStatement ps = conn.prepareStatement("select * from compte where email=? and mdp=?");
			ps.setString(1,email);
			ps.setString(2,mdp);
	
			
			ResultSet rs = ps.executeQuery(); 

			while (rs.next())
			{
				c = new Compte (rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("mdp"), rs.getString("tel"), rs.getDate("dateCreation"));
			}
			conn.close(); 
		}
		catch (Exception e) {e.printStackTrace();}

		return c;
	} 

}
