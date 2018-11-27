package Abgabe3_Viereck;

public class Viereck {

	protected int seiteA;
	protected int seiteB;
	protected int seiteC;
	protected int seiteD;

	public Viereck(int A, int B, int C, int D) {
		this.seiteA = A;
		this.seiteB = B;
		this.seiteC = C;
		this.seiteD = D;
	}

	public Viereck(int A,int B) {
		this.seiteA = A;
		this.seiteB = B;
	}
	
	public Viereck(int A) {this.seiteA = A;}
	
	public Viereck() {}

	public int umfang() {
		int u = seiteA + seiteB + seiteC + seiteD;
		return u;
	}
}
