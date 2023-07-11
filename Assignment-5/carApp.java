package practice;
import java.util.*;
public class CarApp {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter range of the car");
	int range=scan.nextInt();
	System.out.println("enter seats of the car");
	int seats=scan.nextInt();
	System.out.println("enter the airbags of the car");
	int airbags=scan.nextInt();
	System.out.println("enter the tires of the car");
	int tires=scan.nextInt();
	System.out.println("enter cost");
	int cost=scan.nextInt();
	System.out.println("enter mirrors");
	int mirrors=scan.nextInt();
	System.out.println("enter the colour");
	String colour=scan.next();
	System.out.println("enter type of the car");
	String type=scan.next();
	System.out.println("enter name of the car");
	String name=scan.next();
	System.out.println("enter brand of the car");
	String brand=scan.next();
	Car c=new Car(range, seats, airbags, tires, cost, mirrors, colour, type, name, brand);
	System.out.println(c.range+" "+seats+" "+airbags+" "+tires+" "+mirrors+" "+colour+" "+type+" "+name+" "+brand);
	}	

}
