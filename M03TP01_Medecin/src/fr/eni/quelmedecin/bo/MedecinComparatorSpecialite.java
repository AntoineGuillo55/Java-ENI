package fr.eni.quelmedecin.bo;

import java.util.Comparator;

public class MedecinComparatorSpecialite implements Comparator<MedecinSpecialiste> {

	@Override
	public int compare(MedecinSpecialiste o1, MedecinSpecialiste o2) {
		// TODO Auto-generated method stub
		return o1.getSpecialite().compareToIgnoreCase(o2.getSpecialite());
	}

}
