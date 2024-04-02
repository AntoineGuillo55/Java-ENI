package bo;

import java.time.LocalDate;

public class Journal extends Document {
	
	private LocalDate dateParution;

	public Journal(String titre, LocalDate dateParution) {
		super(titre);
		this.dateParution = dateParution;
	}

	@Override
	public String toString() {
		return "Journal [dateParution=" + dateParution + "]";
	}
	
}
