package Abgabe4;

import java.util.Scanner;

public class TexteinlesenMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		String file = "C:\\Users\\oleja\\OneDrive\\Dokumente\\Programmieren1\\Abgabeordner\\Abgabe 3+4\\Texteinlesen\\Tageschautext.txt";
		String file = "C:\\Users\\Ole\\OneDrive\\Dokumente\\Programmieren1\\Abgabeordner\\Abgabe 3+4\\Texteinlesen\\Tageschautext.txt";
		Texteinlesen text = new Texteinlesen(file);
		
		//Ausgabe des unsortierten Textes
		text.einlesen();
		System.out.println("--------------------------------"
				+ "\nUnsortierter Teil:\n");
		text.ausgeben();
		
		//Abfrage zum unterscheiden von Groß und Kleinschreibung
		System.out.println("Wollen Sie zwischen Groß- und Kleinschreibung unterscheiden?<j> <n>");
		String abfrage = scan.next();
		if (abfrage.equals("j")) {
			text.sortSens();
		} else {
			text.sortInsens();
		}
		
		//Ausgabe des sortierten Textes
		System.out.println("--------------------------------"
				+ "\nSortierter Teil:\n");
		text.ausgeben();
		
		//Ausgabe des sortierten Textes mit der jeweiligen Anzahl der Wörter
		System.out.println("--------------------------------"
				+ "\nSortierter Teil mit Anzahl:\n");
		text.ausgebenAnzahl();
	}
}
