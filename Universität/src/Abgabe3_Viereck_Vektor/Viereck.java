package Abgabe3_Viereck_Vektor;

import Abgabe3_GeradeZahl.ZahlException;

public abstract class Viereck {

	protected double[] punktA, punktB, punktC, punktD;
	protected double seiteAB, seiteBC, seiteCD, seiteDA;
	protected String name;

	public Viereck(double[] punktA, double[] punktB, double[] punktC, double[] punktD, String name) throws ViereckException {	
		this.punktA = punktA;
		this.punktB = punktB;
		this.punktC = punktC;
		this.punktD = punktD;
		this.name	= name;
		seiteAB = getSeitenlaenge(punktA, punktB);
		seiteBC = getSeitenlaenge(punktB, punktC);
		seiteCD = getSeitenlaenge(punktC, punktD);
		seiteDA = getSeitenlaenge(punktD, punktA);
	}

//	public Viereck(double[] punktA,double[] punktB, String name) throws ViereckException {
//		this.punktA = punktA;
//		this.punktB = punktB;
//		this.name	= name;
//		seiteAB = getSeitenlaenge(punktA, punktB);
//		seiteBC = getSeitenlaenge(punktB, punktC);
//	}
//	
//	public Viereck(double[] punktA, String name) throws ViereckException {
//		this.punktA = punktA;
//		this.name	= name;
//		seiteAB = getSeitenlaenge(punktA, punktB);
//	}
	
	public Viereck() {}

	//Berechtnet die einzelnen Seitenlaengen
	protected double getSeitenlaenge(double[] a, double[] b) {
		double x = Math.abs(a[0]-b[0]);
		double y = Math.abs(a[1]-b[1]);
		return Math.sqrt((x*x)+(y*y));
	}
	
	//Gibt den Winkel zwischen seiteAB und seiteAC wieder
	protected double getWinkel(double[] a, double[] b, double[] c) {
		double hseiteAB  = getSeitenlaenge(a, b);
		double hseiteAC  = getSeitenlaenge(a, c);
		double hseiteBC  = getSeitenlaenge(b, c);
		
		return Math.acos((hseiteAC*hseiteAC+hseiteAB*hseiteAB-hseiteBC*hseiteBC)/(2*hseiteAC*hseiteAB));
	}
	protected double getHoehe(double[] a, double[] b, double[] c) {
		double alpha = getWinkel(a, b, c);
		
		return Math.sin(alpha)*getSeitenlaenge(punktA, punktB);
		
	}
	
	public double getUmfang() {
		return seiteAB + seiteBC + seiteCD + seiteDA;
	}	
	
	public double getFlaeche() {
		double flaeche1 = getHoehe(punktA, punktB, punktC)*getSeitenlaenge(punktD, punktA);
		double flaeche2 = getHoehe(punktB, punktC, punktD)*getSeitenlaenge(punktB, punktC);
		
		return flaeche1+flaeche2;

	}
	
	public void print() {
		System.out.println("\nDie Seitenlängen des "+name+" sind:");
		System.out.println("A: "+seiteAB+"\tB: "+seiteBC);
		System.out.println("C: "+seiteCD+"\tD: "+seiteDA);
	}
	
	public abstract void eigenschaften() ;
}
