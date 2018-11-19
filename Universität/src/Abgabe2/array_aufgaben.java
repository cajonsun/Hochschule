package Abgabe2;

/**
 * Aufgaben zu Arrays und Schleifen:
 * Aufgabe 1   
 * @author Ole Jacobsen
 * 
 */
public class array_aufgaben {
	
	
		public static void main(String[] args) {
			int[] array1,array2;		//Initialisierung der Arrays
			int n = 10;					//Initialisierung und Deklaration von n
						
			array1 = new int [n];		//Deklaration von Array1
			array2 = new int [n];		//Deklaration von Array2
			
			//Ausgabe der Längen der Arrays
			System.out.println("Länge von Array1: "+array1.length+"\nLänge von Array2: "+array2.length);	
			
			//Ausgabe des Inhaltes der Arrays
			System.out.print("Inhalt des Array1: ");
			wertDeklaration(array1);
			ausgabe(array1);
			System.out.print("\nInhalt des Array2: ");
			ausgabe(array2);
			
			//Überprüfung, ob die Referenzen der Arrays gleich sind
			if (array1 == array2) {
				System.out.print("\nDie Referenzen der Arrays sind gleich");}
			else {
				System.out.print("\nDie Referenzen der Arrays sind nicht gleich");	
			}
			
			//Der Inhalt von Array1 wird in Array2 kopiert
			System.arraycopy(array1, 0, array2, 0, array1.length);		//array1 wird ab der stelle null in array 2 gespeichert.
																		//Und zwar auch ab der Stelle null für die Länge von array1 	
			System.out.print("\nInhalt des Array2: ");
			ausgabe(array2);
					
		}

		/**
		 * Gibt die einzelnen Werte des Arrays aus
		 * @param array
		 */
		public static void ausgabe(int[] array) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
		}
		
		/**
		 * Ändert die einzelnen Werte des Arrays
		 * @param array
		 */
		public static void wertDeklaration(int[] array) {
			for (int i = 0; i < array.length; i++) {
				array[i] = i;
			}
		}
		

}
