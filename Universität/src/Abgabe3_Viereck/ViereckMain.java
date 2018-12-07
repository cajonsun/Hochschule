package Abgabe3_Viereck;

import java.util.Scanner;

public class ViereckMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String txt;	
		Viereck v = null;
		
		try {
			for (int i = 1; i < 12; i++) {
				if (i==1) {v = new Viereck(1,2,3,4,"Viereck");}
				else if (i==2) {v = new Konvexes_Viereck(2,3,4,5,"Konvexes Viereck");}
				else if (i==3) {v = new Trapez(4,3,4,9,"Trapez");}
				else if (i==4) {v = new Parallelogramm(7,2,"Parallelogramm");}
				else if (i==5) {v = new Rechteck(8,5,"Rechteck");}
				else if (i==6) {v = new Rhombus(2,"Rombus");}
				else if (i==7) {v = new Quadrat(6,"Quadrat");}
				else {			
					System.out.println("\nWas für eine Art von Viereck wollen sie erstellen: ");
					System.out.print("Viereck: v\t"+"Konvexes Viereck: kv\n"+"Trapez: t\t");
					System.out.print("Parallelogramm: p\n"+"Rechteck: re\t"+"Rhombus: rh\n");
					System.out.println("Quadrat: q");
					System.out.print("Geben Sie ihr gewünschtes Viereck ein: ");
					txt = scan.nextLine();
					v = ScannerViereck.scan(txt);
				}


				v.print();
				System.out.println("Der Umfang des "+v.name+" ist "+v.umfang());
				v.flaeche();
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
