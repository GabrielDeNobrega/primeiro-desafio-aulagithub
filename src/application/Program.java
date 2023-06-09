package application;

import java.util.Locale;
import java.util.Scanner;

import application.services.CalculatorService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("*** Sum Two Integer Numbers ***");

		System.out.print("Insert the first number: ");
		Integer firstNumber = sc.nextInt();
		System.out.print("Insert the second number: ");
		Integer secondNumber = sc.nextInt();

		System.out.println("The final result of the sum is equal to "
				+ CalculatorService.sumTwoIntegerNumbers(firstNumber, secondNumber) + ".");

		sc.close();

	}

}
