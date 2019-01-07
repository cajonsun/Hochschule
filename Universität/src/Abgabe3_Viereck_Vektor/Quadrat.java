package Abgabe3_Viereck_Vektor;

public class Quadrat extends Rhombus {
	public Quadrat(double[] A, double[] B, String name) throws ViereckException {
		super(A, B, null, name);	
	}
	
	/**
	 * Überprüft, ob die Punkte gegen den Uhrzeigersinn angegeben wurden 
	 * @throws ViereckException
	 */
	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0]) {
			throw new ViereckException(ViereckException.POSITION);
		}		
	}
	
	/**
	 * Beschreibt die Eigenschaften des Quadrats
	 */
	public void eigenschaften() {
		super.eigenschaften();
	    System.out.println("-Alle Winkel sind 90 Grad");
	}
	
	/**
	 * Berechnet die Flaeche des Vierecks
	 */
	public double getFlaeche() {
		return seiteAB*seiteAB;
	}
	
	/**
	 * Gibt die Art, die einzelnen Punkte, den Flaecheninhalt und den
	 * Umfang des Vierecks wieder
	 */
	public void print() {
		System.out.println("\n"+name);
		System.out.print("PunktA["+punktA[0]+","+punktA[1]+"]");
		System.out.println("\tPunktB["+punktB[0]+","+punktB[1]+"]");
		System.out.println("Umfang: "+getUmfang());
		System.out.println("Fläche: "+getFlaeche());
	}
}
