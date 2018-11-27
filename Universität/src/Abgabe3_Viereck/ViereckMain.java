package Abgabe3_Viereck;

import java.util.Scanner;

public class ViereckMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Was für eine Art von Viereck wollen sie erstellen: ");
			System.out.print("Viereck: v\t"+"Konvexes Viereck: kv\n"+"Trapez: t\t");
			System.out.print("Parallelogramm: p\n"+"Rechteck: re\t"+"Rhombus: rh\n");
			System.out.println("Quadrat: q");
			String txt = scan.nextLine();
			Viereck V = ScannerViereck.Scan(txt);
			V.print();
			System.out.println("Der Umfang des "+V.name+" ist "+V.umfang());
			V.flaeche();
		}
		catch (ViereckException vex){
			vex.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		scan.close();
	}
}
