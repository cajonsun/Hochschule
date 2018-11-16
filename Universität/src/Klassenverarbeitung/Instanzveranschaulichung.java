package Klassenverarbeitung;

import Methodenveranschaulichung.Circle;

public class Instanzveranschaulichung {

	public static void main(String[] args) {

		Circle_Instanz1 kreis1 = new Circle_Instanz1();/*
														 * kreis1 = Instanz und/oder Referenzvariable
														 * was ist jetzt hier das Objekt???
														 */
		Circle_Instanz1 kreis2 = new Circle_Instanz1();
		Circle_Instanz kreis3 = new Circle_Instanz(2);
		Circle_Instanz kreis4 = new Circle_Instanz(3);

		double flaeche1, flaeche2, flaeche3, flaeche4;

		kreis1.radius = 2;
		kreis2.radius = 3;

		flaeche1 = Circle.fläche(kreis1.radius);
		flaeche2 = Circle.fläche(kreis2.radius);
		flaeche3 = Circle_Instanz.fläche();
		flaeche4 = Circle_Instanz.fläche();

		System.out.println("Fläche1: " + flaeche1 + "\nFläche2: " + flaeche2);
		System.out.println("Fläche3: " + flaeche3 + "\nFläche4: " + flaeche4);

	}
}
