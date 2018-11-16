package Abgabe3;

public class MainVielecke {

	public static void main(String[] args) {

		Vielecke v = new Vielecke();
		Vielecke.Viereck viereck1 = v.new Viereck(2,3,4,5);
		Vielecke.Konvexes_Viereck k_viereck1 = v.new Konvexes_Viereck(7,8,9,10);
//		Vielecke.Trapez trapez1 = v.new Trapez(6,2,4,5);
		Vielecke.Parallelogramm parallelogramm1 = v.new Parallelogramm(4,5);
		Vielecke.Rhombus rhombus1 = v.new Rhombus(3);
		Vielecke.Rechteck rechteck1 = v.new Rechteck(5,7);
		Vielecke.Quadrat quadrat1 = v.new Quadrat(4);
		
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
