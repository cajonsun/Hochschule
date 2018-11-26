package Abgabe3_1;

public class ZahlException extends Exception {

	public static final int UNGERADE 	= 1;
	public static final int BEREICH 	= 2;
	private int typ;
	
	public ZahlException(int typ) {
		super();
		this.typ = typ;
	}
	
	public String toString() {
		String txt;
		switch(typ) {
		case 1: txt = "Die Zahl ist ungerade";
				break;
		case 2: txt = "Die Zahl ist nicht im angegebenen Bereich";
				break;
		default: txt ="Es ist ein unbekannter Fehler aufgetreten";
		}
		
		return txt;
	}
}
