package Abgabe3_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeradeZahlMain {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Gebe die erste Zahl ein, du Hure:");
			int zahl1 = scan.nextInt();
			GeradeZahl gz1 = new GeradeZahl(zahl1);
			
			System.out.println("Gebe die zweite Zahl ein, du Hure:");
			int zahl2 = scan.nextInt();
			GeradeZahl gz2 = new GeradeZahl(zahl2);
			
			GeradeZahl gz3 = gz1.add(gz2);
			System.out.println("Das Ergebnis der Addition ist "+gz3.zahl);
		
			GeradeZahl gz4 = gz1.mult(gz2);
			System.out.println("Das Ergebnis der Multiplikation ist "+gz4.zahl);
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
		
		System.out.println("Hannes katze stinkt nach Kot");
	}
}
