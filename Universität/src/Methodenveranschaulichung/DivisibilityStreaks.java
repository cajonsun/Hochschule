package Methodenveranschaulichung;

public class DivisibilityStreaks {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 31; i < 32; i++) {
			System.out.println(i);
			sum = sum+pStreak(i,Math.pow(4, i));
		}
		System.out.println(sum);
	}
	
	public static int streak(double n) {
		int i = 1;
		while (true) {
			if (n%i==0) {
				n++;
				i++;
			} else {
				i--;
				return i;
			}
		}
	}
	
	public static int pStreak(int s, double N) {
		int zwerg;
		int erg = 0;
		for (double i = 2; i < N ; i++) {
			zwerg = streak(i);
			if (zwerg==s) {
				erg++;
			}
		}
		return erg;
	}
}
