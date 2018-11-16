package Klassenverarbeitung;

public class Professorin extends Person {

	private int raumNr; // eigene Attribute

	public Professorin(String name, String email, int raumNr) { // Konstruktor
		super(name, email); // name und email werden mittels des Konstruktors der
							// Oberklasse gesetzt, Schlüsselwort super
		this.raumNr = raumNr; // Konstruktorerweiterung, um eigenes Attribut
								// matrikelNr zu setzten
	}

	public int getRaumNr() {
		return raumNr;
	}

	public void setRaumNr(int matrikelNr) {
		this.raumNr = raumNr;
	}

	// Erweiterung der Methode print() durch die Unterklasse Professorin
	public void print() {
		super.print(); /*
						 * Zuerst wird die Implementation der Oberklasse 
						 * mittels super aufgerufen
						 */
		System.out.println("Raumnummer: " + raumNr); //die Ausgabe wird mit raumNr ergänzt
	}
}
