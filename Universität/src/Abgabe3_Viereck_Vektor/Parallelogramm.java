package Abgabe3_Viereck_Vektor;

public class Parallelogramm extends Trapez {
	public Parallelogramm(double[] A, double[] B, double[] C, String name) throws ViereckException {
		super(A, B, C, null, name);
	}

	/**
	 * Überprüft, ob die Punkte gegen den Uhrzeigersinn angegeben wurden
	 * @throws ViereckException
	 */
	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0] || punktB[1]>=punktC[1]) {
			throw new ViereckException(ViereckException.POSITION);
		}
	}
	
	/**
	 * Beschreibt die Eigenschaften des Parallelogramms
	 */
	public void eigenschaften() {
		System.out.println("Eigenschaften von einem "+name+":");
		System.out.println("-Die Diagonalen liegen innerhalb des Vierecks");
		System.out.println("-Die gegenüberliegenden Seiten sind parallel und gleichlang");
	}
	
	/**
	 * Berechnet den Umfang des Vierecks
	 */
	public double getUmfang() {
		return 2 * seiteAB + 2 * seiteBC;
	}
	
	/**
	 * Berechnet die Flaeche des Vierecks
	 */
	public double getFlaeche() {
		return getHoehe(punktA, punktB, punktC)*getSeitenlaenge(punktA, punktB);
	}
	
	/**
	 * Gibt die Art, die einzelnen Punkte, den Flaecheninhalt und den
	 * Umfang des Vierecks wieder
	 */
	public void print() {
		System.out.println("\n"+name);
		System.out.print("PunktA["+punktA[0]+","+punktA[1]+"]");
		System.out.println("\tPunktB["+punktB[0]+","+punktB[1]+"]");
		System.out.println("PunktC["+punktC[0]+","+punktC[1]+"]");
		System.out.println("Umfang: "+getUmfang());
		System.out.println("Fläche: "+getFlaeche());
	}
}
