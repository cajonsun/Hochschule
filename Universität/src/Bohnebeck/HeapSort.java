package Bohnebeck;

import java.util.Iterator;

public class HeapSort {
	
	public static void heapSort (Comparable[] f) {
		int i;
		
		for (i=f.length/2; i>=0; i--) {
			percolate(f, i, f.length);
		}
		
		for (int j=f.length-1; j>0 ; j--) {
			
			swap(f, 0, j);
			
			percolate(f, 0, j);
		}
	}
	
	private static void percolate(Comparable[] f, int index, int last) {
		int i = index+1;
		int j;
		
		while (2*i <= last) {	//f[i] has left son
			j=2*i;				//f[j] is left son of f[i]
			if (j<last) {		//f[i] has also right son
				if (f[j-1].compareTo(f[j]) > 0) {
					j++;		//f[j] is now smaller
				}
			}
			if (f[i-1].compareTo(f[j-1]) > 0) {	// is true, when father is bigger then son
				swap(f, i-1, j-1);	//change father and son position
				i=j;			//continue percolate
			}
			else {
				break;
			}
		}
	}
	
	private static void swap(Comparable[] f, int i1, int i2) {
		Comparable tmp = f[i1];
		f[i1] = f[i2];
		f[i2] = tmp;
	}
}
