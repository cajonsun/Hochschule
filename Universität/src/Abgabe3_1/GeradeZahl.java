package Abgabe3_1;

public class GeradeZahl {
	int grenzeMin = Integer.MIN_VALUE;
	int grenzeMax = Integer.MAX_VALUE;	
	int zahl;
	
	try {		
		public GeradeZahl(int zahl) {
			this.zahl = zahl;
		}
	}
	
	public GeradeZahl add(GeradeZahl gz2) {
		int erg = zahl+gz2.zahl;
		GeradeZahl ergebnis = new GeradeZahl(erg);
		return ergebnis;
	}
	
	public GeradeZahl mult(GeradeZahl gz2) {
		GeradeZahl ergebnis = new GeradeZahl(zahl*gz2.zahl);
		return ergebnis;
	}
	
	
}
