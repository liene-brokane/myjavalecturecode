import java.util.Scanner;

public class ScannerCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Number 1: ");
		int num1 = sc.nextInt();

		System.out.println("Number 2: ");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.println("Input operator +-*/ : ");
		String operatorMath = sc.nextLine();
		// "add" ir mainīgais
		int result = 0;

		if (operatorMath.equals("+")) {
			// "add" ir mainīgais; "equals" ir definēts, kas strādā uz mainīgo
			result = num1 + num2;
		} else if (operatorMath.equals("-")) {
			result = num1 - num2;
		} else if (operatorMath.equals("*")) {
			result = num1 * num2;
		} else if (operatorMath.equals("/")) {
			result = num1 / num2;
		}

		// System.out.println("The result is "+result);
		System.out.println(result + " = " + num1 + " " + operatorMath + " "
				+ num2);

	}

}
