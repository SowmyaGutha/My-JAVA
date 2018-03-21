package MyPackage;

import java.util.Scanner;

public class CommandLine_Input {
	public static void main(String args[]) {
		System.out.println("Hello Please enter your first and last name : ");
		Scanner scanner = new Scanner(System.in);
		String fname = scanner.next();
		String lname = scanner.next();
		System.out.println("Hello " + fname + " " + lname + " Greeting for the day!! ");
		System.out.println("Enter your age is : ");
		int age = scanner.nextInt();
		System.out.println("your age is : " + age);
		System.out.println("Enter your Address : ");
		String address = scanner.nextLine(); // Not able to display full address with the help of next and nextline ,  need to ask for solution
		System.out.println("your address is : " + address); 
		System.out.println("Bye");

	}

}
