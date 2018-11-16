package Abgabe2;
/**
 * Labor 4 Aufgabe 2 Ausgabe aller Primzahlen nach dem Prinzip des "Sieb des Eratosthenes"
 * @author Ole
 *
 */
public class primzahlen {
	
	/**
	 * Ausgabe aller Primzahlen im Intervall zwischen 2 und n
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean[] primzahlen;
		int max = 100;
		int sqr = (int) Math.sqrt(max) + 1;
		int i,j;
		primzahlen = new boolean[max+1];
		
		// alle Werte on dem Array werden auf True gesetzten
		for (i = 0; i<max+1; i++) {
			primzahlen[i] = true;	
		}
		
		//alle Vielfachen von den Primzahlen werden auf false gesetzt
		for(i=2;i<sqr;i++) {
			if(primzahlen[i])
				for(j=i+i;j<max+1;j+=i) {
					primzahlen[j] = false;
				}
		}
				
		// Primzahlen ausgeben
		for(i = 2;i<max+1; i++) {
			if (primzahlen[i])
				System.out.print(i+" ");
		}

	}
}	
