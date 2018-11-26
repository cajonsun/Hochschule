package Abgabe3_1;

public class Konvexes_Viereck extends Viereck {
	public Konvexes_Viereck(int A, int B, int C, int D) {super(A, B, C, D);}

	public Konvexes_Viereck(int A,int B) {super(A, B);}
	
	public Konvexes_Viereck() {super();}
	
	public void eigenschaften()  {
		System.out.println("Die beiden Diagonalen liegen innerhalb des Vierecks");
	}
}
