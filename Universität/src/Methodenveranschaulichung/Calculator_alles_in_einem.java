package Methodenveranschaulichung;

import java.util.Scanner;



public class Calculator_alles_in_einem {
	
	public static double fläche (int radius) {
		double a= Math.PI* Math.pow(radius, 2);		//Verwenden der mathe funktion pi und der funktion (x hoch y)
		return a;									//Rückgabe des Wertes a für die Funktion "fläche"
	}
	public static double umfang (int radius) {
		double u= Math.PI *radius*2;
		return u;
	}
	
	public static int fläche (int höhe, int breite) {
		int a = höhe*breite;
		return a;
	}
	
	public static double umfang (int höhe, int breite) {
		double u = 2*höhe + 2*breite;
		return u;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);					//Der Scanner wird initialisiert
		System.out.println("Geben Sie ein ob sie ein Kreis oder ein Rechteck haben :");
		String typ = scan.nextLine();							//Der eingelesene Wert ist jetzt als String in "typ" abgespeichert
		
		if (typ.equals ("Kreis")) {
			System.out.println("Geben Sie ein ob sie den Radius ein :");
			int radius = Integer.parseInt(scan.nextLine());		//Eingelesener wert wir zu int konvertiert
			
			System.out.println("Der Umfang ist gleich "+umfang(radius));		//aufruf der Funktion "Umfang" der klasse "Circle"
			System.out.println("Die Fläche ist gleich "+fläche(radius));
		}
		
		else if (typ.equals("Rechteck")) {
			System.out.println("Geben Sie ein ob sie die Breite ein :");
			int b = Integer.parseInt(scan.nextLine());
			
			System.out.println("Geben Sie ein ob sie die Höhe ein :");
			int h = Integer.parseInt(scan.nextLine());
			
			System.out.println("Der Umfang ist gleich "+umfang(h, b));
			System.out.println("Die Fläche ist gleich "+fläche(h, b));
		}
		scan.close();
	}

}
