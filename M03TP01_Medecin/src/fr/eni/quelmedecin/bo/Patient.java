package fr.eni.quelmedecin.bo;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Patient extends Personne{

	private char sexe;
	private long numSecu;
	LocalDate ddn;
	String commentaire;

	private List<RendezVous> rdv = new ArrayList<RendezVous>();

	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu, LocalDate ddn,
			String commentaire, Adresse adresse) {
		super(nom, prenom, numeroDeTelephone, adresse);
		this.sexe = sexe;
		this.numSecu = numSecu;
		this.ddn = ddn;
		this.commentaire = commentaire;

	}

	public long getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(long numSecu) {
		this.numSecu = numSecu;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}

	public String getCommentaire() {
		return commentaire != null ? commentaire : "[aucun commentaire]";
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	void prendreRdv(RendezVous newRdv) {
		
		rdv.add(newRdv);
	}

	public String toString() {

		StringBuilder tmp = new StringBuilder();
		
		tmp.append(super.toString() + "\n");
		tmp.append(this.getAdresse().toString() + "\n");
		tmp.append("Sexe : " + (sexe == 'M' ? "Masculin" : "Féminin") + "\n");
		tmp.append("Numéro de Sécurité sociale : " + numSecu + "\n");
		tmp.append("Date de naissance : " + ddn.getDayOfMonth() + " "
				+ ddn.getMonth().getDisplayName(TextStyle.FULL, Locale.FRENCH) + " " + ddn.getYear() + "\n");
		tmp.append("Commentaires : " + getCommentaire());
		
		return tmp.toString();
	}

}
