package bo;

public class Adresse {

	private long code;
	private String rue;
	private String codepostal;
	private String ville;
	
	public Adresse(long code, String rue, String codepostal, String ville) {
		super();
		this.code = code;
		this.rue = rue;
		this.codepostal = codepostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [code=" + code + ", rue=" + rue + ", codepostal=" + codepostal + ", ville=" + ville + "]";
	}
	
}
