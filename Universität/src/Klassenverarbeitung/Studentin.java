package Klassenverarbeitung;

public class Studentin extends Person{		//abgeleitete Klasse mittels extends

	private int matrikelNr;					//eigene Attribute
	
	public Studentin(String name, String email, int matrikelNr) {	//Konstruktor
		super(name, email);				//name und email werden mittels des Konstruktors der 
										//Oberklasse gesetzt, Schlüsselwort super
		this.matrikelNr = matrikelNr;	//Konstruktorerweiterung, um eigenes Attribut
										//matrikelNr zu setzten
	}

	public int getMatrikelNr() {
		return matrikelNr;
	}
	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}
	
	public void print() {
		super.print();
		System.out.println("Matrikelnummer: "+ matrikelNr);
	}
}
