package Klassenverarbeitung;

public class Person {
	
	//Attribute
	protected String name;
	protected String email;
	
	//Konstruktor
	public Person(String name, String email) {
		this.name = name;
		this.email = email;	
	}
	
	//Methoden
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void print() {
		System.out.println("Name: "+name);
		System.out.println("E-Mail: "+email);
	}
}
