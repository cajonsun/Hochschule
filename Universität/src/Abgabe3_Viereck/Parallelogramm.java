package Abgabe3_Viereck;

public class Parallelogramm extends Trapez {
	public Parallelogramm(int A, int B, String name) throws ViereckException {super(A, B, name);}

	public Parallelogramm() {super();}

	public int umfang() {
		int u = 2 * seiteA + 2 * seiteB;
		return u;
	}
	
	public void print() {
		System.out.println("\nDie Seitenlängen des "+name+" sind:");
		System.out.println("A: "+seiteA+"\tB: "+seiteB);
	}
}
