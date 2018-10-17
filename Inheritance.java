import java.util.*;

//Hakikid Amana
//M0517019
//Informatika 2017

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //for user input
		int select; //declare a variable for switch case
		System.out.println("Set salary for: \n1. Lecturer\n2. Staff");
		select = scan.nextInt(); //ask user to insert number for switch case
		switch(select) {
		case 1 : System.out.println("The lecturer is:\n1. Government employee\n2. Non government employee\n3. Professional contract");
		int selLect;//declare a variable for switch case
		selLect = scan.nextInt();//ask user to insert number for switch case
			switch(selLect) {
			case 1 : lecturerPNS pns = new lecturerPNS(); //create lecturerPNS object
			System.out.println(pns.name +"'s total salary is "+ pns.totalSalary()); //get the total salary
			break;
			case 2 : lecturerNonPNS nonpns = new lecturerNonPNS();//create lecturerNonPNS object
			System.out.println(nonpns.name + "'s total salary is "+ nonpns.totalSalary()); //get the total salary
			break;
			case 3 : lecturerContract cont = new lecturerContract();//create lecturerContract object
			System.out.println(cont.name + "'s total salary is "+cont.totalSalary());//get the total salary
			break;
			default : System.out.println("Invalid input");//for invalid input 
			} break;
		case 2 : System.out.println("The staff is:\n1. Government employee\n2. Non government employee\n3. Contract employee");
		int selStaff;//declare a variable for switch case
		selStaff = scan.nextInt();//ask user to insert number for switch case
		switch(selStaff) {
		case 1 : staffPNS pns = new staffPNS();//create staffPNS object
		System.out.println(pns.name + "'s total salary is "+pns.totalSalary());//get the total salary
		break;
		case 2 : staffNonPNS nonpns = new staffNonPNS();//create staffNonPNS object
		System.out.println(nonpns.name+"'s total salary is "+nonpns.totalSalary());//get the total salary
		break;
		case 3 : staffContract cont = new staffContract();//create staffContract object
		System.out.println(cont.name+"'s total salary is "+cont.totalSalary());//get the total salary
		break;
		default : System.out.println("Invalid input");//for invalid input
		}break;
		default : System.out.println("Invalid input");//for invalid input
		}
	}
}

class Employee{ //create the superclass. this class is the head of other classes
	Scanner sc = new Scanner(System.in);//for user input
	String name;//declare variable for name
	public Employee() { //constructor, this is used by subclasses too if they don't have a constructor
		System.out.println("Insert name : ");
		this.name = sc.nextLine();//ask user to insert name
	}

	public long totalSalary(){//method to calculate total salary of an employee
		System.out.println("Insert salary amount : ");
		long salary = sc.nextLong();
		System.out.println("Insert aid amount : ");
		long aid = sc.nextLong();
		System.out.println("Insert renumeration amount : ");
		long renumeration = sc.nextLong();
		long totalSalary = salary + aid + renumeration;//default total salary formula
		 return(totalSalary);//return the value
	}
	
}

class Lecturer extends Employee{
	//just to differentiate between lecturer and staff
}

class Staff extends Employee{
	//just to differentiate between lecturer and staff
}

class lecturerPNS extends Lecturer{
	//this class use the default employee format
}

class lecturerNonPNS extends Lecturer{
	public long totalSalary() {//overriding the employee totalSalary method  
		System.out.println("Insert salary amount : ");
		long salary = sc.nextLong();
		System.out.println("Insert renumeration amount : ");
		long renumeration = sc.nextLong();
		long totalSalary = salary + renumeration;//totalSalary formula for lecturerNonPNS
		return(totalSalary);
	}
}

class lecturerContract extends Lecturer{
	public long totalSalary(){//overriding the employee totalSalary method 
		System.out.println("Insert total credit hours : ");
		int sks = sc.nextInt();
		System.out.println("Insert salary amount per credit hour : ");
		long salary = sc.nextLong();
		System.out.println("Insert renumeration amount : ");
		long renumeration = sc.nextLong();
		long totalSalary = salary*sks + renumeration;//totalSalary formula for lecturerContract
		 return(totalSalary);
	}
}

class staffPNS extends Staff{
	
}

class staffNonPNS extends Staff{
	public long totalSalary() {//overriding the employee totalSalary method 
		System.out.println("Insert salary amount : ");
		long salary = sc.nextLong();
		System.out.println("Insert aid amount : ");
		long aid = sc.nextLong();
		long totalSalary = salary + aid;//totalSalary formula for staffNonPNS
		return(totalSalary);
	}
}	

class staffContract extends Staff{
	public long totalSalary() {//overriding the employee totalSalary method 
		System.out.println("Insert salary amount : ");
		long salary = sc.nextLong();
		System.out.println("Insert renumeration amount : ");
		long renumeration = sc.nextLong();
		long totalSalary = salary + renumeration;//totalSalary formula for staffContract
		return(totalSalary);
	}
}	