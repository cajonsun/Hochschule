package Abgabe3_Viereck_Vektor;

public class Rechteck extends Parallelogramm {
	public Rechteck(double[] A, double[] B, String name) throws ViereckException {super(A, B, null, name);}

	public Rechteck() {super();}
	
	public double getFlaeche() {
		return seiteAB*seiteBC;
	}
	
}
