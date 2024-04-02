package tp_tri;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = {5, 9, 4 ,7 ,3 ,1 ,6 ,5 ,41 ,56 ,12 ,37}; 
		System.out.println("Tableau en entrée :");
		System.out.println(Arrays.toString(tab));
		System.out.println("Tableau en sortie :");
		System.out.println(Arrays.toString(triCroissantTableau(tab)));
	};

	public static int[] triCroissantTableau(int[] tab) {
		
		for(int i1 = 0; i1 < tab.length; i1++) {
			for(int i2 = i1+1 ; i2< tab.length; i2++) {
				if(tab[i1] > tab[i2]) {
					int tmp = tab[i1];
					tab[i1] = tab[i2];
					tab[i2] = tmp;
				} 
			}
		}
		return tab;
	}
}
