package Abgabe3_1;

public class GeradeZahlMain {

	public static void main(String[] args) {
		GeradeZahl gz1 = new GeradeZahl(4);
		GeradeZahl gz2 = new GeradeZahl(2);
		
		GeradeZahl gz3 = gz1.add(gz2);
		System.out.println("Das Ergebnis der Addition ist "+gz3.zahl);
		
		GeradeZahl gz4 = gz1.mult(gz2);
		System.out.println("Das Ergebnis der Multiplikation ist "+gz4.zahl);
	}
}
