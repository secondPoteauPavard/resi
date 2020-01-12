package dao;

public class FactoryAvisSurHote {

	static DAOAvisSurHote dao=new DAOAvisSurHoteJDBC();
	

	public static DAOAvisSurHote getDAOAvisSurHote() 
	{
		return dao;
	}
}
