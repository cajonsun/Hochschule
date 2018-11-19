package Abgabe2;

/**
 * Aufgabe 1 zu Kapitel 7 II
 * @author Ole Jacobsen
 */
import java.util.Scanner;

public class matrixLauncher {

	public static void main(String[] args) {

		// Initialisierung einer Matrix mit zufälligen Zahlenwerten
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben sie die Werte n und m für eine nxm-Matrix an:");
		System.out.print("n: ");
		int n = Integer.parseInt(scan.nextLine());
		System.out.print("m: ");
		int m = Integer.parseInt(scan.nextLine());

		// Erstellen und Ausgabe einer zufälligen Matrix
		int[][] array = matrixOperations.randomArrayZahlenwerte(n, m);
		matrixOperations.ausgabeArray(array);

		// Deklarierung der Matrizengrößen
		System.out.println("Geben sie zwei neue Werte für n und m an. Jeweils für Matrix1 und Matrix2:");
		System.out.println("Matrix1:");
		System.out.print("n: ");
		int n1 = Integer.parseInt(scan.nextLine());
		System.out.print("m: ");
		int m1 = Integer.parseInt(scan.nextLine());
		System.out.println("Matrix2:");
		System.out.print("n: ");
		int n2 = Integer.parseInt(scan.nextLine());
		System.out.print("m: ");
		int m2 = Integer.parseInt(scan.nextLine());

		int[][] array1 = new int[n1][m1];
		int[][] array2 = new int[n2][m2];
		int[][] array3 = null;

		// Erstellen zweier random Matrizen
		array1 = matrixOperations.randomArrayZahlenwerte(n1, m1);
		array2 = matrixOperations.randomArrayZahlenwerte(n2, m2);
		
		//Ausgabe der Matrizen 1 und 2
		System.out.println("\nMatrix 1: ");
		matrixOperations.ausgabeArray(array1);
		System.out.println("Matrix 2: ");
		matrixOperations.ausgabeArray(array2);

		// Addition zweier Matrizen
		array3 = matrixOperations.arrayAddition(array1, array2);
		matrixOperations.ausgabeArray(array3);

		// Multiplikation zweier Matrizen
		array3 = matrixOperations.arrayMulti(array1, array2);
		matrixOperations.ausgabeArray(array3);

		scan.close();

	}
}
