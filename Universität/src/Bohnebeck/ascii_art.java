package Bohnebeck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ascii_art {

	public static void main(String[] args) {
		
		File inFile = new File("C:\\Users\\Ole\\Documents\\Studium\\Hochschule\\Progrmmieren1\\InputData.txt");
		Scanner scanner;
		try {
		scanner = new Scanner(inFile);
		// Lesen der einzelnen Integer-Werte
		while (scanner.hasNextInt()) {
		int a = scanner.nextInt();

			int b;
			String c ="";				//Der Stringindex fängt bei 0 an !!!!		757935403
		
			while (a>0) {				//Die Eingabe wird in einen String gewandelt in dem die Hex-Werte der Blöcke stehen
				b=a%256;				//die einzelnen Blöcke sind durch 'Minus' getrennt
				c = Integer.toString(b)+'-'+c;
				a=a/256;
			}
			String[] parts = c.split("-");	//String wir immer am Zeichen '-' gesplittet
			String part1 = parts[0]; 		//linker Block
			String part2 = parts[1]; 		//mitte links
			String part3 = parts[2]; 		//mitte rechts
			String part4 = parts[3]; 		//rechter Block
			
			for (int p=0;p<4;p++) {
				
				String partX =null;
				if (p==0) {partX = part4;}
				if (p==1) {partX = part3;}
				if (p==2) {partX = part2;}
				if (p==3) {partX = part1;}
				
				int d = Integer.parseInt(partX);
				
				System.out.print((char)d);		//Ascii Zeichen unter 100

				
			}
		}
		scanner.close();
		} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
			
			
	}
}




