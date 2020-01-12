package dao;

public class FactoryAvisSurLocataire {

	static DAOAvisSurLocataire dao=new DAOAvisSurLocataireJDBC();
	

	public static DAOAvisSurLocataire getDAOAvisSurLocataire() 
	{
		return dao;
	}
	
}
