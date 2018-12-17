package Abgabe4;

import java.util.Comparator;

//Vergleicht alle Elemente aus der Liste und sortiert sie
//String muss bei Comparator stehen, weil String Objekte
//in der Liste gespeichert wurden
public class Sortierer implements Comparator<String>{
	
	//vergleicht die zwei Objekte aus der Liste
	public int compare(String o1, String o2) {
		
		if (TexteinlesenMain.unterscheiden) {
			return o1.compareTo(o2);
		}
		return o1.compareToIgnoreCase(o2);
	}
}
