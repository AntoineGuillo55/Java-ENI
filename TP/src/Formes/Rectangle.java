package Formes;

public class Rectangle extends Forme {

	private int largeur;
	private int longueur;
	
	public Rectangle(int largeur, int longueur) {
		// TODO Auto-generated constructor stub
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	

	/**
	 * @return the largeur
	 */
	public int getLargeur() {
		return largeur;
	}



	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}



	/**
	 * @return the longueur
	 */
	public int getLongueur() {
		return longueur;
	}



	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}



	@Override
	public double calculerPerimetre() {
		
		return (largeur*2)+(longueur*2);
	}

	@Override
	public double calculerAire() {
		
		return largeur*longueur;
	}

	@Override
	public String toString() {
		
		var tmp = new StringBuilder();
		
		tmp.append("Rectangle de largeur=" + largeur + " at longueur=" + longueur + "\n");
		tmp.append("Aire " + calculerAire() + "\n");
		tmp.append("Perimetre " + calculerPerimetre() + "\n");
		
		return tmp.toString();
	}

}
