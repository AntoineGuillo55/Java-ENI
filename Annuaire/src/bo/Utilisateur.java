package bo;

public class Utilisateur {

	private int id;
	private String nom;
	private String pseudo;
	private String motPasse;
	
	public Utilisateur(int id, String nom, String pseudo, String motPasse) {
		super();
		this.id = id;
		this.nom = nom;
		this.pseudo = pseudo;
		this.motPasse = motPasse;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", pseudo=" + pseudo + ", motPasse=" + motPasse + "]";
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getMotPasse() {
		return motPasse;
	}
	
	
}
