package Abgabe3_Viereck;

import java.util.Scanner;

public class ViereckMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String txt;	
		Viereck V = null;
		
		try {
			for (int i = 1; i < 12; i++) {
				if (i==1) {
					V = new Viereck(1,2,3,4,"Viereck");
				}
				else if (i==2) {
					V = new Konvexes_Viereck(2,3,4,5,"Konvexes Viereck");
				}
				else if (i==3) {
					V = new Trapez(4,3,4,9,"Trapez");
				}
				else if (i==4) {
					V = new Parallelogramm(7,2,"Parallelogramm");
				}
				else if (i==5) {
					V = new Rechteck(8,5,"Rechteck");
				}
				else if (i==6) {
					V = new Rhombus(2,"Rombus");
				}
				else if (i==7) {
					V = new Quadrat(6,"Quadrat");
				}
				else {			
					System.out.println("\nWas für eine Art von Viereck wollen sie erstellen: ");
					System.out.print("Viereck: v\t"+"Konvexes Viereck: kv\n"+"Trapez: t\t");
					System.out.print("Parallelogramm: p\n"+"Rechteck: re\t"+"Rhombus: rh\n");
					System.out.println("Quadrat: q");
					System.out.print("Geben Sie ihr gewünschtes Viereck ein: ");
					txt = scan.nextLine();
					V = ScannerViereck.Scan(txt);
				}


				V.print();
				System.out.println("Der Umfang des "+V.name+" ist "+V.umfang());
				V.flaeche();	
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
