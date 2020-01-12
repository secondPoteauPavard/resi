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
import model.Maison;

public class DAOMaisonJDBC implements DAOMaison {

	public Maison selectById(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 

		PreparedStatement ps = conn.prepareStatement("select * from maison where id=?");

		ps.setInt(1, id);


		ResultSet rs = ps.executeQuery(); 

		Maison a = null; 
		while (rs.next())
		{
			a = new Maison(rs.getInt("id"), rs.getInt("idCompte"), rs.getInt("adresseNum"), 
					rs.getString("adresseLibelle"), rs.getString("adresseCP"), rs.getString("adresseVille"),
					rs.getString("photo"),rs.getString("description")); 
		}

		conn.close(); 
		return a;
	}
	
	

	public List<Maison> selectAll() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM maison"); 
		
		ResultSet rs = ps.executeQuery();
		
		Maison a=null; 
		List<Maison> list= new ArrayList(); 
		while (rs.next())
			{
				a = new Maison(rs.getInt("id"), rs.getInt("idCompte"), rs.getInt("adresseNum"), 
					rs.getString("adresseLibelle"), rs.getString("adresseCP"), rs.getString("adresseVille"),
					rs.getString("photo"),rs.getString("description")); 
				list.add(a); 
			}
		ps.close();
		conn.close();
		
		return list;
	}

	public void insert(Maison a) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO maison (idCompte, adresseNum, adresseLibelle,"
				+ " adresseCP, adresseVille, photo, description) VALUES (?,?,?,?,?,?,?)"); 
		
		ps.setInt(1, a.getIdCompte());
		ps.setInt(2, a.getAdresseNum());
		ps.setString(3, a.getAdresseLibelle());
		ps.setString(4, a.getAdresseCP());
		ps.setString(5, a.getAdresseVille());
		ps.setString(6, a.getPhoto());
		ps.setString(7, a.getDescription());
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		}
		catch (Exception e) {e.printStackTrace();}
		
	}

	public void update(Maison a) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
			
		PreparedStatement ps = conn.prepareStatement("Update maison set idCompte=?, adresseNum=?,"
				+ "adresseLibelle=?, adresseCP=?, adresseVille=?, photo=?, description=? where id=?"); 
		
		ps.setInt(1, a.getIdCompte());
		ps.setInt(2, a.getAdresseNum());
		ps.setString(3, a.getAdresseLibelle());
		ps.setString(4, a.getAdresseCP());
		ps.setString(5, a.getAdresseVille());
		ps.setString(6, a.getPhoto());
		ps.setString(7, a.getDescription());
		ps.setInt(8, a.getId());
		
		
		ps.executeUpdate(); 
		ps.close(); 
		conn.close();
		
	}

	public void delete(Integer id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/resi","root", ""); 
		
		PreparedStatement ps = conn.prepareStatement("DELETE from maison where id=?"); 
	
		ps.setInt(1,id);
		ps.executeUpdate(); 
		ps.close(); 
		
		conn.close();
		
	}

}
