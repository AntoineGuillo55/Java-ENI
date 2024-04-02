package Formes;

public class Triangle extends Forme {
	
	private int coteA;
	private int coteB;
	private int coteC;
	
	public Triangle(int coteA, int coteB, int coteC) {

		this.coteA= coteA;
		this.coteB= coteB;
		this.coteC= coteC;
	}
	

	/**
	 * @return the coteA
	 */
	public int getCoteA() {
		return coteA;
	}



	/**
	 * @param coteA the coteA to set
	 */
	public void setCoteA(int coteA) {
		this.coteA = coteA;
	}



	/**
	 * @return the coteB
	 */
	public int getCoteB() {
		return coteB;
	}



	/**
	 * @param coteB the coteB to set
	 */
	public void setCoteB(int coteB) {
		this.coteB = coteB;
	}



	/**
	 * @return the coteC
	 */
	public int getCoteC() {
		return coteC;
	}



	/**
	 * @param coteC the coteC to set
	 */
	public void setCoteC(int coteC) {
		this.coteC = coteC;
	}



	@Override
	public double calculerPerimetre() {
	
		return coteA + coteB + coteC;
	}

	@Override
	public double calculerAire() {

		double demiPerimetre = calculerPerimetre()/2;
		double aire = Math.sqrt(demiPerimetre * (demiPerimetre - coteA) * (demiPerimetre - coteB) * (demiPerimetre - coteC));
		return aire;
	}

	@Override
	public String toString() {
	
		var tmp = new StringBuilder();
		
		tmp.append("Triangle de coté A=" + coteA + ", B=" + coteB + ", C=" + coteC + "\n");
		tmp.append("Aire " + calculerAire() + "\n");
		tmp.append("Perimetre " + calculerPerimetre() + "\n");
		
		return tmp.toString();
		
	}

}
