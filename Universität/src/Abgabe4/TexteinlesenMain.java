package Abgabe4;

import java.util.Scanner;

public class TexteinlesenMain {
	public static boolean unterscheiden;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//boolean unterscheiden;
		
//		String file = "C:\\Users\\oleja\\OneDrive\\Dokumente\\Programmieren1\\Abgabeordner\\Abgabe4\\Tageschautext.txt";
		String file = "C:\\Users\\Ole\\OneDrive\\Dokumente\\Programmieren1\\Abgabeordner\\Abgabe4\\Tageschautext2.txt";
		Texteinlesen text = new Texteinlesen(file);
		
		text.einlesen();
		System.out.println("--------------------------------"
				+ "\nUnsortierter Teil:\n");
		text.ausgeben();
		
		//Abfrage zum unterscheiden von Groﬂ und Kleinschreibung
		System.out.println("Wollen Sie zwischen Groﬂ- und Kleinschreibung unterscheiden?<j> <n>");
		String abfrage = scan.next();
		if (abfrage.equals("j")) {
			unterscheiden = true;
		} else {
			unterscheiden = false;
		}
		
		text.sort();
		System.out.println("--------------------------------"
				+ "\nSortierter Teil:\n");
		text.ausgeben();
		System.out.println("--------------------------------"
				+ "\nSortierter Teil mit Anzahl:\n");
		text.ausgebenAnzahl();
	}
}
