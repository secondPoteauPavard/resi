package model;

import java.util.Date;

public class Sejour {

	protected int id;
	protected int idCompteHote;
	protected int idCompteLocataire;
	protected Date dateEntree;
	protected Date dateSortie;
	protected int idMaison;
	protected int idAvisSurHote;
	protected int idAvisSurLocataire;
	
	public Sejour(int id, int idCompteHote, int idCompteLocataire, Date dateEntree, Date dateSortie, int idMaison,
			int idAvisSurHote, int idAvisSurLocataire) {
		this.id = id;
		this.idCompteHote = idCompteHote;
		this.idCompteLocataire = idCompteLocataire;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.idMaison = idMaison;
		this.idAvisSurHote = idAvisSurHote;
		this.idAvisSurLocataire = idAvisSurLocataire;
	}
	
	public Sejour(int idCompteHote, int idCompteLocataire, Date dateEntree, Date dateSortie, int idMaison,
			int idAvisSurHote, int idAvisSurLocataire) {
		this.idCompteHote = idCompteHote;
		this.idCompteLocataire = idCompteLocataire;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.idMaison = idMaison;
		this.idAvisSurHote = idAvisSurHote;
		this.idAvisSurLocataire = idAvisSurLocataire;
	}
	
	public Sejour() {
	}

	public int getIdCompteHote() {
		return idCompteHote;
	}

	public void setIdCompteHote(int idCompteHote) {
		this.idCompteHote = idCompteHote;
	}

	public int getIdCompteLocataire() {
		return idCompteLocataire;
	}

	public void setIdCompteLocataire(int idCompteLocataire) {
		this.idCompteLocataire = idCompteLocataire;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public int getIdMaison() {
		return idMaison;
	}

	public void setIdMaison(int idMaison) {
		this.idMaison = idMaison;
	}

	public int getIdAvisSurHote() {
		return idAvisSurHote;
	}

	public void setIdAvisSurHote(int idAvisSurHote) {
		this.idAvisSurHote = idAvisSurHote;
	}

	public int getIdAvisSurLocataire() {
		return idAvisSurLocataire;
	}

	public void setIdAvisSurLocataire(int idAvisSurLocataire) {
		this.idAvisSurLocataire = idAvisSurLocataire;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Sejour [id=" + id + ", idCompteHote=" + idCompteHote + ", idCompteLocataire=" + idCompteLocataire
				+ ", dateEntree=" + dateEntree + ", dateSortie=" + dateSortie + ", idMaison=" + idMaison
				+ ", idAvisSurHote=" + idAvisSurHote + ", idAvisSurLocataire=" + idAvisSurLocataire + "]";
	}
	
	
	
	
}
