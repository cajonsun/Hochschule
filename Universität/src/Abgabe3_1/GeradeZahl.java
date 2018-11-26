package Abgabe3_1;


public class GeradeZahl {
	int zahl;	
	
	public GeradeZahl(int zahl) throws ZahlException {
//		try {
			if (zahl%2 == 0) {
				this.zahl = zahl;
			} else {
				throw new ZahlException(ZahlException.UNGERADE);
			}
/*		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
*/			
	}
	
	public GeradeZahl add(GeradeZahl gz2) throws Exception {
		int erg = zahl+gz2.zahl;		
		GeradeZahl ergebnis = new GeradeZahl(erg);
		return ergebnis;
	}
	
	public GeradeZahl mult(GeradeZahl gz2) {
		GeradeZahl ergebnis = null;
		try {
			ergebnis = new GeradeZahl(zahl*gz2.zahl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ergebnis;
	}


}
