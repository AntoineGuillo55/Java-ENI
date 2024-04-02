package Formes;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		var formes = new ArrayList<Forme>();
		formes.add(new Cercle(3));
		formes.add(new Rectangle(3, 4));
		formes.add(new Carre(4));
		formes.add(new Triangle(4, 5, 6));
		
		for(var forme : formes) {
			System.out.println(forme.toString());
		}
	}

}
