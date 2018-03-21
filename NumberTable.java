package MyPackage;

import java.util.Scanner;

public class NumberTable {

	public static int getInputFromUser() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	public static void table(int num1, int num2) {
		for (int i = 1; i <= num2; i++) {
			int result = num1 * i;
			System.out.println(num1 + " * " + i + " = " + result);
		}
	}

	public static void main(String[] args) {

		int num1, num2;
		System.out.println("Enter tow numbers for number table : ");
		num1 = getInputFromUser();
		num2 = getInputFromUser();
		NumberTable.table(num1, num2);

	}
}
