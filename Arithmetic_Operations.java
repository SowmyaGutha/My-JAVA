package MyPackage;

import java.util.Scanner;

public class Arithmetic_Operations {

	public void add(int x, int y) {
		int sum = x + y;
		System.out.println("Addition of two numbers : " + sum);
	}

	public static double addition(double num1, double num2) {
		return num1 + num2;

	}

	public static double substraction(double num1, double num2) {
		return num1 - num2;

	}

	public static double multiplication(double num1, double num2) {
		return num1 * num2;

	}

	public static double division(double num1, double num2) {
		return num1 / num2;

	}

	public static double modulus(double num1, double num2) {
		return num1 % num2;

	}

	public static double getInputFromUser() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();

	}

	public static void main(String[] args) {
		double num1;
		double num2;
		System.out.println("Please enter two numbers: ");
		num1 = getInputFromUser();
		num2 = getInputFromUser();
		System.out.println("Addition of two numbers : " + addition(num1, num2));
		System.out.println("Substraction of two numbers : " + substraction(num1, num2));
		System.out.println("Multiplication of two numbers : " + multiplication(num1, num2));
		System.out.println("Division of two numbers : " + division(num1, num2));
		System.out.println("Modulus of two munbers " + modulus(num1, num2));

	}

}
