package Methodenveranschaulichung;

public class compare {
	public static void main(String[] args) {
	Integer[] array = {3,2};
	
	if (array[0].compareTo(array[1]) > 0) {				// Wenn die Zahl von array[0] größer als die 
														// Zahl, die in der Klammer von compareTo steht, ist,
														// wird ein Wert größer als Null i9n der Bedingung ausgegeben und 
														// somit dann der Text "Die Zahl ist größer"
														// (array[0].compareTo(array[1]) = 1)
		System.out.println("Die Zahl ist größer");
	}
	else {
		System.out.println("Die Zahl ist kleiner");		// Wenn die Zahl von array[0] kleiner als die 
														// Zahl, die in der Klammer von compareTo steht, ist,
														// wird ein Wert kleiner als Null in der Bedingung ausgegeben und 
														// in diesem auch der Text "Die Zahl ist kleiner"
														// (array[0].compareTo(array[1]) = -1)
	}
	
	// Wenn die verglichenen Werte gleichgroß sind, wird der Wert 0 ausgegeben
	// (array[0].compareTo(array[1]) = 0)
	}
}
