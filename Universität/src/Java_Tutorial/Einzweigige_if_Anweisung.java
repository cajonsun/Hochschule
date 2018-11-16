package Java_Tutorial;

import java.util.Scanner;

public class Einzweigige_if_Anweisung {

	public static void main(String[] args) {
		aufgabe1();
	}

	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		double gesamtpreis = 0;
		double preis;
		int versand, exp;
		
		
		System.out.println("Geben Sie den Artikel ein:");
		String artikel = scan.nextLine();
		
		System.out.println("Geben Sie den Preis ein:");
		preis = scan.nextInt();
		
		System.out.println("Expressversand(0=nein, 1=ja):");
		exp = scan.nextInt();
		
		if (preis<10) {
			versand = 2;
		}
		else {
			versand = 3;	
		}
		
		if (exp == 1) {
			versand = versand+5;
		}
		
		gesamtpreis = preis+versand;
		
		System.out.println("Rechnung");
		System.out.println("  "+artikel+": "+preis);
		System.out.println("  Versand: "+versand);
		System.out.println("  Gesamt: "+gesamtpreis);
		
		scan.close();
	}

}
