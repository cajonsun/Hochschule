package Abgabe3_Viereck_Vektor;

public class Parallelogramm extends Trapez {
	public Parallelogramm(double[] A, double[] B, double[] C, String name) throws ViereckException {super(A, B, C, null, name);}

	public Parallelogramm() {super();}

	public double getUmfang() {
		return 2 * seiteAB + 2 * seiteBC;
	}
	
	public void print() {
		System.out.println("\nDie Seitenlängen des "+name+" sind:");
		System.out.println("A: "+seiteAB+"\tB: "+seiteBC);
	}
}
