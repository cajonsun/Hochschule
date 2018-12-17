package Abgabe3_Viereck_Vektor;

public class Quadrat extends Rhombus {
	public Quadrat(double[] A, double[] B, String name) throws ViereckException {
		super(A, B, null, name);	
	}
	
	//Berechnet die Flaeche des Vierecks
	public double getFlaeche() {
		return seiteAB*seiteAB;
	}
	
	//Gibt die Seitenlaengen des Vierecks aus
	public void print() {
		System.out.println("\nDie Seitenlängen des "+name+" sind:");
		System.out.println("AB: "+seiteAB+"\tBC: "+seiteAB);
		System.out.println("CD: "+seiteAB+"\tAD: "+seiteAB);
		System.out.println("Der Umfang des "+name+" ist "+getUmfang());
		System.out.println("Der Flächeninhalt des "+name+" ist "+getFlaeche());
	}
}
