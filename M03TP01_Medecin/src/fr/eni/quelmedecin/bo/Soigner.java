package fr.eni.quelmedecin.bo;

public interface Soigner {

	public default void examiner() {
		
		System.out.println("Le médecin procède à des examens de routine sur les patients (auscultation, prise de tensions, ...");
	}

	public default void diagnostiquer() {
		
		System.out.println("Le médecin évalue l'état de santé du patient pour découvrir d'éventuels problèmes");
	}

	public default void traiter() {
		
		System.out.println("Le médecin met en place un traitement adapté");
	}

	public default void conseiller() {
		
		System.out.println("Le médecin dispense des conseils appropriés pour des habitudes saines(régime, hygiène, etc.)");
	}
}