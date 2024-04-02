package bo;

public class Main {

	public static void main(String[] args) {
		
		Livre jordan = new Livre("The wolf of wall street", 300);
		Livre cleanCode = new Livre("Clean Code", 400);
		
		PC hp = new PC("HP", "Laptop", "SSD 1TO", "Nvidia RTX 4090", "I9 14900X");
		PC dell = new PC("dell", "Laptop", "SSD 500GO", "Nvidia RTX 3040", "I5 13000H");
		
		BD tintin = new BD("Tintin", "HERGE");
		
		Client gaelle = new Client("Maisel", "Gaelle", 25);
		Client hugo = new Client("Dupint", "Hugo", 30);
		
		gaelle.emprunter(dell);
		gaelle.emprunter(cleanCode);
		
		System.out.println(gaelle.toString());
		
	}
}