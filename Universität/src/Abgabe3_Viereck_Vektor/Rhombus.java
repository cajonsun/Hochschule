package Abgabe3_Viereck_Vektor;

public class Rhombus extends Parallelogramm {
	public Rhombus(double[] A, String name) throws ViereckException { super(A, null, null, name); }

	public Rhombus() {super();}
	
	public double getUmfang() {
		return 4 * seiteAB;
	}
	
	public double getFlaeche() {
		return seiteAB*seiteAB;
	}
	
	public void print() {
		System.out.println("\nDie Seitenlänge des "+name+" ist:");
		System.out.println("A: "+seiteAB);
	}
}
