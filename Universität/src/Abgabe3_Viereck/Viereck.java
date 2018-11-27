package Abgabe3_Viereck;

import Abgabe3_GeradeZahl.ZahlException;

public class Viereck {

	protected int seiteA;
	protected int seiteB;
	protected int seiteC;
	protected int seiteD;

	public Viereck(int A, int B, int C, int D) throws ViereckException {
		if (A>0 && B>0 && C>0 && D>0) {
			this.seiteA = A;
			this.seiteB = B;
			this.seiteC = C;
			this.seiteD = D;
		} else {
			throw new ViereckException(ViereckException.NEGATIV);
		}
			

	}

	public Viereck(int A,int B) throws ViereckException {
		if (A>0 && B>0) {
			this.seiteA = A;
			this.seiteB = B;
		} else {
			throw new ViereckException(ViereckException.NEGATIV);
		}
	}
	
	public Viereck(int A) throws ViereckException {
		if (A>0) {
		this.seiteA = A;
		} else {
			throw new ViereckException(ViereckException.NEGATIV);
		}
	}
	
	public Viereck() {}

	public int umfang() {
		int u = seiteA + seiteB + seiteC + seiteD;
		return u;
	}
}
