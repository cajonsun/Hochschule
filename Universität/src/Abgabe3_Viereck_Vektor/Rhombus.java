package Abgabe3_Viereck_Vektor;

public class Rhombus extends Parallelogramm {
	public Rhombus(double[] A, double[] B, double[] C, String name) throws ViereckException { 
		super(A, B, C, name); 
	}

	//Berechnet den Umfang des Vierecks
	public double getUmfang() {
		return 4 * seiteAB;
	}	
}
