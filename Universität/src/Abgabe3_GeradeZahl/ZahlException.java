package Abgabe3_GeradeZahl;

public class ZahlException extends Exception {

	public static final int UNGERADE 	= 1;
	public static final int BEREICH 	= 2;
	public static final int DATENTYP 	= 3;
	
	private int typ;
	
	public ZahlException(int typ) {
		super();
		this.typ = typ;
	}
	
	/**
	 * Überprüfung, welcher Fehler gemacht wurde und Abspeicherung 
	 * des Fehlertextes
	 */
	public String toString() {
		String txt;
		switch(typ) {
		case 1: txt = "Falsche Eingabe. Die Zahl ist ungerade";
				break;
		case 2: txt = "Falsche Eingabe. Die Zahl ist nicht im angegebenen Bereich";
				break;
		case 3: txt = "Falsche Eingabe. Es wurde keine Zahl eingegeben"	;
				break;
		default: txt ="Es ist ein unbekannter Fehler aufgetreten";
		}
		
		return txt;
	}
}
