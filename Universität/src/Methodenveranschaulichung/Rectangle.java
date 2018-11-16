package Methodenveranschaulichung;

public class Rectangle {

	public static int fläche (int höhe, int breite) {
		int a = höhe*breite;
		return a;
	}
	
	public static int umfang (int höhe, int breite) {
		int u = 2*höhe + 2*breite;
		return u;
	}
}
