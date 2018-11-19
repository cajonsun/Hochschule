package Abgabe2;
/**
 * Aufgabe zu Kapitel 5
 * @author Ole Jacobsen
 *
 */
public class nebeneffekt {
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
		int position = 2;
		int a;
		
		a = rueck(array, position);
		System.out.println("Ohne Nebeneffekt"+"\nWert von Array an der Position 3: "+array[position]+"  und Wert a ist: "+a);
		
		aenderung(array, position);
		System.out.println("Mit Nebeneffekt"+"\nWert von Array an der Position 3: "+array[position]+" und Wert a ist: "+a);
	
	}
	
	/**
	 * Rückgabe des Wertes  des Arrays an eingegebener 
	 * Position addiert mit 7 ohne Änderung des Arrays
	 * @param array
	 * @param position
	 * @return
	 */
	public static int rueck(int[] array, int position) {
		
		int a = array[position]+7;
		return a;
	}
	
	/**
	 * Rückgabe des Wertes  des Arrays an eingegebener 
	 * Position addiert mit 7 mit Änderung des Arrays 
	 * an der zugewiesenen Position
	 * geändert wird
	 * @param array
	 * @param position
	 * @return
	 */
	public static int aenderung(int[] array,int position) {
		
		array[position] = array[position]+7;
		int a = array[position];
		return a;
	}
	
}
