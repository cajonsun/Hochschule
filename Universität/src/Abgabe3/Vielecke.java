package Abgabe3;

public class Vielecke {

	public class Viereck {

		protected int seiteA;
		protected int seiteB;
		protected int seiteC;
		protected int seiteD;

		public Viereck(int A, int B, int C, int D) {
			this.seiteA = A;
			this.seiteB = B;
			this.seiteC = C;
			this.seiteD = D;
		}

		public Viereck(int A,int B) {
			this.seiteA = A;
			this.seiteB = B;
		}
		
		public Viereck(int A) {this.seiteA = A;}
		
		public Viereck() {}

		public int umfang() {
			int u = seiteA + seiteB + seiteC + seiteD;
			return u;
		}
		
		

	}

	public class Konvexes_Viereck extends Viereck {
		public Konvexes_Viereck(int A, int B, int C, int D) {super(A, B, C, D);}

		public Konvexes_Viereck(int A,int B) {super(A, B);}
		
		public Konvexes_Viereck() {super();}
		
	}

	public abstract class Trapez extends Konvexes_Viereck {
		
		public Trapez(int A, int B, int C, int D) {super(A, B, C, D);}

		public Trapez(int A,int B) {super(A, B);}
		
		public Trapez() {super();}
		
	}

	public class Parallelogramm extends Trapez {
		public Parallelogramm(int A, int B) {super(A, B);}

		public Parallelogramm() {super();}

		public int umfang() {
			int u = 2 * seiteA + 2 * seiteB;
			return u;
		}
	}

	public class Rhombus extends Parallelogramm {
		public Rhombus(int A) {
			this.seiteA = A;
		}

		public Rhombus() {super();}
		
		public int umfang() {
			int u = 4 * seiteA;
			return u;
		}
		
		public int flaeche() {
			int f = seiteA*seiteA;
			return f;
		}
	}

	public class Rechteck extends Parallelogramm {
		public Rechteck(int A, int B) {
			super(A, B);
		}

		public Rechteck() {super();}

		public int umfang() {return super.umfang();}
		
		public int flaeche() {
			int f = seiteA*seiteB;
			return f;
		}
	}

	public final class Quadrat extends Rhombus {
		public Quadrat(int A) {super(A);}

		public Quadrat() {super();}

		public int umfang() {return super.umfang();}

		public int flaeche() {return super.flaeche();
		}
	}
}
