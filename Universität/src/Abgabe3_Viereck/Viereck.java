package Abgabe3_Viereck;

import Abgabe3_GeradeZahl.ZahlException;

public class Viereck {

	protected int seiteA;
	protected int seiteB;
	protected int seiteC;
	protected int seiteD;
	String name;

	public Viereck(int A, int B, int C, int D, String name) throws ViereckException {
		if (A>0 && B>0 && C>0 && D>0) {
			this.seiteA = A;
			this.seiteB = B;
			this.seiteC = C;
			this.seiteD = D;
			this.name	= name;
		} else {
			throw new ViereckException(ViereckException.NEGATIV);
		}
	}

	public Viereck(int A,int B, String name) throws ViereckException {
		if (A>0 && B>0) {
			this.seiteA = A;
			this.seiteB = B;
			this.name	= name;
		} else {
			throw new ViereckException(ViereckException.NEGATIV);
		}
	}
	
	public Viereck(int A, String name) throws ViereckException {
		if (A>0) {
		this.seiteA = A;
		this.name	= name;
		} else {
			throw new ViereckException(ViereckException.NEGATIV);
		}
	}
	
	public Viereck() {}

	public int umfang() {
		int u = seiteA + seiteB + seiteC + seiteD;
		return u;
	}
	
	public void flaeche() {
		System.out.println("Den Flächeninhalt kann man ohne Winkel nicht errechnen");
	}
	
	public void print() {
		System.out.println("Die Seitenlängen des "+name+" sind:");
		System.out.println("A: "+seiteA+"\tB: "+seiteB);
		System.out.println("C: "+seiteC+"\tD: "+seiteD);
	}
}
