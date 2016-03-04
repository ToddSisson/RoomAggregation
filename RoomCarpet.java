package num3;

import java.text.DecimalFormat;

public class RoomCarpet {

	private RoomDimension size;
	private double carpetCost;
	
	public RoomCarpet(RoomDimension dim, double cost){
		size = dim;
		carpetCost = cost;
	}
	
	public double getTotalCost(){
		return size.getArea() * carpetCost;
	}
	
	public String toString(){
		DecimalFormat dollar = new DecimalFormat("$#0.##");
		return "Price of carpet: " + dollar.format(getTotalCost());
	}
	
}
