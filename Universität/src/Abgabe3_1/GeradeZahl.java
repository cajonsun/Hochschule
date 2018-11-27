package Abgabe3_1;

public class GeradeZahl {
	int zahl;	
	int bereichMin = 5;
	int bereichMax = 50;
	
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
	
	public GeradeZahl add(GeradeZahl gz2) throws ZahlException {
		int erg = zahl+gz2.zahl;		
		GeradeZahl ergebnis = new GeradeZahl(erg);
		return ergebnis;
	}
	
	public GeradeZahl mult(GeradeZahl gz2) throws ZahlException {
		GeradeZahl	ergebnis = new GeradeZahl(zahl*gz2.zahl);
		return ergebnis;
	}


}
