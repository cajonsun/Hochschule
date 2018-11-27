package Abgabe3_Viereck;

public class Rechteck extends Parallelogramm {
	public Rechteck(int A, int B) {
		super(A, B);
	}

	public Rechteck() {super();}

	public int umfang() {return super.umfang();}
	
	public int flaeche() {
		int f = seiteA*seiteB;
		return f;
	}
}
