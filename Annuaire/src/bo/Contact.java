package bo;

public class Contact {

	private long numero;
	private String nom;
	private String telephone;
	private String adresseMail;
	private Boolean favoris;
	private Adresse adresse;
	
	public Contact(long numero, String nom, String telephone, String adresseMail, Adresse adresse) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.telephone = telephone;
		this.adresseMail = adresseMail;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Contact [numero=" + numero + ", nom=" + nom + ", telephone=" + telephone + ", adresseMail="
				+ adresseMail + ", favoris=" + favoris + "]";
	}
	
	public String getNature() {
		return getClass().getName();
	}

	public long getNumero() {
		return numero;
	}

	public String getNom() {
		return nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getAdresseMail() {
		return adresseMail;
	}

	public Boolean getFavoris() {
		return favoris;
	}

	public Adresse getAdresse() {
		return adresse;
	}
	
	
}
