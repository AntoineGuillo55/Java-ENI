package fr.eni.quelmedecin.bo;

public class MedecinGeneraliste extends Medecin{

	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		super(nom, prenom, numeroDeTelephone, adresse);
	}
	
	@Override
	public int compareTo(Medecin o) {
		// TODO Auto-generated method stub
		return (this.getNom() + this.getPrenom()).compareTo(o.getNom()+o.getPrenom());
	}
	
	public void orienter() {
		System.out.println("Le médecin oriente vers un spécialiste en cas de besoin");
	};

}
