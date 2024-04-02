package fr.eni.quelmedecin.bo;

import java.util.Comparator;

public class PersonneComparatorNomPrenom implements Comparator<Personne> {

	@Override
	public int compare(Personne o1, Personne o2) {
		// TODO Auto-generated method stub
		return (o1.getNom()+o1.getPrenom()).compareToIgnoreCase(o2.getNom()+o2.getPrenom());
	}

}
