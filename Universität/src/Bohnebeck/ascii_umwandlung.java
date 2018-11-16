/**
 * 
 */
package Bohnebeck;

/**
 * @author Ole Jacobsen
 * Umwandlung von einer Integerzahl in seine Bytedarstellung (ASCII-Character).
 */
public class ascii_umwandlung {

	public static void main(String[] args) {
			
			int a = 757935403;			//Deklaration einer Integerzahl
			int b;
		
			while (a>0) {				//Die Eingabe wird in einen String gewandelt in dem die Hex-Werte der Blöcke stehen
				b=a%256;				/*Um diese Integerzahl in einem Ascii-Character umwandeln zu können, braucht man immer jeweils 2 vierer Blöcke
				 						der Bytezahl ,um einen Ascii Wert anzeigen zu können. Um jetzt auf diese 2er Blöcke zu kommen, benutzen wir den
				 						 Befehl modulo 256 von der Integerzahl a und bekommen einen 2er Block als Integerzahl ausgegeben.  */
				a=a/256;				// müssen wir machen, um die nächsten 2 vierer Blöcke zu bekommen
				System.out.print((char)b);		// Ausgabe des Ascii-haracters
			}
			System.out.print(" Programm von Ole Jacobsen");	//Textausgabe vom Ersteller
		}
}
