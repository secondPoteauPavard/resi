package model;

public class Maison {

	protected int id;
	protected int idCompte;
	protected int adresseNum;
	protected String adresseLibelle;
	protected String adresseCP;
	protected String adresseVille;
	protected String photo;
	protected String description;
	
	
	public Maison(int id, int idCompte, int adresseNum, String adresseLibelle, String adresseCP, String adresseVille,
			String photo, String description) {
		this.id = id;
		this.idCompte = idCompte;
		this.adresseNum = adresseNum;
		this.adresseLibelle = adresseLibelle;
		this.adresseCP = adresseCP;
		this.adresseVille = adresseVille;
		this.photo = photo;
		this.description = description;
	}
	
	public Maison(int idCompte, int adresseNum, String adresseLibelle, String adresseCP, String adresseVille,
			String photo, String description) {
		this.idCompte = idCompte;
		this.adresseNum = adresseNum;
		this.adresseLibelle = adresseLibelle;
		this.adresseCP = adresseCP;
		this.adresseVille = adresseVille;
		this.photo = photo;
		this.description = description;
	}
	
	public Maison() {
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public int getAdresseNum() {
		return adresseNum;
	}

	public void setAdresseNum(int adresseNum) {
		this.adresseNum = adresseNum;
	}

	public String getAdresseLibelle() {
		return adresseLibelle;
	}

	public void setAdresseLibelle(String adresseLibelle) {
		this.adresseLibelle = adresseLibelle;
	}

	public String getAdresseCP() {
		return adresseCP;
	}

	public void setAdresseCP(String adresseCP) {
		this.adresseCP = adresseCP;
	}

	public String getAdresseVille() {
		return adresseVille;
	}

	public void setAdresseVille(String adresseVille) {
		this.adresseVille = adresseVille;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Maison [id=" + id + ", idCompte=" + idCompte + ", adresseNum=" + adresseNum + ", adresseLibelle="
				+ adresseLibelle + ", adresseCP=" + adresseCP + ", adresseVille=" + adresseVille + ", photo=" + photo
				+ ", description=" + description + "]";
	}
	
	
	
	
	
	
	
}
