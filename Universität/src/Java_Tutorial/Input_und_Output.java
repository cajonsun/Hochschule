package Java_Tutorial;
/**
 * Kapitel 10
 */
import java.util.Scanner;
public class Input_und_Output {

	public static void main(String[] args) {
		
		//Aufgabe 1
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Aufgabe 1");
		System.out.println("Gebe sie den Radius des Kreises ein:");
		int rad = scan.nextInt();
		double fläche = rad*rad*Math.PI;
		
		System.out.println("Der Radius ist: "+rad+" Die Fläche beträgt: "+fläche);
	
		//Aufgabe 2
		System.out.println("\nAufgabe 2");
		System.out.println("Geben Sie die Cent ein:");
		int cent = scan.nextInt();
		
		int dollar 	= cent/100;
		cent 		= cent%100;
		
		System.out.println("Das ergibt "+dollar+" Dollar und "+cent+" Cent.");
	
		//Aufgabe 3
		System.out.println("\nAufgabe 3");
		System.out.println("Geben Sie das Wechselgeld ein");
		int wechsCent = scan.nextInt();
		
		int wechsDollar = wechsCent/100;
		wechsCent = wechsCent%100;
		int wechsQuarter = wechsCent/25;
		wechsCent = wechsCent%25;
		int wechsDime = wechsCent/10;
		wechsCent = wechsCent%10;
		int wechsNickel = wechsCent/5;
		wechsCent = wechsCent%5;
		
		System.out.print("Das Wechselgeld ist "+wechsDollar+" Dollar, ");
		System.out.print(wechsQuarter+" Quarter, "+wechsDime+" Dime, ");
		System.out.println(wechsNickel+" Nickel, "+wechsCent+" Cent.");
	
		//Aufgabe4
		System.out.println("\nAufgabe 4");
		System.out.println("Geben Sie die Spannung ein:");
		double spannung = scan.nextDouble();
		
		System.out.println("Geben Sie den Widerstand des Gerätes ein:");
		int widerstand = scan.nextInt();
		
		double stromstärke = (spannung)/widerstand;
		
		System.out.println("Die Stromstärke beträgt: "+stromstärke+"A");
		scan.close();	
	}
}
