package Abgabe3_Viereck_Vektor;

public class Quadrat extends Rhombus {
	public Quadrat(double[] A, String name) throws ViereckException {super(A, null, name);	}
	
//	public Quadrat() {super();}
	
	//Berechnet die Flaeche des Vierecks
	public double getFlaeche() {
		return seiteAB*seiteAB;
	}
}
