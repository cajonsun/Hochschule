package Bohnebeck;

public class HeapExample {
	
	public static void main(String[] args) {
		Integer[] array = {5, 1, 8, 3, 9, 2};
		
		ausgabeArray(array);
		HeapSort.heapSort(array);
		ausgabeArray(array);
	}
	
	/**
	 * Gibt die einzelnen Werte eines Array aus
	 * @param array
	 */
	public static void ausgabeArray(Integer[] array){
		System.out.println("Feldelemente von array:");
		for (int i = 0; i < array.length ; i++) {
				System.out.print(array[i]+" ");	
		}
		System.out.println();
	}
}
