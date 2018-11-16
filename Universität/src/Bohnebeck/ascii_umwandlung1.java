package Bohnebeck;

public class ascii_umwandlung1 {

		public static void main(String[] args) {
				
				int a = 757935403;
				int b;
				String c ="";				//Der Stringindex fängt bei 0 an !!!!		757935403
			
				while (a>0) {				//Die Eingabe wird in einen String gewandelt in dem die Hex-Werte der Blöcke stehen
					b=a%256;				
					c = Integer.toString(b)+'-'+c;		//die einzelnen Blöcke sind durch 'Minus' getrennt
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
					
					System.out.print((char)d);		//Ausgabe der einzelnen Ascii-Werte
				}
				System.out.print(" Programm von Ole Jacobsen");
		}
	
}
