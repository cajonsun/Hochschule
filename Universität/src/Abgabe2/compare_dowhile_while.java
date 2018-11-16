package Abgabe2;
/**
 * Labor 5 Aufgabe 6 Vergleich der doWhile Schleife und der While Schleife
 * @author oleja
 */
import java.util.*;

public class compare_dowhile_while {
	
	public static void main(String[] args) {		
		loopWhile1();
		loopDoWhile1();		
	}
		
	public static void loopWhile1() {
		
		Boolean passwortAbfrage =false;
		System.out.println("Whileschleife"+"\nGeben Sie das Passwort ein: ");		
		
		while(passwortAbfrage == false) {

			Scanner scan = new Scanner(System.in);
			String passwort_user = scan.nextLine();
			String passwort = "Hallo";
			
			if(passwort.equals(passwort_user)) {
				passwortAbfrage = true;	
				System.out.println("Das Passwort ist richtig und lautet: "+passwort);
			}
			else {
				System.out.println("Das Passwort war falsch. \nGeben sie ein neues ein: ");	
			}			
		}
	}
	
	public static void loopDoWhile1() {
		
		Boolean passwortAbfrage =false;
		System.out.println("\nDo-Whileschleife"+"\nGeben Sie das Passwort ein: ");		
		
		do {

			Scanner scan = new Scanner(System.in);
			String passwort_user = scan.nextLine();
			String passwort = "Hallo";
			
			if(passwort.equals(passwort_user)) {
				passwortAbfrage = true;	
				System.out.println("Das Passwort ist richtig und lautet: "+passwort);
			}
			else {
				System.out.println("Das Passwort war falsch. \nGeben sie ein neues ein: ");	
			}			
		}			
		while(passwortAbfrage == false);			
	}
}	

/*	public static void loopDoWhile2() {
		int a = 0;
		System.out.println("Anfangswert von a ist: "+a);
		do a = a+1;
		while(a==1);
		
		System.out.println("Neuer Wert von a ist: "+a);		
	}
	
	public static void loopWhile2() {
		int b = 0;
		System.out.println("Anfangswert von b ist: "+b);
		while (b == 1) {
			b = b+1;
		}
		System.out.println("Neuer Wert von b ist: "+b);
	}
*/	


