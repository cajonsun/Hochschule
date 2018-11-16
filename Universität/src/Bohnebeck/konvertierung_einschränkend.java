/**
 * 
 */
package Bohnebeck;

/**
 * @author Ole Jacobsen
 * Das sind die Ausgabewerte wenn man eine einschränkende Konvertierung von einer double Zahl zu einer byte Zahl macht.
 */ 
public class konvertierung_einschränkend {
	
	public static void main(String[] args) {
		double doublevariable = 550.321;		//Die Zahl 550.321 wird als Double abgespeichert
		
		System.out.println("Die Doublevariable ist: "+doublevariable);	//Die Doublezahl wird ausgegeben 
		
		float floatvariable = (float) doublevariable;		//Die Doublevariable in eine Floatvariable konvertiert 
		System.out.println("Die Floatvariable ist: "+floatvariable);	//Die Floatzahl wird ausgegeben
		
		long longvariable = (long) floatvariable;			//Die Floatvariable wird in eine Longvariable konvertiert
		System.out.println("Die Longvariable ist: "+longvariable);		//Die Longzahl wird ausgegeben
		
		int intvariable = (int) longvariable;				//Die Longvariable wird in eine Integervariable konvertiert
		System.out.println("Die Integervariable ist: "+intvariable);	//Die Integervariable wird ausgegeben
		
		short shortvariable = (short) intvariable;			//Die Integervariable wird in eine Shortvariable konvertiert
		System.out.println("Die Shortvariable ist: "+shortvariable);	//Die Shortvariable wird ausgegeben
		
		byte bytevariable = (byte) shortvariable;			//Die Shortvariable wird in eine Bytevariable konvertiert
		System.out.println("Die Bytevariable ist: "+bytevariable); //DIe Bytevaribale wird ausgegeben
		
	}	
}
