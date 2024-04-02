package tp_factorielle;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entrez un nombre pour calculer le factorielle:");
		int nombre = sc.nextInt();
		System.out.println("Factorielle de " + nombre + " est : " + factorielle(nombre));
	}

	public static int factorielle(int nombre) {

		int resultat = nombre;
		for(int i = nombre; i > 1; i--) {
			resultat = resultat * (i-1);
		}
		return resultat;
	}
}
