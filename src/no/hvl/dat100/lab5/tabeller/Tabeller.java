//Oppgave 1 - Oblig 2.
package no.hvl.dat100.lab5.tabeller;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		
		for (int i = 0;i<tabell.length;i++) {
			System.out.print(tabell[i] + " ");
		}
		
		System.out.println("]");
	}

	

	// b)
	public static String tilStreng(int[] tabell) {
		
		String streng = "[";
		
		for (int i = 0; i<tabell.length; i++) {
			
			if ( i == tabell.length-1) {
				streng += tabell[i];
				
			} else {
				streng += tabell[i] + ",";
			}
		}
		streng += "]";
		return streng;
	    
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for(int sumAlt : tabell) 
			sum+=sumAlt;
		return sum;
		
	
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		 boolean funnet = false;
		 int pos = 0;
		 
		 while (!funnet && pos < tabell.length) {
			 if (tall == tabell[pos]) {
				 funnet = true;
			 }
			 
			 pos++;
		 }
			 return funnet;
		 }
		
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		
		
		for (int i = 0; i < tabell.length; i++) {
		
			if(tall == tabell[i]) {
			
				return i;
				
			} 
		
		}
		return -1;	
	}
	

	// f)
	public static int[] reverser(int[] tabell) {

		int a = tabell.length;
		int tab2[] = new int [a];
		
		int j = a;
		
		for(int i = 0; i < a; i++)	{
			tab2[j-1] = tabell[i];
			j = j-1;
			
		}
		
		
		for(int k = 0; k < a; k++)	{
			
			System.out.println(tab2[k]); 
		
		}
			
			return tab2;
		
		
	}
		
	

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 1;
		while (sortert && i < tabell.length) {
			if (tabell[i-1] <= tabell[i])
				i++;
		else 
		sortert = false;
		
		}
		return sortert;
	}	
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[nyLengde];
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i]=tabell1[i];
		}
	
	for(int j = 0; j < tabell2.length; j++) {
		nyTabell[tabell1.length+j] = tabell2[j];
		
	}
	return nyTabell;
	}
}
