package bo;

import java.time.LocalDate;
import java.time.Period;

public class Personnel extends Contact{

	private LocalDate dateAnniversaire;

	public Personnel(long numero, String nom, String telephone, String adresseMail, Adresse adresse,
			LocalDate dateAnniversaire) {
		super(numero, nom, telephone, adresseMail, adresse);
		this.dateAnniversaire = dateAnniversaire;
	}
	
	public int getAge() {
		
		Period difference = Period.between(dateAnniversaire, LocalDate.now());
		
		return difference.getYears();
	}
	
	@Override
	public String getNature() {
		// TODO Auto-generated method stub
		return super.getNature();
	}

	public LocalDate getDateAnniversaire() {
		return dateAnniversaire;
	}

	
	
}
