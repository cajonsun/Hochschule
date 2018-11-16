package Methodenveranschaulichung;

import java.util.Scanner;								//Import der klasse scanner

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);					//Der Scanner wird initialisiert
		System.out.println("Geben Sie ein ob sie ein Kreis oder ein Rechteck haben :");
		String typ = scan.nextLine();							//Der eingelesene Wert ist jetzt als String in "typ" abgespeichert
		
		if (typ.equals ("Kreis")) {
			System.out.println("Geben Sie ein ob sie den Radius ein :");
			int radius = Integer.parseInt(scan.nextLine());		//Eingelesener wert wir zu int konvertiert
			
			System.out.println("Der Umfang ist gleich "+Circle.umfang(radius));		//aufruf der Funktion "Umfang" der klasse "Circle"
			System.out.println("Die Fläche ist gleich "+Circle.fläche(radius));
		}
		
		else if (typ.equals("Rechteck")) {
			System.out.println("Geben Sie ein ob sie die Breite ein :");
			int breite = Integer.parseInt(scan.nextLine());
			
			System.out.println("Geben Sie ein ob sie die Höhe ein :");
			int höhe = Integer.parseInt(scan.nextLine());
			
			System.out.println("Der Umfang ist gleich "+Rectangle.umfang(höhe, breite));
			System.out.println("Die Fläche ist gleich "+Rectangle.fläche(höhe, breite));
			
		}
		scan.close();
	}
}
