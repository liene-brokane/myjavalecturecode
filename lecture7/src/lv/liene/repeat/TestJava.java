package lv.liene.repeat;

import java.util.Scanner;

public class TestJava {


	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Input value ");
		
		int inputvalue;
		@SuppressWarnings("unused")
		boolean done;
		

		while(!(input.hasNextInt())){
			if(input.hasNextInt()){
				inputvalue = input.nextInt();
				done = true;
			}else{
				done = false;
			}
			
			inputvalue = input.nextInt();
			System.out.println("Assign to variable with type int "+inputvalue);
		}
		



	}

}
