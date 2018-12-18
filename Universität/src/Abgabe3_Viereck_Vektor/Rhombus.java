package Abgabe3_Viereck_Vektor;

public class Rhombus extends Parallelogramm {
	public Rhombus(double[] A, double[] B, double[] C, String name) throws ViereckException { 
		super(A, B, C, name); 
	}

	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0] || punktB[1]>=punktC[1] || seiteAB!=seiteBC) {
			throw new ViereckException(ViereckException.POSITION);
		}
	}
		
	//Berechnet den Umfang des Vierecks
	public double getUmfang() {
		return 4 * seiteAB;
	}	
}
