package Abgabe3_Viereck;

public class Konvexes_Viereck extends Viereck {
	public Konvexes_Viereck(int A, int B, int C, int D) throws ViereckException {super(A, B, C, D);}

	public Konvexes_Viereck(int A, int B) throws ViereckException {super(A, B);}
	
	public Konvexes_Viereck() {super();}
	
	public void eigenschaften()  {
		System.out.println("Die Diagonalen liegen innerhalb des Vierecks");
	}
}
