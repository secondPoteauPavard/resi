package dao;

public class FactoryMaison {

	
	static DAOMaison dao=new DAOMaisonJDBC();
	

	public static DAOMaison getDAOMaison() 
	{
		return dao;
	}
}