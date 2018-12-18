package Abgabe3_Viereck_Vektor;

public class Konvexes_Viereck extends Viereck {
	public Konvexes_Viereck(double[] A, double[] B, double[] C, double[] D, String name) throws ViereckException {
		super(A, B, C, D, name);
		pospruef();
	}
	
	//Überprüft, ob die Punkte gegen den Uhrzeigersinn angegeben wurden
	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0] || punktB[1]>=punktC[1] || punktC[0]<=punktD[0] || punktD[1]<=punktA[1]) {
			throw new ViereckException(ViereckException.POSITION);
		}
	}
	
	public void eigenschaften() {
		System.out.println("Eigenschaften von einem "+name+":");
		System.out.println("-Die Diagonalen liegen innerhalb des Vierecks");
	}
	
}
