package Abgabe2;

/**
 * Aufgabe 1 zu Kapitel 7 I 
 * @author Ole Jacobsen
 */
public class matrixOperations {

	/**
	 * Gibt die einzelnen Werte eines Arrays aus
	 * 
	 * @param array Ist das eingegebene Array, welches Ausgegeben werden soll
	 */
	public static void ausgabeArray(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Methode, um ein Array beliebiger Größe mit zufälligen
	 * Zahlenwerten zu erstellen und zurückzugeben
	 * 
	 * @param n Größe für die Zeilenanzahl
	 * @param m Größe für die Spaltenanzahl
	 * @return array Das neu generierte Array wird zurückgegeben
	 */
	public static int[][] randomArrayZahlenwerte(int n, int m) {
		int[][] array;

		// Erstellung von Radom Zahlenwerten zwischen 1 und 100 in dem Array
		if (n > 0 && m > 0) {

			array = new int[n][m];

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = (int) (Math.random() * 100);
				}
			}
		} else {
			System.out.println("Sie haben eine inkorrekte Dimensionsangabe gemacht");
			array = new int[0][0];
		}
		return array;
	}

	/**
	 * Addition von Arrays
	 * 
	 * @param array1 Vorderes Array für die Addition 
	 * @param array2  Hinteres array für die Addition 
	 * @return array3 Das neu enstandene Array aus der Addition von array1 und array2
	 */
	public static int[][] arrayAddition(int[][] array1, int[][] array2) {
		int[][] array3;
		
		// Abfrage, ob das erste Array genauso viele Zeilen wie
		// das zweite Array hat und genau dasselbe mit den Spalten
		if (array1.length == array2.length && array1[0].length == array2[0].length) {
			
			array3 = new int[array1.length][array1[0].length];
			
			// Addition der einzelnen Werte der Arrays
			for (int i = 0; i < array1.length; i++) { // Länge der Zeilen von Array1
				for (int j = 0; j < array1[0].length; j++) { // Länge der Spalten von Array1

					array3[i][j] = array1[i][j] + array2[i][j];	// Addition der Werte der
																// beiden Arrays
				}
			}
			System.out.println("Rückgabewert von Matrix3 durch Addition von Matrix1 und 2: ");
		} else {
			System.out.println("Sie haben eine inkorrekte Dimensionsangabe für eine Addition gemacht");
			array3 = new int[0][0];
		}
		return array3;
	}

	/**
	 * Multiplikation von Arrays
	 * 
	 * @param array1 Vorderes Array für die Multiplikation
	 * @param array2 Hinteres array für die Multiplikation
	 * @return array3 Das neu enstandene Array aus der Multiplikation von array1 und array2
	 */
	public static int[][] arrayMulti(int[][] array1, int[][] array2) {

		int[][] array3;
		
		//Abfrage, ob array1 genauso viele Zeilen hat wie array2 Spalten
		if (array2[0].length == array1.length) {

			array3 = new int[array1.length][array2[0].length]; 	// array3 hat die Zeilenlänge von array1
																// und die Spaltenlänge von array2

			for (int i = 0; i < array3[0].length; i++) { 	/* Das i gibt an in welcher Spalte wir uns bei array3 und
															 * array2 befinden
															 */
				for (int j = 0; j < array1.length; j++) { 	/* Das j gibt an in welcher Zeile wir uns bei array3 und bei
															 * array1 befinden
															 */
					for (int k = 0; k < array1[0].length; k++) { 					// Das k gibt an in welcher Spalte wir uns bei array1
						array3[j][i] = array3[j][i] + array1[j][k] * array2[k][i]; 	// und in welcher Zeile wir uns bei array2 befinden																					 
					}
				}
			}
			System.out.println("Rückgabewert von Matrix3 durch Multiplikation von Matrix1 und 2: ");
		} else {
			System.out.println("Sie haben eine inkorrekte Dimensionsangabe für eine Multiplikation gemacht");
			array3 = new int[0][0];
		}
		return array3;
	}

}
