package Abgabe3_1;

public class VieleckMain {

	public static void main(String[] args) {
		Viereck viereck1 = new Viereck(2,3,4,5);
		Konvexes_Viereck k_viereck1 = new Konvexes_Viereck(7,8,9,10);
//		Vielecke.Trapez trapez1 = v.new Trapez(6,2,4,5);
		Parallelogramm parallelogramm1 = new Parallelogramm(4,5);
		Rhombus rhombus1 = new Rhombus(3);
		Rechteck rechteck1 = new Rechteck(5,7);
		Quadrat quadrat1 = new Quadrat(4);
		
		System.out.println("Der Umfang des Vierecks ist: "+viereck1.umfang());
		System.out.println("Der Umfang des Konfexen Vierecks ist: "+k_viereck1.umfang());
//		System.out.println("Der Umfang des Trapezes ist: "+trapez1.umfang());
		System.out.println("Der Umfang des Parallelogramms ist: "+parallelogramm1.umfang());
		System.out.println("Der Umfang des Rhombus ist: "+rhombus1.umfang());
		System.out.println("Der Umfang des Rechtecks ist: "+rechteck1.umfang());
		System.out.println("Der Umfang des Quadrats ist: "+quadrat1.umfang());
		System.out.println("Der Flächeninhalt des Rhombus ist: "+rhombus1.flaeche());
		System.out.println("Der Flächeninhalt des Rechtecks ist: "+rechteck1.flaeche());
		System.out.println("Der Flächeninhalt des Quadrats ist: "+quadrat1.flaeche());

		
	}
}
