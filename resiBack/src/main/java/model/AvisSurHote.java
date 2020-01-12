package model;

import java.util.Date;

public class AvisSurHote {

	protected int id;
	protected int idHote;
	protected int idLocataire;
	protected String libelle;
	protected int note;
	protected Date date;
	
	
	public AvisSurHote(int id, int idHote, int idLocataire, String libelle, int note, Date date) {
		this.id = id;
		this.idHote = idHote;
		this.idLocataire = idLocataire;
		this.libelle = libelle;
		this.note = note;
		this.date = date;
	}
	
	public AvisSurHote(int idHote, int idLocataire, String libelle, int note, Date date) {
		this.idHote = idHote;
		this.idLocataire = idLocataire;
		this.libelle = libelle;
		this.note = note;
		this.date = date;
	}

	public int getIdHote() {
		return idHote;
	}

	public void setIdHote(int idHote) {
		this.idHote = idHote;
	}

	public int getIdLocataire() {
		return idLocataire;
	}

	public void setIdLocataire(int idLocataire) {
		this.idLocataire = idLocataire;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
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
		return "AvisSurHote [id=" + id + ", idHote=" + idHote + ", idLocataire=" + idLocataire + ", libelle=" + libelle
				+ ", note=" + note + ", date=" + date + "]";
	}
	
	
	

	
	
	
	
	
}
