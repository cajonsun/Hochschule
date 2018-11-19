package Abgabe2;
/**
 * Aufgabe zu Kapitel 6
 * @author Ole Jacobsen
 */
import java.util.Scanner;

public class compare_dowhile_while {
	
	public static void main(String[] args) {		
		loopWhile1();
		loopDoWhile1();		
	}
	
	/**
	 * Eingabe eines Passworts und Überprüfung,
	 * ob es richtig oder falsch ist. Mit einer
	 * While-SChleife gelöst
	 */
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
	
	/**
	 * Eingabe eines Passworts und Überprüfung,
	 * ob es richtig oder falsch ist. Mit einer
	 * Do-Whileschleife gelöst
	 */
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

	


