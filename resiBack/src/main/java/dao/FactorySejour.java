package dao;

public class FactorySejour {

	
	static DAOSejour dao=new DAOSejourJDBC();
	

	public static DAOSejour getDAOSejour() 
	{
		return dao;
	}
}