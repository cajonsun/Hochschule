package Methodenveranschaulichung;

import java.util.Scanner;	//Import der klasse scanner

public class Scannerbeispiel {


	

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			String typ = scan.nextLine();						//eingelesener Wert wird als String abgespeichert
			int radius = scan.nextInt();						//ist dasselbe wie in Zeile 15
//			int radius = Integer.parseInt(scan.nextLine());		//eingelesener Wert wird als Integer, falls möglich, abgespeichert.Wenn es kein Integerwert ist kommt eine Fehlermeldung
			System.out.println(typ+" "+radius);
			scan.close();
		}
}

