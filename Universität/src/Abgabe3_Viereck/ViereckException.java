package Abgabe3_Viereck;

public class ViereckException extends Exception{

	public static final int NEGATIV 	= 1;
	public static final int ANZAHL	 	= 2;
	
	private int typ;
	
	public ViereckException(int typ) {
		super();
		this.typ = typ;
	}
	
	public String toString() {
		String txt;
		switch(typ) {
		case 1: txt = "Die Zahl ist negativ du bitch. Tu doch nicht machen auf so dumm";
				break;
//		case 2: txt = "Die Zahl ist nicht im angegebenen Bereich";
//				break;
//		case 3: txt = "Es wurde keine Zahl eingegeben"	;
//				break;
		default: txt ="Es ist ein unbekannter Fehler aufgetreten";
		}
		
		return txt;
	}
}
