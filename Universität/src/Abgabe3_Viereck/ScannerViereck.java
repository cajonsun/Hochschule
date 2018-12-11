package Abgabe3_Viereck;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerViereck {
	static int z1, z2, z3, z4;
	static String name;
	
	public static  Viereck scan(String txt) throws ViereckException {
		Scanner s =  new Scanner(System.in);
		
		if (txt.equals("v") ||txt.equals("kv") || txt.equals("t") ) {
			System.out.println("Geben Sie 4 Zahlen ein");
			try {
				System.out.print("Zahl1: ");
				z1 = s.nextInt();
				System.out.print("Zahl2: ");
				z2 = s.nextInt();
				System.out.print("Zahl3: ");
				z3 = s.nextInt();
				System.out.print("Zahl4: ");
				z4 = s.nextInt();	

				if (z1>0 && z2>0 && z3>0 && z4>0) {
//					if (txt.equals("v")) {
//						name = "Viereck";
//						Viereck v = new Viereck(z1,z2,z3,z4,name);
//						return v;
//					}
//					else 
						if (txt.equals("kv")) {
						name = "Konvexes Viereck";
						Konvexes_Viereck kv = new Konvexes_Viereck(z1,z2,z3,z4,name);
						return kv;
					}
					else if (txt.equals("t")) {
						name = "Trapez";
						Trapez t = new Trapez(z1,z2,z3,z4,name);
						return t;
					}
				}
				else {
					throw new ViereckException(ViereckException.NEGATIV);
				}
			} catch (InputMismatchException ex) {
				ex.printStackTrace();
			}
		}
		
		if (txt.equals("p") || txt.equals("re")) {
			System.out.println("Geben Sie 2 Zahlen ein");
			System.out.print("Zahl1: ");
			z1 = s.nextInt();
			System.out.print("Zahl2: ");
			z2 = s.nextInt();
			
			if (z1>0 && z2>0) {
				if (txt.equals("p")) {
					name = "Parallelogramm";
					Parallelogramm p = new Parallelogramm(z1,z2,name);
					return p;
				}
				else if (txt.equals("re")) {
					name = "Rechteck";
					Rechteck re = new Rechteck(z1,z2,name);
					return re;
				}
			} 
			else {
				throw new ViereckException(ViereckException.NEGATIV);
			}
		}
		
		if (txt.equals("rh") || txt.equals("q")) {
			
			System.out.println("Geben Sie 1 Zahlen ein");
			System.out.print("Zahl1: ");
			z1 = s.nextInt();
			if (z1>0) {
				if (txt.equals("rh")) {
					name = "Rhombus";
					Rhombus p = new Rhombus(z1,name);
					return p;
				}
				else if (txt.equals("q")) {
					name = "Quadrat";
					Quadrat q = new Quadrat(z1,name);
					return q;
				}
			}
			else {
				throw new ViereckException(ViereckException.NEGATIV);
			}
		}
		return null;
	}
}
