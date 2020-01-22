public class TestIfElseAndBlocks {

	public static void main(String[] args) {
		System.out.println("*******");
		System.out.println("*******");

		boolean test = true;
		int result;

		if (test) {
			int number = 100;
			System.out.println("TRUE");
			System.out.println(number+number);
			//"number" variable in this case only works in this particular block
			//it would not be recognized outside of this block and couldn't be used!
			result = number + number;
			System.out.println("Result value is "+result);
		} else {
			System.out.println("FALSE");
		}
		System.out.println("AFTER if else block");

		boolean test2 = true;

		if (test2) {
			System.out.println("TRUE");
			int number = 200;
			result = number + number;
			System.out.println("Result value is "+result);
		} else {
			System.out.println("FALSE");
		}
		System.out.println("AFTER if else block");
	}

}
