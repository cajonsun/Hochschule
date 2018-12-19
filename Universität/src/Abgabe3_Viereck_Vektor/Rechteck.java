package Abgabe3_Viereck_Vektor;

public class Rechteck extends Parallelogramm {
	public Rechteck(double[] A, double[] B, double[] C, String name) throws ViereckException {
		super(A, B, C, name);
	}

	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0] || punktB[1]>=punktC[1]) {
			throw new ViereckException(ViereckException.POSITION);
		}
		double winkel = ((getWinkel(punktA, punktB, punktC)*180)/Math.PI);
		winkel = Math.round(winkel);
		if (winkel!=90) {
			throw new ViereckException(ViereckException.WINKEL);			
		}
	}	
		
	//Berechnet die Flaeche des Vierecks
	public double getFlaeche() {
		return seiteAB*seiteBC;
	}
	
}
