package org.generation;

import org.generation.classes.Employee;
import org.generation.classes.Person;
import org.generation.exceptions.EmailFormatException;


public class Main {
	public static void main (String[] args) {
		Employee luis = new Employee("Luis Loranca",23,"luisloranca@gmail.com",
								 "XAXX000000","Domicilio conocido", "IT", 420.25);
		/*luis.name="Luis Loranca";				
		luis.age=23;					------>	Lo comente para comprobar<
		luis.email= "luisloranca@gmail.com";	que el otro constructor de main si
		luis.rfc="XAXX000000";					jala ----sirvio de ejemplo---
		luis.address="Domicilio conocido";*/
		
		Employee elizabeth = new Employee("Elizabeth Diaz", 20 ,"elizabeth@yahoo.com"
				,"XAXX000000","Casa", "IT", 525.12);
								
						//Debe ser Employee 
		//Person francisco = new Person("Francisco MArtinez"); 
		//no lo puede instancias porque debe ser especifico no abrstrcto
		
			luis.setDepartment("Software Development");
		try {
			luis.setEmail("luisloranca@gmail.com");
		} catch (EmailFormatException e) {
			//e.printStackTRace();
			System.out.println(e.getMessage());
		}//catch		
		
						//("No tengo");
		//System.out.println(luis.name + ", " + luis.age);
		//System.out.println(elizabeth.name + ", " + elizabeth.age);
		
		System.out.println(luis.toString());
		System.out.println(elizabeth); //Llama a String.valueOf() que manda llamar
		
		
	}//main

}//class Main
