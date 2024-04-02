package fr.eni.quelmedecin.bo;

import java.util.ArrayList;
import java.util.List;

public abstract class Medecin extends Personne implements Soigner, Comparable<Medecin>{

	private int tarif = 25;
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	
	public Medecin(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		super(nom, prenom, numeroDeTelephone, adresse);
		// TODO Auto-generated constructor stub
	}
	
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	
	/**
	 * @return the tarif
	 */
	public int getTarif() {
		return tarif;
	}

	public String toString() {

		StringBuilder tmp = new StringBuilder();
		
		tmp.append(super.getNom().toUpperCase() + " " + super.getPrenom() + "\n");
		tmp.append("Téléphone : " + super.getNumeroDeTelephone() + "\n");
		tmp.append(this.afficherAdresseEtCreneaux());
		if(this instanceof MedecinSpecialiste) {
			tmp.append("Spécialité : " +((MedecinSpecialiste)this).getSpecialite() + "\n");
		}
		tmp.append("Tarif : " + tarif + "€ \n");
		
		return tmp.toString();
	}
	
	public String affichageSpécifique() {

		StringBuilder tmp = new StringBuilder();
		
		tmp.append(super.getNom().toUpperCase() + " " + super.getPrenom() + "\n");
		tmp.append("Téléphone : " + super.getNumeroDeTelephone() + "\n");
		tmp.append(this.getAdresse().toString() + "\n");
		if(this instanceof MedecinSpecialiste) {
			tmp.append("Spécialité : " +((MedecinSpecialiste)this).getSpecialite() + "\n");
		}
		tmp.append("Tarif : " + tarif + "€ \n");
		
		return tmp.toString();
	}
	
	void ajouterCreneau(Creneau newCreneau) {
		if(newCreneau.getMedecin() == this)
			creneaux.add(newCreneau);
	}

	public String afficherAdresseEtCreneaux() {
		// TODO Auto-generated method stub
		StringBuilder tmp = new StringBuilder();
		tmp.append("Adresse : \n" + super.getAdresse().toString() + "\n");
		tmp.append("Créneaux : \n");
		for(Creneau creneau: creneaux) {
			tmp.append(creneau.toString() + "\n"); 
		}
		
		return tmp.toString();
	}
	
	@Override
	public int compareTo(Medecin o) {
		// TODO Auto-generated method stub
		return this.getTarif() - o.getTarif();
	}
	
}
