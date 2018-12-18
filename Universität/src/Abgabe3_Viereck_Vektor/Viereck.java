package Abgabe3_Viereck_Vektor;

import Abgabe3_GeradeZahl.ZahlException;

public abstract class Viereck {

	//Instanzvariablen
	protected double[] punktA, punktB, punktC, punktD;
	protected double seiteAB, seiteBC, seiteCD, seiteAD;
	protected String name;

	//Konstruktor
	public Viereck(double[] A, double[] B, double[] C, double[] D, String name) {	
		this.punktA = A;
		this.punktB = B;
		this.punktC = C;
		this.punktD = D;
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
	
	protected double getPunktPos(double[] p, int ipos) {
		return p[ipos];
	}
	
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
		double bog = Math.acos((hseiteAB*hseiteAB+hseiteBC*hseiteBC-hseiteAC*hseiteAC)/(2*hseiteAB*hseiteBC));	
		
		return bog;
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
		System.out.println("\n"+name);
		System.out.print("PunktA["+getPunktPos(punktA,0)+","+getPunktPos(punktA, 1)+"]");
		System.out.println("\tPunktB["+getPunktPos(punktB,0)+","+getPunktPos(punktB, 1)+"]");
		System.out.print("PunktC["+getPunktPos(punktC,0)+","+getPunktPos(punktC, 1)+"]");
		System.out.println("\tPunktD["+getPunktPos(punktD,0)+","+getPunktPos(punktD, 1)+"]");
		System.out.println("Umfang: "+getUmfang());
		System.out.println("Fläche: "+getFlaeche()+"");
	}
	
	public abstract void eigenschaften() ;
	public abstract void pospruef() throws ViereckException ;
}
