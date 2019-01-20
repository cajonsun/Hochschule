package Abgabe3_GeradeZahl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeradeZahlMain {

	public static void main(String[] args) {
		try {
			//Eingabe der zwei geraden Zahlen
			Scanner scan = new Scanner(System.in);
			System.out.println("Gebe Sie zwei geraden Zahlen, zwischen 1 und 100, ein:");
			System.out.print("Zahl1: ");
			int zahl1 = scan.nextInt();
			GeradeZahl gz1 = new GeradeZahl(zahl1);
			
			System.out.print("Zahl2: ");
			int zahl2 = scan.nextInt();
			GeradeZahl gz2 = new GeradeZahl(zahl2);
			
			//Addition der beiden geraden Zahlen und Ausgabe des Ergebnisses
			int a = gz1.add(gz2);
			System.out.println("Das Ergebnis der Addition ist "+a);

			//Multiplikation der beiden geraden Zahlen und Ausgabe des Ergebnisses
			int b = gz1.mult(gz2);
			System.out.println("Das Ergebnis der Multiplikation ist "+b);
			
		}
		catch(InputMismatchException imex) {
			try {
				throw new ZahlException(ZahlException.DATENTYP);
			} catch (ZahlException e) {
				e.printStackTrace();
			}
		}
		catch(ZahlException zex) {
			zex.printStackTrace();
//			System.out.println(zex.toString());			
		}
		catch(Exception ex) {
			ex.printStackTrace();
//			System.out.println(zex.toString());			
		}
	}
}
