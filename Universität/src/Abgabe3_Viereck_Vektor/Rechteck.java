package Abgabe3_Viereck_Vektor;

public class Rechteck extends Parallelogramm {
	public Rechteck(double[] A, double[] B, double[] C, String name) throws ViereckException {
		super(A, B, C, name);
	}

	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0] || punktB[1]>=punktC[1] || punktA[1]!=punktB[1] || punktB[0]!=punktC[0]) {
			throw new ViereckException(ViereckException.POSITION);
		}
	}	
		
	//Berechnet die Flaeche des Vierecks
	public double getFlaeche() {
		return seiteAB*seiteBC;
	}
	
}
