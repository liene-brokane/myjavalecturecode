
public class OperatorsMath {


	public static void main(String[] args) {
		double num1 = 0.4;
		double num2 = 0.3;
		double result;
		double result1;
		double result2;
		double result3;
		double result4;
		char operators = '+';
		char operatorMinus = '-';
		char operatorMult = '*';
		char operatorDiv = '/';
		char operatorMod = '%';
		result = num1 + num2;
		result1 = num1 - num2;
		result2 = num1 * num2;
		result3 = num1 / num2;
		result4 = num1 % num2;
		System.out.println(num1 + " "+operators+ " "+num2+ " = "+result);
		
		System.out.println(num1 + " "+operatorMinus+ " "+num2+ " = "+result1);
		
		System.out.println(num1 + " "+operatorMult+ " "+num2+ " = "+result2);
		
		System.out.println(num1 + " "+operatorDiv+ " "+num2+ " = "+result3);
		
		System.out.println(num1 + " "+operatorMod+ " "+num2+ " = "+result4);
		
		int a = 8;
		int b = 3;
		int x = a % b;
		System.out.println("x = "+x);
		
		int i = 2;
		i++;
		System.out.println(i);
		
		int k = 2;
		//return increment result ++ increment by value 1
		int p = ++k;
		System.out.println("p after increment: "+p);
		
		int o = 2;
		
		int f = o++;
		System.out.println("f after increment: "+f);
		
	}

}
