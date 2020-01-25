package lv.liene;

public class LearnMethods {

	public static void main(String[] args) {
		
		getMyName();
		getMyName();
		getMyName();
		getMyName();
		getMyName();
		getMyName();
		getMyName();
		System.out.println("--------------------------------------");
		getMyCity();
		
		LearnMethods classObject = new LearnMethods();
		
		classObject.doYouHaveACat();
		
		

	}
	public static void getMyName(){
		System.out.println("My name is Liene.");
	}
	public static void getMyCity(){
		getMyName();
		System.out.println("My city is Ventspils.");
	}
	
	public void doYouHaveACat(){
		System.out.println("Yes.");		
	}
}
