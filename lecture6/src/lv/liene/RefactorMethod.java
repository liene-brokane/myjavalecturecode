package lv.liene;

public class RefactorMethod {


	public static void main(String[] args) {
		
		getGreetingWithVoid(19);
		System.out.println(getGreeting(17));

	}
	
	public static String getGreeting(int time){
		if(time < 8){
			return "Good Morning!";
		}else if(time < 18){
			return "Good Day!";
		}else{
			return "Good Evening!";
		}
	}
	
	public static void getGreetingWithVoid(int time){
		if(time < 8){
			System.out.println("Good Morning!");
		}else if(time < 18){
			System.out.println("Good Day!");
		}else{
			System.out.println("Good Evening!");
		}

		
	}

}
