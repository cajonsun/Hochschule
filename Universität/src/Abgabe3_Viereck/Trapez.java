package Abgabe3_Viereck;

public class Trapez extends Konvexes_Viereck {
	
	public Trapez(int A, int B, int C, int D, String name) throws ViereckException {super(A, B, C, D, name);}

	public Trapez(int A,int B, String name) throws ViereckException {super(A, B, name);}
	
	public Trapez() {super();}
	
	public void eigenschaften()  {
		super.eigenschaften();
		System.out.println("Zwei Seiten sind parallel");
	}
}
