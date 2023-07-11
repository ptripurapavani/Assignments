package practice;

public class Car {
	int range;
	int seats;
	int airbags;
	int tires;
	int cost;
	int mirrors;
	String colour;
	String type;
	String name;
	String brand;
	void drive()
	{
		System.out.println(name+"car is used for driving");
	}
	void safety()
	{
		System.out.println(name+" "+colour+" coloured  car  seat belts are used for safety");
	}
	void parking()
	{
		System.out.println("car is parking ");
	}
	public Car(int range,int seats,int airbags,int tires,int cost,int mirrors,String colour,String type,String name,String brand)
	{
		
		super();
		this.range = range;
		this.seats = seats;
		this.airbags = airbags;
		this.tires = tires;
		this.cost = cost;
		this.mirrors = mirrors;
		this.colour = colour;
		this.type = type;
		this.name = name;
		this.brand = brand;
	}

}