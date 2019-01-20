package Abgabe3_GeradeZahl;

public class GeradeZahl {
	
	//Instanzvariablen
	int zahl;	
	int bereichMin = 1;
	int bereichMax = 100;
	
	//Konstruktor
	public GeradeZahl(int zahl) throws ZahlException {
		if (zahl>=bereichMin && zahl<=bereichMax) {		 	
			if (zahl%2 == 0) {
				this.zahl = zahl;
			} else {
				throw new ZahlException(ZahlException.UNGERADE);
			}
		} else {
			throw new ZahlException(ZahlException.BEREICH);
		}
	}
	
	//Methoden
	
	/**
	 * Addiert zwei gerade Zahlen
	 * @param gz2	Objekt einer Gerade Zahl, die addiert werden soll
	 * @return		Gibt das Ergebnis der Addition zurück
	 */
	public int add(GeradeZahl gz2) {
		int erg = zahl+gz2.zahl;		
		return erg;
	}
	
	/**
	 * Multipliziert zwei gerade Zahlen
	 * @param gz2	Objekt einer Gerade Zahl, die multipliziert werden soll
	 * @return		Gibt das Ergebnis der Multiplikation zurück
	 */
	public int mult(GeradeZahl gz2) {
		int erg = zahl*gz2.zahl;
		return erg;
	}


}
