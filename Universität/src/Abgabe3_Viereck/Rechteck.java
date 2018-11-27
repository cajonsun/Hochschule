package Abgabe3_Viereck;

public class Rechteck extends Parallelogramm {
	public Rechteck(int A, int B, String name) throws ViereckException {super(A, B, name);}

	public Rechteck() {super();}

	public int umfang() {return super.umfang();}
	
	public void flaeche() {
		int f = seiteA*seiteB;
		System.out.println("Der Flächeninhalt beträgt "+f);
	}
	
}
