package Abgabe3_Viereck_Vektor;

import java.util.Scanner;

public class ViereckMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String txt;	
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
				else if (i==4) {v = new Rechteck(a,b,"Rechteck");}
				else if (i==5) {v = new Rhombus(a,b,"Rombus");}
				else if (i==6) {v = new Quadrat(a,"Quadrat");}
				else if (i>7){			
					System.out.println("\nWas für eine Art von Viereck wollen sie erstellen: "+
					"\nViereck: v Konvexes Viereck: kv Trapez: Parallelogramm: p\nRechteck: re "
					+ "Rhombus: rh Quadrat: q");
					System.out.print("Geben Sie ihr gewünschtes Viereck ein: ");
					txt = scan.nextLine();
					v = ScannerViereck.scan(txt);
				}


				v.print();
				System.out.println("Der Umfang des "+v.name+" ist "+v.getUmfang());
				System.out.println("Der Flächeninhalt des "+v.name+" ist "+v.getFlaeche());
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
