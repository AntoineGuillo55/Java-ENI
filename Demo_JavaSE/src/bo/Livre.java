package bo;

public class Livre extends Document implements Empruntable{
	
	private int nombrePages;

	public Livre(String titre, int nombrePages) {
		super(titre);
		this.nombrePages = nombrePages;
	}

	@Override
	public String toString() {
		return "Livre [nombrePages=" + nombrePages + ", titre=" + titre + "]";
	}	
	
}
