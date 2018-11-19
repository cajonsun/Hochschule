package Methodenveranschaulichung;

public class nebeneffekt_Erklärung {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3};
		int position = 2;
		int a;
		
		a = rueck(array, position);
		System.out.println("Wert von Array an der Position 3: "+array[position]+"  und Wert a ist: "+a);
		
		aenderung(array, position);
		System.out.println("Wert von Array an der Position 3: "+array[position]);
	
	}
	
	/**
	 * Rueck speichert den neu errechneten Wert in einer 
	 * anderen Variablen und verändert das Array an sich
	 * nicht. Es gibt also keinen Nebeneffekt, weil das Array
	 * an sich gleich bleibt, obwohl mit einem wert aus
	 * dem Array gerechnet wurde
	 * @param array
	 * @param position
	 * @return
	 */
	public static int rueck(int[] array, int position) {
		
		int a = array[position]+7;
		return a;
	}
	
	/**
	 * aenderung speichert den neu errechneten Wert direkt  
	 * an derselben Stelle, auf die auch zugegriffen wurde
	 * und überschreibt somit auch den vorheriegen wert, der
	 * an dieser Stelle vorher definiert war. Also rechne ich 
	 * hier auch mit einem Wert aus dem Array und habe aber
	 * auch als Nebeneffekt, dass dieser Wert dann dauerhaft
	 * geändert wird
	 * @param array
	 * @param position
	 * @return
	 */
	public static int aenderung(int[] array,int position) {
		
		array[position] = array[position]+7;
		int a = array[position];
		return a;
	}
	
}
