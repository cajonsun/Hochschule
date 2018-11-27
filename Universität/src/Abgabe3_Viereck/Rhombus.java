package Abgabe3_Viereck;

public class Rhombus extends Parallelogramm {
	public Rhombus(int A) {
		this.seiteA = A;
	}

	public Rhombus() {super();}
	
	public int umfang() {
		int u = 4 * seiteA;
		return u;
	}
	
	public int flaeche() {
		int f = seiteA*seiteA;
		return f;
	}
}
