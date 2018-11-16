package Java_Tutorial;

public class Boolesche_Ausdrücke {

	public static void main(String[] args) {
		beispiel();
	}
	
	public static void beispiel() {
		int bargeld = 150;
		int kredit	= 20000;
		
		//Eine Und-Funktion
		if( bargeld>200 && kredit>10000) {			
			System.out.println("Du hast genügend Geld");
		}
		
		//Eine Oder-Funktion
		if(bargeld>200 || kredit>10000)
			System.out.println("Du hast entweder genügend Bargeld oder genügend Kredit");
		
		//Eine Negierung
		if (bargeld != 200)
			System.out.println("Bargeld ist nicht gleich 200");
		
		if (!(bargeld>200)) {
			System.out.println("Du hast zu wenig Geld");
		}
	}
	

}	
