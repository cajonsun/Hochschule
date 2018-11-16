package Klassenverarbeitung;

public class PersonTest {

	public static void main(String[] args) {
		Person pers1 = new Person("Meyer", "meyer@gmx.de");
		System.out.println("Ausgabe von Person p1:");
		pers1.print();
		
		Studentin stud1 = new Studentin("Schubert", "schubert@t-online.de", 12345);
		System.out.println("\nAusgabe von Studentin s1");
		stud1.print();
		
		Professorin prof1 = new Professorin("Jacobsen", "ojacobsen@hs-bremen.de", 32);
		System.out.println("\nAusgabe von Professorin p1");
		prof1.print();
	}
}
