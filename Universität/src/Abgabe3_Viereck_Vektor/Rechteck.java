package Abgabe3_Viereck_Vektor;

public class Rechteck extends Parallelogramm {
	public Rechteck(double[] A, double[] B, double[] C, String name) throws ViereckException {super(A, B, C, name);}

//	public Rechteck() {super();}
	
	//Berechnet die Flaeche des Vierecks
	public double getFlaeche() {
		return seiteAB*seiteBC;
	}
	
}
