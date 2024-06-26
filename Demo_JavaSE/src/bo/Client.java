package bo;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String nom;
	private String prenom;
	private int age;
	
	private List<Empruntable> emprunts;
	
	public Client(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		emprunts = new ArrayList<Empruntable>();
	}
	
	public void emprunter(Empruntable emprunt) {
		
		if(emprunts.size() >= 3)
			return;
		
		emprunts.add(emprunt);
		
	}
	
	public void rendre(Empruntable emprunt) {
		emprunts.remove(emprunt);
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", emprunts=" + emprunts + "]";
	}
	
	
}
