package Abgabe2;

/**
 * Labor 5 Aufgabe 1 zu Kapitel 7 Methoden zur Initialisierung 
 * und Deklaration von Matrizen mit zufälligen Werten, Ausgabe 
 * dieser Matrizen und Addition und Multiplikation von zwei Matrizen
 * 
 * @author Ole
 */
public class matrixOperations {

	/**
	 * Gibt die einzelnen Werte einer Matrix aus
	 * 
	 * @param array
	 */
	public static void ausgabeArray(int[][] array) {
		
		//Ausgabe jedes Wertes der Matrix
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Methode, um eine Matrix beliebiger Größe mit zufälligen
	 * Zahlenwerten zu erstellen und zurückzugeben
	 * 
	 * @param array
	 * @return array
	 */
	public static int[][] randomArrayZahlenwerte(int n, int m) {
		int[][] array;

		// Erstellung von Radom Zahlenwerten in der Matrix
		if (n > 0 && m > 0) {

			array = new int[n][m];

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[0].length; j++) {
					array[i][j] = (int) (1 + ((Math.random() * 100)));
				}
			}
		} else {
			System.out.println("Sie haben eine inkorrekte Dimensionsangabe gemacht");
			array = new int[0][0];
		}
		return array;
	}

	/**
	 * Addition von Matrizen
	 * 
	 * @param array1
	 * @param array2
	 * @return array3
	 */
	public static int[][] arrayAddition(int[][] array1, int[][] array2) {
		int[][] array3;
		
		//Abfrage, ob die erste Matrix genauso viele Zeilen wie
		//die zweite Matrix hat und genau dasselbe mit den Spalten
		if (array1.length == array2.length && array1[0].length == array2[0].length) {
			
			array3 = new int[array1.length][array1[0].length];
			
			//Addition der einzelnen Werte der Matrizen
			for (int i = 0; i < array1.length; i++) { // Länge der Zeilen von Array1
				for (int j = 0; j < array1[0].length; j++) { // Länge der Spalten von Array1

					array3[i][j] = array1[i][j] + array2[i][j];
				}
			}
			System.out.println("Rückgabewert von Matrix3 durch Addition der Matrix1 und 2: ");
		} else {
			System.out.println("Sie haben eine inkorrekte Dimensionsangabe für eine Addition gemacht");
			array3 = new int[0][0];
		}
		return array3;
	}

	/**
	 * Multiplikation von Matrizen
	 * 
	 * @param array1
	 * @param array2
	 * @return
	 */
	public static int[][] arrayMulti(int[][] array1, int[][] array2) {

		int[][] array3;
		
		//Abfrage, ob Matrix1 genauso viele Zeilen hat wie Matrix2 Spalten
		if (array2[0].length == array1.length) {

			array3 = new int[array1.length][array2[0].length]; 	// array3 hat die Zeilenlänge von array1
																// und die Spaltenlänge von array2

			for (int i = 0; i < array3[0].length; i++) { 	/*
															 * Das i gibt an in welcher Spalte wir uns bei array3 und
															 * array2 befinden
															 */
				for (int j = 0; j < array1.length; j++) { 	/*
															 * Das j gibt an in welcher Zeile wir uns bei array3 und bei
															 * array1 befinden
															 */
					for (int k = 0; k < array1[0].length; k++) { 					// Das k gibt an in welcher Spalte wir uns bei array1
						array3[j][i] = array3[j][i] + array1[j][k] * array2[k][i]; 	// und in welcher Zeile wir uns bei
																					// array2 befinden
					}
				}
			}
			System.out.println("Rückgabewert von Matrix3 durch Multiplikation der Matrix1 und 2: ");
		} else {
			System.out.println("Sie haben eine inkorrekte Dimensionsangabe für eine Multiplikation gemacht");
			array3 = new int[0][0];
		}
		return array3;
	}

}
