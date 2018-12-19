package Abgabe4;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Texteinlesen {

	//Instanzvariablen
	private File 		file;
	private Scanner 	scan;
	private String 		temp;
	private int 		count = 0;
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
	
	public void einlesen() {
		
		//die Schleife läuft solange, bis sie bei der letzten Zeile
		//der einzulesenden Datei angekommen ist
		while(scan.hasNext()) {
			//ließt ein Token ein, also bis ein Leerzeichen kommt
			String temperrari = scan.next(); 
			
			//löscht alle Zeichen aus dem Token, außer die dort aufgelistet
			//sind (a-zA-ZßäüöÄÜÖ)
			temperrari = temperrari.replaceAll("[^a-zA-ZßäüöÄÜÖ]","");
			
			//wenn der neu erstellte String nicht leer ist, wird er 
			//in der Liste abgespeichert
			if (temperrari.length()>0) {
				sortList.add(temperrari);
			}
		}
	}
	
	//Gibt alle Elemente der Liste aus
	public void ausgeben() {
		for (String element : sortList) {
				System.out.println(element);
		}
	}
	
	//Gibt alle Elemente der Liste aus
	public void ausgebenAnzahl() {
		temp = "";
		for (String element : sortList) {
//			element = element.toLowerCase();
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
	 * 
	 */
	public void sortInsens() {
		Collections.sort(sortList);
		Collections.sort(sortList, String.CASE_INSENSITIVE_ORDER);
	}

	public void sortSens() {
		Collections.sort(sortList);
	}
}
