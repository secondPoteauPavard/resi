package model;

import java.util.Date;

public class Compte {
	
	protected int id;
	protected String nom;
	protected String prenom;
	protected String email;
	protected String mdp;
	protected String tel;
	protected Date date;
	
	public Compte(int id, String nom, String prenom, String email, String mdp, String tel, Date date) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.tel = tel;
		this.date = date;
	}
	
	public Compte(String nom, String prenom, String email, String mdp, String tel, Date date) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.tel = tel;
		this.date = date;
	}
	
	public Compte(String nom, String prenom, String email, String mdp, String tel) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.mdp = mdp;
		this.tel = tel;
	}
	
	public Compte() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", mdp=" + mdp
				+ ", tel=" + tel + ", date=" + date + "]";
	}


	
	
	


}
