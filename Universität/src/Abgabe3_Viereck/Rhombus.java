package Abgabe3_Viereck;

public class Rhombus extends Parallelogramm {
	public Rhombus(int A, String name) {
		this.seiteA = A;
		this.name	= name;
	}

	public Rhombus() {super();}
	
	public int umfang() {
		int u = 4 * seiteA;
		return u;
	}
	
	public void flaeche() {
		int f = seiteA*seiteA;
		System.out.println("Der Fl�cheninhalt betr�gt "+f);
	}
	
	public void print() {
		System.out.println("Die Seitenl�ngen des "+name+" sind:");
		System.out.println("A: "+seiteA);
	}
}
