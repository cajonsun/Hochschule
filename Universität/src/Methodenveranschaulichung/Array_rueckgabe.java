package Methodenveranschaulichung;

public class Array_rueckgabe {
	
	public static void main(String[] args) {
		
		int[][] array1 = new int[2][2];			// WARUM?????????
		
//		array1 = random_Arraygroeße(array1);
		array1 = random_Array_Zahlenwerte(array1);
		ausgabeArray2dim(array1);
	}
/**
 * Methode, um ein gewünschtes zwei dimensionales Array beliebiger Größe ausgegeben zu lassen
 * Diese Methode gibt keine Wert zurück, weil da void steht, 
 * sondern gibt nur die einzelnen Werte des Array aus
 * @param array
 */ 
	public static void ausgabeArray2dim(int[][] array){
		for (int i = 0; i < array.length ; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}	
		System.out.println();
		}			
	}
	
/**
 * Methode, um ein Array beliebiger Größe mit zufälligen Zahlen zu erstellen und zurückzugeben
 * @param array
 * @return
 */
	public static int[][] random_Array_Zahlenwerte(int[][] array) {
	
		// Radom Zahlenwerte im Array
		for (int i = 0; i < array.length; i++) {			
			for (int j = 0; j < array[0].length; j++) {				
				array[i][j] = (int) (1+((Math.random()*100)));
			}			
		}			
		return array; //MUSS NUR GEMACHT WERDEN WENN DAS ARRAY IN DER METHODE ANDERS HEIßT ALS 
					  //DAS ARRAY WAS MAN ÄNDERN MÖCHTE ODER?
	}
	
/**
 * Methode, um ein Array zu erstellen, welches eine zufällige Spalten- und Zeilengröße
 * zwischen 0 und 10 hat
 * @param array
 * @return
 */
	public static int[][] random_Arraygroeße(int[][] array){
	
		int n = (int) (Math.random()*10);
		int m = (int) (Math.random()*10);
		return array = new int[n][m];
	}
	

}
