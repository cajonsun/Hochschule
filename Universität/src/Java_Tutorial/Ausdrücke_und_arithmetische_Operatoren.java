package Java_Tutorial;
/**
 * Kapitel 9B
 * @author Ole
 *
 */
public class Ausdr¸cke_und_arithmetische_Operatoren {
	
	public static void main(String[] args) {
		 
		//Aufgabe 1
		
		int april = 12;
		int mai = 14;
		int juni = 8;
		double durchschnitt = (april+mai+juni)/3.0;
		
		System.out.println("Niederchlag im April:\t"+april);
		System.out.println("Niederchlag im Mai:\t"+mai);
		System.out.println("Niederchlag im Juni:\t"+juni);
		System.out.println("Durchschnitt:\t\t"+durchschnitt);
		
		//Aufgabe 2
		
		int grad = 90;
		double bogenmaﬂ = grad*Math.PI/180;
		double sinx = Math.sin(bogenmaﬂ);
		double cosx = Math.cos(bogenmaﬂ);
		double ergebnis = sinx*sinx+cosx*cosx;
		System.out.println("Sinus: "+sinx+" Cosinus: "+cosx+" Ergebnis: "+ergebnis);
		
		
	}	
}
