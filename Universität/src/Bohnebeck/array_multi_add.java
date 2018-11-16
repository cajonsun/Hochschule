package Bohnebeck;

public class array_multi_add {

	public static void main(String[] args) {
		
//		arrayAddition();
		arrayMulti();
		
	}
	
	
	
	/**
	 * Gibt die einzelnen Werte eines Array aus
	 * @param array
	 */
	public static void ausgabeArray(int[][] array){
		for (int i = 0; i < array.length ; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}	
		System.out.println();
		}			
	}		
	
	/**
	 * Addition von Arrays
	 */
	public static void arrayAddition() {	
		int[][] array1 = new int[][] {{1,2,3},{4,5,6}};
		int[][] array2 = new int[][] {{10,20,30},{40,50,60}};		
		int[][] ergebnis = new int[3][3];
		
		for (int i = 0; i < array1.length; i++) {		//Länge der Zeilen von Array1
			for (int j = 0; j < array1[0].length; j++) {	//Länge der Spalten von Array1
			
				ergebnis[i][j] = array1[i][j]+array2[i][j];		
				System.out.print(ergebnis[i][j]+" ");
			}	
			System.out.println();
		}	
	}
	
	/**
	 * Multiplikation von Arrays
	 */
	public static void arrayMulti() {
		int [][] array3 = new int[][] {{1,2,3,4},{4,5,6,7}},
				 array4 = new int[][] {{1,2},{3,4},{5,6},{7,8}},
				 ergebnis_multi = new int[array3.length][array4[0].length];		//ergebnis multi hat die Zeilenlänge von Array3
				 																//und die Spaltenlänge von Array4
				 
				 
		for (int i = 0; i < ergebnis_multi[0].length; i++) {		/*Das i gibt an in welcher Spalte wir uns  
																	bei ergebnis_multi und array4 befinden*/
			for (int j = 0; j < array3.length; j++) {							/*Das j gibt an in welcher Zeile wir uns 
																				bei ergebnis_multi und bei array3 befinden*/
				for (int k = 0; k < array3[0].length; k++) {								//Das k gibt an in welcher Spalte wir uns bei array3 
					ergebnis_multi[j][i] = ergebnis_multi[j][i]+array3[j][k]*array4[k][i];	//und in welcher Zeile wir uns bei array4 befinden
				}
			}
		}	
		ausgabeArray(ergebnis_multi);
	}
}
