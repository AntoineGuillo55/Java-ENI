package fr.eni.quelmedecin.bo;

public class Adresse {
	private String complementAdresse;
	private int numero;
	private String compNum;
	private String voie;
	private int codePostal;
	private String ville;

	/**
	 * 
	 * @param complementAdresse 
	 * @param numero 
	 * @param compNum 
	 * @param voie
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(String complementAdresse, int numero, String compNum, String voie, int codePostal, String ville) {
		super();
		this.complementAdresse = complementAdresse;
		this.numero = numero;
		this.compNum = compNum;
		this.voie = voie;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse(int numero, String compNum, String voie, int codePostal, String ville) {
		this(null, numero, compNum, voie, codePostal, ville);
	}

	public String getComplementAdresse() {
		return complementAdresse;
	}

	public void setComplementAdresse(String complementAdresse) {
		this.complementAdresse = complementAdresse;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCompNum() {
		return compNum;
	}

	public void setCompNum(String compNum) {
		this.compNum = compNum;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String toString() {

		StringBuilder tmp = new StringBuilder();
		if (complementAdresse != null) {
			tmp.append(complementAdresse);
		}
		tmp.append(numero + (compNum == null ? "" : compNum)+ " " + voie + "\n");
		tmp.append(codePostal + " " + ville.toUpperCase());
	
		return tmp.toString();
	}

}
