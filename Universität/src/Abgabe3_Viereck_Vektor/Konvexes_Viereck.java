package Abgabe3_Viereck_Vektor;

public class Konvexes_Viereck extends Viereck {
	public Konvexes_Viereck(double[] A, double[] B, double[] C, double[] D, String name) throws ViereckException {
		super(A, B, C, D, name);
	}
	
	public void eigenschaften() {
		System.out.println("Eigenschaften von einem "+name+":");
		System.out.println("-Die Diagonalen liegen innerhalb des Vierecks");
	}
	
}
