package dao;

public class FactoryDemandeLocation {

	
	static DAODemandeLocation dao=new DAODemandeLocationJDBC();
	

	public static DAODemandeLocation getDAODemandeLocation() 
	{
		return dao;
	}
}