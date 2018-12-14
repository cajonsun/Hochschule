package Abgabe3_Viereck_Vektor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerViereck {
	static int x1, x2, x3, x4;
	static int y1, y2, y3 ,y4;
	static double[] punktA, punktB, punktC, punktD;
	static String name;
	
	public static Viereck scan(String txt) throws ViereckException {
		Scanner s =  new Scanner(System.in);
		
		if (txt.equals("v") ||txt.equals("kv") || txt.equals("t") ) {
			System.out.println("Geben Sie 4 Punkte ein");
			try {
				System.out.print("x1: ");
				x1 = s.nextInt();
				System.out.print("y1: ");
				y1 = s.nextInt();
				System.out.print("x2: ");
				x2 = s.nextInt();
				System.out.print("y2: ");
				y2 = s.nextInt();
				System.out.print("x3: ");
				x3 = s.nextInt();
				System.out.print("y3: ");
				y3 = s.nextInt();
				System.out.print("x4: ");
				x4 = s.nextInt();	
				System.out.print("y4: ");
				y4 = s.nextInt();	

				punktA = new double[]{x1, y1};
				punktB = new double[]{x2, y2};
				punktC = new double[]{x3, y3};
				punktD = new double[]{x4, y4};
				
				if (txt.equals("kv")) {
					name = "Konvexes Viereck";
					Konvexes_Viereck kv = new Konvexes_Viereck(punktA,punktB,punktC,punktD,name);
					return kv;
					}
				else if (txt.equals("t")) {
					name = "Trapez";
					Trapez t = new Trapez(punktA,punktB,punktC,punktD,name);
					return t;
				}

			}
			catch (InputMismatchException ex) {
				ex.printStackTrace();
			}
		}
		
		if (txt.equals("p") || txt.equals("re")) {
			System.out.println("Geben Sie 2 Zahlen ein");
			System.out.print("x1: ");
			x1 = s.nextInt();
			System.out.print("y1: ");
			y1 = s.nextInt();
			System.out.print("x2: ");
			x2 = s.nextInt();
			System.out.print("y2: ");
			y2 = s.nextInt();
			
			punktA = new double[]{x1, y1};
			punktB = new double[]{x2, y2};
			
			if (txt.equals("p")) {
				name = "Parallelogramm";
				Parallelogramm p = new Parallelogramm(punktA, punktB, punktC, name);
				return p;
			}
			else if (txt.equals("re")) {
				name = "Rechteck";
				Rechteck re = new Rechteck(punktA, punktB, name);
				return re;
			}
		}
		
		if (txt.equals("rh") || txt.equals("q")) {
			
			System.out.println("Geben Sie 1 Zahlen ein");
			System.out.print("x1: ");
			x1 = s.nextInt();
			System.out.print("y1: ");
			y1 = s.nextInt();
			
			punktA = new double[]{x1, y1};
			
			if (txt.equals("rh")) {
				name = "Rhombus";
				Rhombus p = new Rhombus(punktA, name);
				return p;
			}
			else if (txt.equals("q")) {
				name = "Quadrat";
				Quadrat q = new Quadrat(punktB, name);
				return q;
			}
		}
		return null;
	}
}
