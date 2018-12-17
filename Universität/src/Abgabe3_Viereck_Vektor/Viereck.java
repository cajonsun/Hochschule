package Abgabe3_Viereck_Vektor;

import Abgabe3_GeradeZahl.ZahlException;

public abstract class Viereck {

	//Instanzvariablen
	protected double[] punktA, punktB, punktC, punktD;
	protected double seiteAB, seiteBC, seiteCD, seiteAD;
	protected String name;

	//Konstruktor
	public Viereck(double[] punktA, double[] punktB, double[] punktC, double[] punktD, String name) throws ViereckException {	
		this.punktA = punktA;
		this.punktB = punktB;
		this.punktC = punktC;
		this.punktD = punktD;
		this.name	= name;
		seiteAB = getSeitenlaenge(punktA, punktB);
		if (punktC != null) {
			seiteBC = getSeitenlaenge(punktB, punktC);
			if (punktD != null) {
				seiteCD = getSeitenlaenge(punktC, punktD);			
				seiteAD = getSeitenlaenge(punktA, punktD);
			}
		}
	}

	//Methoden
	
	//Berechnet die einzelnen Seitenlaengen
	protected double getSeitenlaenge(double[] a, double[] b) {
		double x = Math.abs(a[0]-b[0]);
		double y = Math.abs(a[1]-b[1]);
		return Math.sqrt((x*x)+(y*y));
	}
	
	//Gibt den Winkel zwischen seiteAB und seiteAD wieder
	protected double getWinkel(double[] a, double[] b, double[] c) {
		double hseiteAB  = getSeitenlaenge(a, b);
		double hseiteAC  = getSeitenlaenge(a, c);
		double hseiteBC  = getSeitenlaenge(b, c);
		
		return Math.acos((hseiteAB*hseiteAB+hseiteBC*hseiteBC-hseiteAC*hseiteAC)/(2*hseiteAB*hseiteBC));
	}
	
	//Berechnet die Hoehe des Hilfsdreieck
	protected double getHoehe(double[] a, double[] b, double[] c) {
		double alpha = getWinkel(a, b, c);
		
		return Math.sin(alpha)*getSeitenlaenge(b, c);
	}
	
	//Gibt den Umfang des Viereck aus
	public double getUmfang() {
		return seiteAB + seiteBC + seiteCD + seiteAD;
	}	
	
	//Berechnet die Flaechen der Hilfsdreiecke des Vierecks und gibt den Flaecheninhalt
	//des Vierecks zurueck 
	public double getFlaeche() {
		double flaeche1 = 0.5*getHoehe(punktA, punktB, punktC)*getSeitenlaenge(punktA, punktB);
		double flaeche2 = 0.5*getHoehe(punktC, punktD, punktA)*getSeitenlaenge(punktC, punktD);
		
		return flaeche1+flaeche2;
	}
	
	//Gibt den Typen, die einzelnen Seitenlaengen, den Flaecheninhalt und
	//den Umfang des Vierecks wieder 
	public void print() {
		System.out.println("\nDie Seitenlängen des "+name+" sind:");
		System.out.println("AB: "+seiteAB+"\tBC: "+seiteBC);
		System.out.println("CD: "+seiteCD+"\tAD: "+seiteAD);
		System.out.println("Der Umfang des "+name+" ist "+getUmfang());
		System.out.println("Der Flächeninhalt des "+name+" ist "+getFlaeche());
	}
	
	public abstract void eigenschaften() ;
}
