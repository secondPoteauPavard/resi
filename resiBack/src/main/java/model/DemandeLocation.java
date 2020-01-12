package model;

import java.util.Date;

public class DemandeLocation {

	protected int id;
	protected int idMaison;
	protected int idCompteLocataire;
	protected Date dateEntree;
	protected Date dateSortie;
	protected String validation;
	
	
	public DemandeLocation(int id, int idMaison, int idCompteLocataire, Date dateEntree, Date dateSortie,
			String validation) {
		this.id = id;
		this.idMaison = idMaison;
		this.idCompteLocataire = idCompteLocataire;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.validation = validation;
	}
	
	public DemandeLocation(int idMaison, int idCompteLocataire, Date dateEntree, Date dateSortie,
			String validation) {
		this.idMaison = idMaison;
		this.idCompteLocataire = idCompteLocataire;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.validation = validation;
	}
	
	public DemandeLocation() {
	}

	public int getIdMaison() {
		return idMaison;
	}

	public void setIdMaison(int idMaison) {
		this.idMaison = idMaison;
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

	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "DemandeLocation [id=" + id + ", idMaison=" + idMaison + ", idCompteLocataire=" + idCompteLocataire
				+ ", dateEntree=" + dateEntree + ", dateSortie=" + dateSortie + ", validation=" + validation + "]";
	}
	
	
	
	
}
