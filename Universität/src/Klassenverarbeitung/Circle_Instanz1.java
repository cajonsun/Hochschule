package Klassenverarbeitung;

public class Circle_Instanz1 {
	int radius;
	public static double fläche (int radius) {
		double a= Math.PI* Math.pow(radius, 2);		//Verwenden der mathe funktion pi und der funktion (x hoch y)
		return a;									//Rückgabe des Wertes a für die Funktion "fläche"
		}
	public static double umfang (int radius) {
		double u= Math.PI *radius*2;
		return u;
	}

}

