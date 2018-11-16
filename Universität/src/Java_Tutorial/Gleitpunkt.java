package Java_Tutorial;
/**
 * Kapitel 11
 * @author Ole
 *
 */

import java.util.Scanner;

public class Gleitpunkt {

	public static void main(String[] args) {
		// beispiel();
		//aufgabe1();
		//aufgabe2();
		//aufgabe3();
		aufgabe4();
	}

	/**
	 * Beispiel für Umrechnung von Bogenmaß in Grad und andersherum
	 */
	public static void beispiel() {
		// Beispiel
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl in Grad ein:");
		double grad = scan.nextDouble();
		System.out.println("Geben Sie eine Zahl in Bogenmaß ein:");
		double rad = scan.nextDouble();

		// machen dasselbe
		double bogenmass = (Math.PI / 180.0) * grad;
		double bogenmass1 = Math.toRadians(grad);

		double deg = (180.0 / Math.PI) * rad;
		double deg1 = Math.toDegrees(rad);

		// Cosinus berechnen
		double ergebnis = Math.cos(bogenmass1);

		// Ergebnis ausgeben
		System.out.println("Cosinus: " + ergebnis);
		System.out.println("Bogenmass 1: " + bogenmass + "\nBogenmass 2: " + bogenmass1);
		System.out.println("Grad 1: " + deg + "\nGrad 2: " + deg1);

		scan.close();
	}

	/**
	 * Aufgabe 1 Berechnung der Jahresstromkosten
	 */
	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein:");
		double kostenKwh = scan.nextDouble();

		System.out.println("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein:");
		double anzahlKwh = scan.nextDouble();

		double jahreskosten = (kostenKwh / 100) * anzahlKwh;

		System.out.println("Jahreskosten in EUR: " + jahreskosten);
		
		scan.close();
	}
	
	/**
	 * Aufgabe 2 Berechnung der Entfernung, die ein Stein zurücklegt
	 * wenn er eine bestimmte Zeit von einem Turm herunterfällt
	 */
	public static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		double G = 9.81;
		
		System.out.println("Geben Sie die Anzahl der Sekunden ein:");
		double z = scan.nextDouble();
		
		double e = (1/2.0)*G*z*z;
		
		System.out.println("Die Entfernung e beträgt: "+e+" Meter");
		
		scan.close();
	}
	
	/**
	 * Aufgabe 3 Berechnung des Durchschnitts und des Harmonischen Mittels
	 */
	public static void aufgabe3() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Geben sie x ein: ");
		double x = scan.nextDouble();
		
		System.out.print("Geben Sie y ein: ");
		double y = scan.nextDouble();
		
		double arith	= (x+y)/2;
		double harm		= 2/(1/x + 1/y);
		
		System.out.println("Arithmetisches Mittel:\t"+arith);
		System.out.println("Harmonisches Mittel:\t"+harm);
		
		scan.close();
	}

	/**
	 * Aufgabe 4 Berechnung des Zweierlogarithmus
	 */
	public static void aufgabe4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine double ein:");
		double x = scan.nextDouble();
		
		double ergebnis = (Math.log(x))/(Math.log(2));
		
		System.out.println("Der Zweierlogarithmus von "+ x +" ist "+ ergebnis);
		
		scan.close();
	}
}
