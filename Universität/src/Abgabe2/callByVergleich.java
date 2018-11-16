package Abgabe2;

/**
 * Labor 5 Aufgabe 2 zu Kapitel 7 Unterschiede zwischen call by value und call
 * by reference
 * 
 * @author Ole
 *
 */
public class callByVergleich {

	public static void main(String[] args) {
		int[] array = new int[] { 3 };
		int a = 3;

		System.out.println("Anfangswert von Array: " + array[0]);
		System.out.println("Anfangswert von a: " + a);

		arrayBerechnung(array);
		integerBerechnung(a);

		System.out.println("\nEndergebnis von Array: " + array[0]);
		System.out.println("Endergenis ohne Rückgabe des Wertes von a: " + a);

		a = integerBerechnungRueck(a);

		System.out.println("Endergenis mit Rückgabe des Wertes von a: " + a);

	}

	/**
	 * Addieren der Werte des Arrays mit 3
	 * 
	 * @param array
	 */
	public static void arrayBerechnung(int[] array) {
		array[0] = array[0] + 3;

	}

	/**
	 * Addieren der Variablen a mit 3, ohne Rückgabe des Wertes a
	 * 
	 * @param a
	 */
	public static void integerBerechnung(int a) {
		a = a + 3;
	}

	/**
	 * Addieren der Variablen a mit 3, mit Rückgabe des Wertes a
	 * 
	 * @param a
	 */
	public static int integerBerechnungRueck(int a) {
		a = a + 3;
		return a;
	}

}
