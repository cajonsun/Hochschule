package Abgabe3_Viereck_Vektor;

public class Quadrat extends Rhombus {
	public Quadrat(double[] A, double[] B, String name) throws ViereckException {
		super(A, B, null, name);	
	}
	
	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0]) {
			throw new ViereckException(ViereckException.POSITION);
		}		
	}
	
	//Berechnet die Flaeche des Vierecks
	public double getFlaeche() {
		return seiteAB*seiteAB;
	}
	
	//Gibt die Seitenlaengen des Vierecks aus
	public void print() {
		System.out.println("\n"+name);
		System.out.print("PunktA["+getPunktPos(punktA,0)+","+getPunktPos(punktA, 1)+"]");
		System.out.println("\tPunktB["+getPunktPos(punktB,0)+","+getPunktPos(punktB, 1)+"]");
		System.out.println("Umfang: "+getUmfang());
		System.out.println("Fläche: "+getFlaeche());
	}
}
