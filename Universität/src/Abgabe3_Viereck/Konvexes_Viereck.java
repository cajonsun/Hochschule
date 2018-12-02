package Abgabe3_Viereck;

public class Konvexes_Viereck extends Viereck {
	public Konvexes_Viereck(int A, int B, int C, int D, String name) throws ViereckException {super(A, B, C, D, name);}

	public Konvexes_Viereck(int A, int B, String name) throws ViereckException {super(A, B, name);}
	
	public Konvexes_Viereck() {super();}
	
	public void eigenschaften() {
		System.out.println("Eigenschaften von einem "+name+":");
		System.out.println("-Die Diagonalen liegen innerhalb des Vierecks");
	}
	
}
