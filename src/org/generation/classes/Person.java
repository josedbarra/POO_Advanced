//Indica que pertenece al paquete org.generation.class
package org.generation.classes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.generation.exceptions.EmailFormatException;


public abstract class Person {
	private	String name;
	private int age;
	private String email;
	protected String rfc; //se cambio el modificador de acceso de private a protected para que lo pueda heredar
	private String address;
	private int id;
	private static int total=0;
	
	public Person (String name, int age, String email, String rfc, String address) {
			this.name=name.toUpperCase(); 
			this.age=(age>=18)?age:18; //Nos ayuda a reutilizar codigo y sobrecarga
			this.email=email.toLowerCase(); // Si algo cambia en los requirimientos de la empresa 
			this.rfc=rfc;					//	solo modifico los requirimientos aqui
			this.address=address;
			Person.total++;
			id = Person.total;
		}// constructor // Este es mi constructor
	
	public Person(String name, int age, String email) {
		this(name, age, email, "XAXX000000", "Su Casa");
	}//Constructor
	
	public Person(String name) {
		this(name, 18, "sincorreo@dominio.com");
	}//Constructor
	
	public String getName( ) {
		return name;
	}//getName
	
		public void setName(String name) {
			this.name = name;
		}//setName
	
		public String getAddress() {
			return address;
		}//getAddress
		
		public void setAddress(String address) {
			this.address = address;
		}//setAddress
		
		public abstract void setRfc(String name);//Lo va tener que definir en la clase heredada por ser abstracto
	
	public String gtRfc() {
		return this.rfc.toUpperCase();
	}//getRfc
	
	public void setEmail(String email) throws EmailFormatException {
		this.email = null;
		Pattern regex = Pattern.compile
				("^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$");
		Matcher m = regex.matcher(email);
		if(m.matches()) {
			this.email=email;
		} else {
			throw new EmailFormatException(email + "no es un formato de correo correcto.");
		}//if
	}//setEmial
	
	public String getEmail() {
		return (this.email!=null)?email.toLowerCase():null;
	}//getEmail
	
	public void setAge(int age) {
		this.age = (age>=18)?age:18;
	}//setAge
	
	public int getAge() {
		return this.age;
	}//getAge

	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", rfc=" + rfc + ", address=" + address
				+ ", id=" + id + "]";
	}//toString


}//class Person
