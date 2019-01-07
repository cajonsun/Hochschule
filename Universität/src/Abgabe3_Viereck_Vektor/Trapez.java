package Abgabe3_Viereck_Vektor;

public class Trapez extends Konvexes_Viereck {
	
	public Trapez(double[] A, double[] B, double[] C, double[] D, String name) throws ViereckException {
		super(A, B, C, D, name);
	}

	/**
	 * Beschreibt die Eigenschaften des Trapezes
	 */
	public void eigenschaften() {
		super.eigenschaften();
		System.out.println("-Zwei gegenüberliegende Seiten sind parallel");
	}
}
