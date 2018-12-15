package Methodenveranschaulichung;

public class test {
 static int a = 1;

public int rueck2(int a) {
	a = a+1;
	int c = 7;
	return c;
}

public static int rueck() {
	a = a+1;
	int c = 9;
	return c;
}

public static void main(String[] args) {
	test Test = new test();
	System.out.println("a: "+a);
	int b = Test.rueck2(Test.a);
	System.out.println("a: "+a+" b: "+b);
	
	int c = rueck();
	System.out.println("a: "+a+" b: "+c);
}
}
