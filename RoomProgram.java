package num3;

import java.util.Scanner;

public class RoomProgram {

	public static void main(String arg[]){

		Scanner input = new Scanner(System.in);
		
		double length, width, cost;
		
		System.out.print("What is the length of the room? ");
		length = input.nextDouble();
		System.out.print("What is the width of the room? ");
		width = input.nextDouble();
		System.out.print("What is the carpet cost per square foot? $");
		cost = input.nextDouble();
		
		RoomDimension room = new RoomDimension(length, width);
		RoomCarpet carpet = new RoomCarpet(room, cost);
	
		System.out.println("\n" + carpet.toString());
		
		input.close();
		
	}
	
}
