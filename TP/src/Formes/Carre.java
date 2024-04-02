package Formes;

public class Carre extends Forme{

	private int cote;
	
	public Carre(int cote) {
		
		this.cote = cote;
	}
	
	

	/**
	 * @return the cote
	 */
	public int getCote() {
		return cote;
	}



	/**
	 * @param cote the cote to set
	 */
	public void setCote(int cote) {
		this.cote = cote;
	}



	@Override
	public double calculerPerimetre() {
		
		return cote*4;
	}

	@Override
	public double calculerAire() {
		
		return cote*cote;
	}

	@Override
	public String toString() {
		
		var tmp = new StringBuilder();
		
		tmp.append("Carré de coté " + cote + "\n");
		tmp.append("Aire " + calculerAire() + "\n");
		tmp.append("Perimetre " + calculerPerimetre() + "\n");
		
		return tmp.toString();
	}

}
