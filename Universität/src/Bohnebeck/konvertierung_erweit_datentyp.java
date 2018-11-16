/**
 * 
 */
package Bohnebeck;

/**
 * @author Ole Jacobsen
 *Das sind die Ausgabewerte wenn man eine erweiternde Konvertierung von einer byte Zahl zu einer double Zahl macht.
 */ 
public class konvertierung_erweit_datentyp {
	
	public static void main(String[] args) {
		byte bytevariable = 4;		//Die Zahl 4 wird als Byte gespeichert 
		System.out.println("Die Bytevariable ist: "+bytevariable);		//Die Bytevariable wird ausgegeben
		
		short shortvariable = (short) bytevariable;		//Die Bytevariable wird in eine Shortvariable konvertiert
		System.out.println("Die Shortvariable ist: "+shortvariable);	//Die Shortvariable wird ausgegeben
		
		int intvariable = (int) shortvariable;			//Die Shortvaribale wird in eine Integervariable konvertiert
		System.out.println("Die Integervariable ist: "+intvariable);	//Die Integervariable wird ausgegeben
		
		long longvariable = (long) intvariable;			//Die Integervariable wird in eine Longvariable konvertiert
		System.out.println("Die Longvariable ist: "+longvariable);		//Die Longvariable wird ausgegeben
		
		float floatvariable = (float) longvariable;		//Die Longvariable wird in eine Floatvariable konvertiert
		System.out.println("Die Floatvariable ist: "+floatvariable);	//Die Floatvariable wird ausgegeben	
		
		double doublevariable = (double) floatvariable;	//Die Floatvariable wird in eine Doublevariable konvertiert
		System.out.println("Die Doublevariable ist: "+doublevariable);	//Die Doublezahl wird ausgegeben
		
	}	
}	
		


