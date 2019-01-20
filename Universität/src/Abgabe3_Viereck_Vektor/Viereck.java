package Abgabe3_Viereck_Vektor;

import Abgabe3_GeradeZahl.ZahlException;

public abstract class Viereck implements Formeln{

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
	
	/**
	 * Berechnet die Seitenlaenge zwischen den beiden eingegebenen Punkten
	 * @param a Erster Punkt
	 * @param b	Zweiter Punkt
	 * @return  Seitenlaenge
	 */
	protected double getSeitenlaenge(double[] a, double[] b) {
		double x = Math.abs(a[0]-b[0]);
		double y = Math.abs(a[1]-b[1]);
		return Math.sqrt((x*x)+(y*y));
	}
	
	/**
	 * Berechnet den Winkel zwischen hseiteAB und hseiteAC
	 * @param a	Erster Punkt
	 * @param b Zweiter Punkt
	 * @param c Dritter Punkt
	 * @return Winkel in Bogenmaß
	 */
	protected double getWinkel(double[] a, double[] b, double[] c) {
		double hseiteAB  = getSeitenlaenge(a, b);
		double hseiteAC  = getSeitenlaenge(a, c);
		double hseiteBC  = getSeitenlaenge(b, c);
		double bog = Math.acos((hseiteAB*hseiteAB+hseiteBC*hseiteBC-hseiteAC*hseiteAC)/(2*hseiteAB*hseiteBC));	
		
		return bog;
	}
	
	/**
	 * Berechnet die Hoehe des Hilfdreieck
	 * @param a	Erster Punkt
	 * @param b Zweiter Punkt
	 * @param c Dritter Punkt
	 * @return Hoehe des Hilfdreieck
	 */
	protected double getHoehe(double[] a, double[] b, double[] c) {
		double alpha = getWinkel(a, b, c);
		
		return Math.sin(alpha)*getSeitenlaenge(b, c);
	}
	
	/**
	 * Berechnet den Umfang des Vierecks
	 */
	public double getUmfang() {
		return seiteAB + seiteBC + seiteCD + seiteAD;
	}	
	
	/**
	 * Berechnet die Flaeche des Vierecks aus den beiden Hilfsdreiecken
	 */
	public double getFlaeche() {
		double flaeche1 = 0.5*getHoehe(punktA, punktB, punktC)*getSeitenlaenge(punktA, punktB);
		double flaeche2 = 0.5*getHoehe(punktC, punktD, punktA)*getSeitenlaenge(punktC, punktD);
		
		return flaeche1+flaeche2;
	}
	
	/**
	 * Gibt die Art, die einzelnen Punkte, den Flaecheninhalt und den
	 * Umfang des Vierecks wieder
	 */
	public void print() {
		System.out.println("\n"+name);
		System.out.print("PunktA["+punktA[0]+","+punktA[1]+"]");
		System.out.println("\tPunktB["+punktB[0]+","+punktB[1]+"]");
		System.out.print("PunktC["+punktC[0]+","+punktC[1]+"]");
		System.out.println("\tPunktD["+punktD[0]+","+punktD[1]+"]");
		System.out.println("Umfang: "+getUmfang());
		System.out.println("Fläche: "+getFlaeche());
	}
	
	/**
	 * Beschreibt die Eigenschaften des Vierecks
	 */
	public abstract void eigenschaften() ;
	
	/**
	 * Überprüft, ob die Punkte gegen den Uhrzeigersinn angegeben wurden
	 * @throws ViereckException
	 */
	public abstract void pospruef() throws ViereckException ;
}
