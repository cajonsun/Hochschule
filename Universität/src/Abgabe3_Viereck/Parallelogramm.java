package Abgabe3_Viereck;

public class Parallelogramm extends Trapez {
	public Parallelogramm(int A, int B) {super(A, B);}

	public Parallelogramm() {super();}

	public int umfang() {
		int u = 2 * seiteA + 2 * seiteB;
		return u;
	}
}
