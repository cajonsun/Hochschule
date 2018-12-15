package Abgabe3_Viereck_Vektor;

public class Parallelogramm extends Trapez {
	public Parallelogramm(double[] A, double[] B, double[] C, String name) throws ViereckException {super(A, B, C, null, name);}

//	public Parallelogramm() {super();}

	//Berechnet die Flaechen der Hilfsdreiecke des Vierecks und gibt den Flaecheninhalt
	//des Vierecks zurueck 
	public double getFlaeche() {
		return getHoehe(punktA, punktB, punktC)*getSeitenlaenge(punktB, punktC);
	}
	
	//Gibt den Umfang des Vierecks aus
	public double getUmfang() {
		return 2 * seiteAB + 2 * seiteBC;
	}
	
	public void print() {
		System.out.println("\nDie Seitenlängen des "+name+" sind:");
		System.out.println("AB: "+seiteAB+"\tBC: "+seiteBC);
		System.out.println("CD: "+seiteAB+"\tAD: "+seiteBC);
		System.out.println("Der Umfang des "+name+" ist "+getUmfang());
		System.out.println("Der Flächeninhalt des "+name+" ist "+getFlaeche());
	}
}
