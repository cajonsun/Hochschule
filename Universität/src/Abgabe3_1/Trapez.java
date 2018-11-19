package Abgabe3_1;

public class Trapez extends Konvexes_Viereck {
	
	public Trapez(int A, int B, int C, int D) {super(A, B, C, D);}

	public Trapez(int A,int B) {super(A, B);}
	
	public Trapez() {super();}
	
	public void eigenschaften()  {
		super.eigenschaften();
		System.out.println("Zwei Seiten sind parallel");
	}
}
