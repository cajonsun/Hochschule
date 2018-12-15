package Abgabe3_Viereck_Vektor;

public class Rhombus extends Parallelogramm {
	public Rhombus(double[] A, double[] B, String name) throws ViereckException { super(A, B, null, name); }

//	public Rhombus() {super();}
	
	//Berechnet den Umfang des Vierecks
	public double getUmfang() {
		return 4 * seiteAB;
	}
	
	//Gibt die Seitenlaengen des Vierecks aus
	public void print() {
		System.out.println("\nDie Seitenlänge des "+name+" ist:");
		System.out.println("A: "+seiteAB);
	}
}
