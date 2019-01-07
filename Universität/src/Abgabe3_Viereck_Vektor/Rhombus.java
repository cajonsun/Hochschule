package Abgabe3_Viereck_Vektor;

public class Rhombus extends Parallelogramm {
	public Rhombus(double[] A, double[] B, double[] C, String name) throws ViereckException { 
		super(A, B, C, name); 
	}

	/**
	 * Überprüft, ob die Punkte gegen den Uhrzeigersinn angegeben wurden
	 * und ob beide Seiten gleichlang sind 
	 * @throws ViereckException
	 */
	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0] || punktB[1]>=punktC[1] || seiteAB!=seiteBC) {
			throw new ViereckException(ViereckException.POSITION);
		}
	}
		
	/**
	 * Beschreibt die Eigenschaften des Rhombus
	 */
	public void eigenschaften() {
		System.out.println("Eigenschaften von einem "+name+":");
		System.out.println("-Die Diagonalen liegen innerhalb des Vierecks");
		System.out.println("-Die gegenüberliegenden Seiten sind parallel");
		System.out.println("-Alle Seiten sind gleichlang");
	}
	
	/**
	 * Berechnet den Umfang des Vierecks
	 */
	public double getUmfang() {
		return 4 * seiteAB;
	}	
}
