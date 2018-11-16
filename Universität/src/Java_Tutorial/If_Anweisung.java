package Java_Tutorial;

import java.util.Scanner;

public class If_Anweisung {

	public static void main(String[] args) {
		// aufgabe1();
		// aufgabe2();
		// aufgabe3();
		// aufgabe4();
		aufgabe5();
	}

	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		final double rabatt = 0.1;
		int dPreis;

		System.out.println("Geben Sie den Gesamtbetrag ein:");
		int gZahl = scan.nextInt();

		if (gZahl > 1000) {
			dPreis = (int) (gZahl - (gZahl * rabatt));
		} else {
			dPreis = gZahl;
		}

		System.out.println("Discounterpreis: " + dPreis);
		scan.close();
	}

	public static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		final int schraubenpr = 5;
		final int mutterpr = 3;
		final int unterlegschpr = 1;

		System.out.println("Anzahl der Schrauben");
		int schraube = scan.nextInt();

		System.out.println("Anzahl der Muttern");
		int mutter = scan.nextInt();

		System.out.println("Anzahl der Unterlegscheiben");
		int unterlegsch = scan.nextInt();

		int gesamtpr = schraube * schraubenpr + mutter * mutterpr + unterlegsch * unterlegschpr;

		if (schraube > mutter) {
			System.out.println("Kontrollieren Sie ihre Bestellung!");
		} else {
			System.out.println("Die Bestellung ist okay");
		}

		System.out.println("Der Gesamtbetrag ist: " + gesamtpr);

		scan.close();
	}

	public static void aufgabe3() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Tankkapazität:");
		int tankkapa = scan.nextInt();

		System.out.println("Benzinanzeige:");
		int benzinan = scan.nextInt();

		System.out.println("Benzinverbrauch in Meilen pro Galleone:");
		int mpg = scan.nextInt();

		double benzin = (tankkapa * benzinan / 100.0);
		int strecke = (int) (benzin * mpg);

		if (strecke < 200) {
			System.out.println("Tanken!");
		} else {
			System.out.println("Weiterfahren...");
		}

		System.out.println("Strecke, die noch zurückgelegt werden kann:");
		System.out.println(strecke);

		scan.close();
	}

	public static void aufgabe4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Preis pro Pfund Packung A:");
		double preisA = scan.nextDouble();

		System.out.println("Prozent mageres Fleisch Packung A:");
		double fettarmAnteilA = scan.nextDouble();

		System.out.println("Preis pro Pfund Packung B:");
		double preisB = scan.nextDouble();

		System.out.println("Prozent mageres Fleisch Packung B:");
		double fettarmAnteilB = scan.nextDouble();

		double preisfettarmA = (preisA / fettarmAnteilA) * 100;
		double preisfettarmB = (preisB / fettarmAnteilB) * 100;

		System.out.println("Packung A kostet pro Pfund mageres Fleisch:" + preisfettarmA);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch:" + preisfettarmB);

		if (preisfettarmA < preisfettarmB) {
			System.out.println("Packung A ist preiswerter");
		} else {
			System.out.println("Packung B ist preiswerter");
		}

		scan.close();
	}

	public static void aufgabe5() {
		Scanner scan = new Scanner(System.in);
		int alter;

		System.out.println("Geburtsjahr:");
		int geburtsj = scan.nextInt();

		System.out.println("Aktuelles Jahr:");
		int aktJ = scan.nextInt();

		if (geburtsj < aktJ) {
			alter = aktJ - geburtsj;
		} else {
			alter = (100 + aktJ) - geburtsj;
		}
		System.out.println("Ihr Alter ist: " + alter);
		scan.close();
	}

}
