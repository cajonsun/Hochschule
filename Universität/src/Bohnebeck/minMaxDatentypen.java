/**
 * 
 */
package Bohnebeck;

/**
 * @author Ole Jacobsen
 * Die Methoden um die Wertebereiche der einzelnen Datentypen anzuzeigen.
 */
public class minMaxDatentypen {
	
	public static void main(String[] args) {
	

		System.out.print ("Der Wertebereich des Datentyps byte geht von: ");
		System.out.println (Byte.MIN_VALUE+ " bis "+Byte.MAX_VALUE);	

		System.out.print ("Der Wertebereich des Datentyps short geht von: ");
		System.out.println (Short.MIN_VALUE+" bis "+Short.MAX_VALUE);

		System.out.print ("Der Wertebereich des Datentyps int geht von: ");
		System.out.println (Integer.MIN_VALUE+" bis "+Integer.MAX_VALUE);
	
		System.out.print ("Der Wertebereich des Datentyps long geht von: ");
		System.out.println (Long.MIN_VALUE+" bis "+Long.MAX_VALUE);

		System.out.print ("Der Wertebereich des Datentyps float geht von: ");
		System.out.println (Float.MIN_VALUE+" bis "+Float.MAX_VALUE);

		System.out.print ("Der Wertebereich des Datentyps double geht von: ");
		System.out.println (Double.MIN_VALUE+" bis "+Double.MAX_VALUE);

	}
}
