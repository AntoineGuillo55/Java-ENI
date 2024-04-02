package Formes;

public class Cercle extends Forme {

	private int rayon;
	
	public Cercle(int rayon) {
		
		this.rayon = rayon;
	}
	
	

	/**
	 * @return the rayon
	 */
	public int getRayon() {
		return rayon;
	}



	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}



	@Override
	public double calculerPerimetre() {

		return 2 * 3.14 * rayon;
	}

	@Override
	public double calculerAire() {
		return 3.14 * (rayon*rayon);
	}

	@Override
	public String toString() {

		var tmp = new StringBuilder();
		
		tmp.append("Cercle de rayon " + rayon + "\n");
		tmp.append("Aire " + calculerAire() + "\n");
		tmp.append("Perimetre " + calculerPerimetre() + "\n");
		
		return tmp.toString();
	}

}
