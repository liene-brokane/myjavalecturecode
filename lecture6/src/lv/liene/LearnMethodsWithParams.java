package lv.liene;

public class LearnMethodsWithParams {


	public static void main(String[] args) {
		
		double r = 59.2;
		String color = "red";
		
		
		int resultWithCastInt = getArea(r); //this method casts double to int
		double result = getAreaForCircle(r);
		System.out.println("Area: "+resultWithCastInt);
		System.out.println("Area: "+result);
		
		System.out.println(getColorAndArea(color, result));
	}
	
	public static int getArea(double radius){
		double result = Math.PI * radius * radius;
		return (int) result;
		
	}
	
	public static double getAreaForCircle(double radius){
		double result = Math.PI * radius * radius;
		return result;
	}
	
	public static String getColorAndArea(String color, double area){
		return "Color: "+ color + " and area " + area;
	}

}
