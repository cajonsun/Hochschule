package Abgabe3_Viereck_Vektor;

import java.util.Scanner;

public class ViereckMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Viereck v = null;
		
		try {
			for (int i = 1; i < 12; i++) {
				double[] a = new double[] {i,i+1};
				double[] b = new double[] {i+1,i+1};
				double[] c = new double[] {i+1,i+2};
				double[] d = new double[] {i+2,i+3};
				
				if (i==1) {v = new Konvexes_Viereck(a,b,c,d,"Konvexes Viereck");}
				else if (i==2) {v = new Trapez(a,b,c,d,"Trapez");}
				else if (i==3) {v = new Parallelogramm(a,b,c,"Parallelogramm");}
				else if (i==4) {v = new Rechteck(a,b,c,"Rechteck");}
				else if (i==5) {v = new Rhombus(a,b,c,"Rombus");}
				else if (i==6) {v = new Quadrat(a,b,"Quadrat");}
				else if (i>=7){			
					v = ScannerViereck.scan();
				}
				
				v.print();
				v.eigenschaften();	
			}

		}
		catch (ViereckException vex){
			vex.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		scan.close();
		System.out.println("Hannes riecht am Klodeckel");
	}
}
