package Abgabe3_Viereck_Vektor;

public class Parallelogramm extends Trapez {
	public Parallelogramm(double[] A, double[] B, double[] C, String name) throws ViereckException {
		super(A, B, C, null, name);
	}

	public void pospruef() throws ViereckException {
		if (punktA[0]>=punktB[0] || punktB[1]>=punktC[1]) {
			throw new ViereckException(ViereckException.POSITION);
		}
	}
	
	//Berechnet die Flaechen der Hilfsdreiecke des Vierecks und gibt den Flaecheninhalt
	//des Vierecks zurueck 
	public double getFlaeche() {
		return getHoehe(punktA, punktB, punktC)*getSeitenlaenge(punktA, punktB);
	}
	
	//Gibt den Umfang des Vierecks aus
	public double getUmfang() {
		return 2 * seiteAB + 2 * seiteBC;
	}
	
	public void print() {
		System.out.println("\n"+name);
		System.out.print("PunktA["+getPunktPos(punktA,0)+","+getPunktPos(punktA, 1)+"]");
		System.out.println("\tPunktB["+getPunktPos(punktB,0)+","+getPunktPos(punktB, 1)+"]");
		System.out.println("PunktC["+getPunktPos(punktC,0)+","+getPunktPos(punktC, 1)+"]");
		System.out.println("Umfang: "+getUmfang());
		System.out.println("Fläche: "+getFlaeche());
	}
}
