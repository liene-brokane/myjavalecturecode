public class Calculator {

	public static void main(String[] args) {
		// Operators to use: +,-,/,*,%
		// char c = '/';
		// if(c=='/'){syso(num1/num2}else if(c=='*'){syso(num1*num2}etc.

		char operatorMath = '=';

		double num1 = 23.0;
		double num2 = 24.5;
		double result;

		if (operatorMath == '+') {
			result = num1 + num2;
			System.out.println(result);
		} else if (operatorMath == '-') {
			result = num1 - num2;
			System.out.println(result);
		} else if (operatorMath == '*') {
			result = num1 * num2;
			System.out.println(result);
		} else if (operatorMath == '/') {
			result = num1 / num2;
			System.out.println(result);
		} else if (operatorMath == '%') {
			if (num1 >= num2) {
				result = num1 % num2;
				System.out.println(result);
			} else {
				System.out.println("If num1 is less than num2"
						+ " then result is num1: " + num1);
			}
		} else {
			System.out.println("Wrong data");
		}

		System.out
				.println("-----------------------------------------------------------");

		// switch(character name){
		// case: 'character itself';
		// syso(num1/num2)
		// brake; etc.

		switch (operatorMath) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		case '%':
			if (num1 >= num2) {
				result = num1 % num2;
				System.out.println(result);
			} else {
				System.out.println("If num1 is less than num2"
						+ " then result is num1: " + num1);
			}
			break;
		default:
			System.out.println("No such operator.");
		}

	}
}