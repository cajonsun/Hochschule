package Abgabe4;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Aufgabe zu Kapitel 10
 * @author Ole Jacobsen
 *
 */

public class Texteinlesen {

	//Instanzvariablen
	private File 		 file;
	private Scanner 	 scan;
	private String 		 temp;
	private int 		 count  = 0;
	boolean 			abfrage = false;
	private List<String> sortList = new ArrayList<String>();
	
	//Konstruktor
	public Texteinlesen(String inFile) {
		this.file = new File(inFile);
		try {
			this.scan = new Scanner(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	//Methoden
	
	/**
	 * Lieﬂt die einzelnen Wˆrter des Textes ein, lˆscht alle 
	 * Sonderzeichen und ‰hnliches und speichert sie dann in
	 * einer Liste ab
	 */
	public void einlesen() {
		
		//die Schleife l‰uft solange, bis sie bei der letzten Zeile
		//der einzulesenden Datei angekommen ist
		while(scan.hasNext()) {
			
			//lieﬂt ein Token ein, also bis ein Leerzeichen kommt
			String temperrari = scan.next(); 
			
			//lˆscht alle Zeichen aus dem Token, auﬂer die dort aufgelistet
			//sind (a-zA-Zﬂ‰¸ˆƒ‹÷)
			temperrari = temperrari.replaceAll("[^a-zA-Zﬂ‰¸ˆƒ‹÷]","");
			
			//wenn der neu erstellte String nicht leer ist, wird er 
			//in der Liste abgespeichert
			if (temperrari.length()>0) {
				sortList.add(temperrari);
			}
		}
	}
	
	/**
	 * Gibt alle Elemente der Liste aus
	 */
	public void ausgeben() {
		for (String element : sortList) {
				System.out.println(element);
		}
	}
	
	/**
	 * Gibt alle Elemente der Liste aus mit der Anzahl
	 */
	public void ausgebenAnzahl() {
		temp = "";
		for (String element : sortList) {
			
			if(!abfrage) {
			element = element.toLowerCase();
			}
			
			if (element.equals(temp) || temp.equals("")) {
				count++;
			} else {
				System.out.println("Anzahl:"+count+" "+temp);
				count = 1;
			}		
			temp = element;
		}
		System.out.println("Anzahl:"+count+" "+temp);
		count = 0;
	}
	
	/**
	 * Sortiert die Liste ohne auf Groﬂ- und Kleinschreibung zu achten
	 */
	public void sortInsens() {
		Collections.sort(sortList);
		Collections.sort(sortList, String.CASE_INSENSITIVE_ORDER);
		abfrage = false;
	}

	/**
	 * Sortiert die Liste und achtet dabei auf Groﬂ- und Kleinschreibung
	 */
	public void sortSens() {
		Collections.sort(sortList);
		abfrage = true;
	}
}
