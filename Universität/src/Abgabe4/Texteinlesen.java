package Abgabe4;

import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Texteinlesen {

	//Instanzvariablen
	private File file;
	private Scanner scan;
	public List<String> sortList = new ArrayList<String>();
	
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
		while(scan.hasNext()) {
			String temperrari = scan.next();
			temperrari.replaceAll("[^a-zA-Zﬂ‰¸ˆƒ÷‹]","");
			sortList.add(temperrari);
		}
	}
	
	public void ausgeben() {
		for (String element : sortList) {
			System.out.println(element);
		}
	}
}
