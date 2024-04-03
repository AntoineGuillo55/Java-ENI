package bo;

public class Professionnel extends Contact{
	
	private String nomEntreprise;

	public Professionnel(long numero, String nom, String telephone, String adresseMail, Adresse adresse,
			String nomEntreprise) {
		super(numero, nom, telephone, adresseMail, adresse);
		this.nomEntreprise = nomEntreprise;
	}

	@Override
	public String getNature() {
		// TODO Auto-generated method stub
		return super.getNature();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}
	
	
	
}
