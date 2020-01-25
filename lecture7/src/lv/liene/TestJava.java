package lv.liene;

import lv.liene.geometricfigures.Circle;
import lv.liene.player.FootballPlayer;

public class TestJava {

	public static void main(String[] args) {

		FootballPlayer player = new FootballPlayer("Ronaldo", "forward", 7,
				true, 186, 83);
		
		Circle figure = new Circle();
		System.out.println(figure.getColor()+" "+figure.getRadius());
		
		

		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());
		
		player.setShirtNumber(10);
		System.out.println("--------------------------------------------");
		System.out.println(player.getName());
		System.out.println(player.getPosition());
		System.out.println(player.getShirtNumber());
		System.out.println(player.isBuild());
		System.out.println(player.getHeight());
		System.out.println(player.getWeight());

	}

}
