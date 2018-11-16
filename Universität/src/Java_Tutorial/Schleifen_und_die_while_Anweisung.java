package Java_Tutorial;

import java.util.Scanner;

public class Schleifen_und_die_while_Anweisung {

	public static void main(String[] args) {
		aufgabe3();
		
	}
	
	public static void aufgabe1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Startwert:");
		int start	= scan.nextInt();
		
		System.out.println("Endwert:");
		int ende	= scan.nextInt();
		
		while (start <= ende) {
			System.out.println(start);
			start = start+1;
		}	
		scan.close();
	}
	
	public static void aufgabe2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie ein Wort ein:");
		String wort = scan.nextLine();
		int zaehler = 1;
		
		while (zaehler <= wort.length()) {
			System.out.println(wort);
			zaehler = zaehler+1;
		}
		scan.close();
	}
	
	public static void aufgabe3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie zwei Wörter ein:");
		System.out.print("Wort1: ");
		String wort1 = scan.nextLine();
		
		System.out.print("Wort2: ");
		String wort2 = scan.nextLine();
		int zaehler	= 1;
		int grenze	= 20-wort1.length()-wort2.length();
		
		System.out.print(wort1);
		
		while (zaehler <= grenze) {
			System.out.print(".");
			zaehler = zaehler+1;
		}
		
		System.out.println(wort2);
		scan.close();
	}
	
}

