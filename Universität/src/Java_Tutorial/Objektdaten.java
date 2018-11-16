package Java_Tutorial;
/**
 * Kapitel 9C
 * @author Ole
 *
 */
public class Objektdaten {

	public static void main(String[] args) {

		// Aufgabe 1
		String str = new String("Hello World"); /*
												 * str = Referenzvariable in der die Referenz gespeichert wird 
												 *		 also somit wo das Objekt abgespeichert wird
												 * Hello World = Objekt das erzeugt wird
												 */
		String str1 = null;

		System.out.println("Aufgabe 1");
		System.out.println(str);
		System.out.println(str1);

		// Aufgabe 2
		String str2;
		int len;

		str2 = new String("Elementary, my dear Watson!");
		len = str2.length();

		System.out.println("\nAufgabe 2");
		System.out.println("Die Länge ist: " + len);

		// Aufgabe 3
		String ersterStr = new String("     In einem Loch 	    in der Erde, da lebt ein Hobbit.    ");
		String zweiterStr;

		zweiterStr = ersterStr.trim();

		System.out.println("\nAufgabe 3");
		System.out.println(ersterStr);
		System.out.println(zweiterStr);

		// Aufgabe 4

		String str3 = new String("Golf is a good walk spoiled.");
		String sub = str3.substring(8); // erzeugt ein neues Objekt aus dem Original
		String sub1 = str3.substring(5);
		String sub2 = str3.substring(3, str3.length() - 5);

		System.out.println("\nAufgabe 4");
		System.out.println(sub);
		System.out.println(sub1);
		System.out.println(sub2);
	}
}
