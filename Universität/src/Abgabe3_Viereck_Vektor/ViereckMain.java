package Abgabe3_Viereck_Vektor;

import java.util.Scanner;

/**
 * Aufgabe zu Kapitel 7
 * @author Ole Jacobsen
 *
 */
public class ViereckMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Viereck v = null;
		double[] p1  = {0,0}, p2  = {1,0}, p3  = {2,0};
		double[] p4  = {2,1}, p5  = {2,2}, p6  = {1,3};
		double[] p7  = {1,2}, p8  = {0,1}, p9  = {0,2};
		         
		for (int i = 1; i < 20; i++) {
			try {
					
					if (i==1) {v = new Konvexes_Viereck(p1,p3,p5,p9,"Konvexes Viereck");}
					else if (i==2)  {v = new Trapez(p1,p5,p6,p8,"Trapez");}
					else if (i==3)  {v = new Parallelogramm(p2,p4,p5,"Parallelogramm");}
					else if (i==4)  {v = new Rechteck(p1,p3,p5,"Rechteck");}
					else if (i==5)  {v = new Rhombus(p1,p3,p5,"Rombus");}
					else if (i==6)  {v = new Quadrat(p1,p2,"Quadrat");}
					else if (i==7)  {v = new Konvexes_Viereck(p3,p1,p5,p9,"Konvexes Viereck");}
					else if (i==8)  {v = new Trapez(p1,p6,p5,p8,"Trapez");}
					else if (i==9)  {v = new Parallelogramm(p2,p4,p4,"Parallelogramm");}
					else if (i==10) {v = new Rechteck(p3,p1,p7,"Rechteck");}
					else if (i==11) {v = new Rhombus(p1,p5,p3,"Rombus");}
					else if (i==12) {v = new Quadrat(p2,p1,"Quadrat");}
					else if (i>=13){			
						v = ScannerViereck.scan();
					}
					
					v.print();
					v.eigenschaften();	
	
			}
			catch (ViereckException vex){
//				vex.printStackTrace();
				System.out.println(vex.toString());
			}
			catch (Exception ex) {
				System.out.println("Unbekannter Fehler");
//				ex.printStackTrace();
			}
		}
		scan.close();
	}
}
