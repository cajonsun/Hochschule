/**
 * 
 */
package Bohnebeck;

/**
 * @author Ole Jacobsen
 * Hier werden Integervariablen in Charvariablen kompiliert oder umgekehrt.
 */ 

public class converter_int_char {
	public static void main(String[] args) {
		int intvariable = 37;			// Deklaration von der Variablen invariable als Integer mit dem Wert 37
		char charvariable = (char) intvariable;		//Die Integervariable wird in eine Charvariable konvertiert
		System.out.println("Die Charvaribale ist: "+charvariable);	// Ausgabe der Charvariablen
		
		intvariable = (int) intvariable;		// Die Charvariable wird in eine Integervariable konvertiert
		System.out.print("Die Integervariable ist: "+intvariable);	//Ausgabe der Integervariablen
		
	}
}
