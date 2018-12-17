package Abgabe4;

public class TexteinlesenMain {

	public static void main(String[] args) {
		String file = "C:\\Users\\oleja\\OneDrive\\Dokumente\\Programmieren1\\Abgabeordner\\Abgabe4\\Tageschautext.txt";
		Texteinlesen text = new Texteinlesen(file);
		text.einlesen();
		text.ausgeben();
	}
}
