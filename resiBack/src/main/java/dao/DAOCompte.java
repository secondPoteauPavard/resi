package dao;

import model.Compte;

public interface DAOCompte extends DAO<Compte,Integer>{
	public Compte checkConnect(String email,String mdp) ;
}
