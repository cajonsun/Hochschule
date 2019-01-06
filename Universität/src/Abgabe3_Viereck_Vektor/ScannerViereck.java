package Abgabe3_Viereck_Vektor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerViereck {
	static double x1, x2, x3, x4;
	static double y1, y2, y3 ,y4;
	static double[] punktA, punktB, punktC, punktD;
	static String name;
	static int txt;
	
	public static Viereck scan() throws ViereckException {
		Scanner s =  new Scanner(System.in);
		
		while (true) {
			System.out.println("\nWas für eine Art von Viereck wollen sie erstellen: "+
					"\nKon. Viereck: 1\tTrapez: 2\tParallelogramm: 3\nRechteck: 4 "
					+ "\tRhombus: 5\tQuadrat: 6");
			System.out.print("Geben Sie ihr gewünschtes Viereck ein: ");
			txt = s.nextInt();
			
			if (txt>0 && txt<7) {
				break;
			} else {
				System.out.println("Falsche Eingabe. Bitte versuchen Sie es erneut!");
			}
			
		}
		
		if (txt == 1 || txt==2 ) {
			System.out.println("\nGeben Sie die Koordinaten von 4 Punkte an und ");
			System.out.println("zwar von links unten und dann weiter gegen ");
			System.out.println("den Uhrzeigersinn. Deklaration: Punkt[x,y].");
			try {
				System.out.print("x1: ");
				x1 = s.nextDouble();
				System.out.print("y1: ");
				y1 = s.nextDouble();
				System.out.print("x2: ");
				x2 = s.nextDouble();
				System.out.print("y2: ");
				y2 = s.nextDouble();
				System.out.print("x3: ");
				x3 = s.nextDouble();
				System.out.print("y3: ");
				y3 = s.nextDouble();
				System.out.print("x4: ");
				x4 = s.nextDouble();	
				System.out.print("y4: ");
				y4 = s.nextDouble();	

				punktA = new double[]{x1, y1};
				punktB = new double[]{x2, y2};
				punktC = new double[]{x3, y3};
				punktD = new double[]{x4, y4};
				
				if (txt==1) {
					name = "Konvexes Viereck";
					return new Konvexes_Viereck(punktA,punktB,punktC,punktD,name);
					}
				else {
					name = "Trapez";
					return new Trapez(punktA,punktB,punktC,punktD,name);

				}

			}
			catch (InputMismatchException ex) {
				ex.printStackTrace();
			}
		}
		
		if (txt==3 || txt==4 || txt==5) {
			System.out.println("\nGeben Sie die Koordinaten von 3 Punkte an und ");
			System.out.println("zwar von links unten und dann weiter gegen ");
			System.out.println("den Uhrzeigersinn. Deklaration: Punkt[x,y].");
			System.out.print("x1: ");
			x1 = s.nextDouble();
			System.out.print("y1: ");
			y1 = s.nextDouble();
			System.out.print("x2: ");
			x2 = s.nextDouble();
			System.out.print("y2: ");
			y2 = s.nextDouble();
			System.out.print("x3: ");
			x3 = s.nextDouble();
			System.out.print("y3: ");
			y3 = s.nextDouble();
			
			punktA = new double[]{x1, y1};
			punktB = new double[]{x2, y2};
			punktC = new double[]{x3, y3};
			
			if (txt==3) {
				name = "Parallelogramm";
				return new Parallelogramm(punktA, punktB, punktC, name);
			}
			else if (txt==4) {
				name = "Rechteck";
				return new Rechteck(punktA, punktB, punktC, name);
			}
			else {
				name = "Rhombus";
				return new Rhombus(punktA, punktB, punktC, name);
			}
		}
		
		if (txt==6) {
			
			System.out.println("\nGeben Sie die Koordinaten von 2 Punkte an und ");
			System.out.println("zwar von links unten und dann weiter gegen ");
			System.out.println("den Uhrzeigersinn. Deklaration: Punkt[x,y].");
			System.out.print("x1: ");
			x1 = s.nextDouble();
			System.out.print("y1: ");
			y1 = s.nextDouble();
			System.out.print("x2: ");
			x2 = s.nextDouble();
			System.out.print("y2: ");
			y2 = s.nextDouble();
			
			punktA = new double[]{x1, y1};
			punktB = new double[]{x2, y2};
			name = "Quadrat";
			
			return new Quadrat(punktA, punktB, name);
		}
		return null;
	}
}
