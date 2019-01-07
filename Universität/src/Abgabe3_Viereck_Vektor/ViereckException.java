package Abgabe3_Viereck_Vektor;

public class ViereckException extends Exception{

	public static final int NEGATIV 	= 1;
	public static final int WINKEL	 	= 2;
	public static final int POSITION	= 3;
	
	private int typ;
	
	public ViereckException(int typ) {
		super();
		this.typ = typ;
	}
	
	/**
	 * Gibt eine bestimmte Fehlermeldung aus
	 */
	public String toString() {
		String txt;
		switch(typ) {
		case 1: txt = "Die Zahl ist negativ";
				break;
		case 2: txt = "Der Winkel ist nicht 90 Grad";
				break;
		case 3: txt = "Punkte falsch ausgewählt"	;
				break;
		default: txt ="Es ist ein unbekannter Fehler aufgetreten";
		}
		
		return txt;
	}
}
