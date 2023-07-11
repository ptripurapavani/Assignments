package practice;

public class Mobile {
	int cost;
	int storage;
	int ram;
	float camera;
	int buttons;
	String brand;
	String colour;
	String os;
	String sim;
	String sensor;
	void call()
	{
		System.out.println(brand+"calling management");
	}
	void whatsApp()
	{
		System.out.println(brand+"chating and calling management");
	}
	public Mobile(int cost,int storage,int ram,float camera,int buttons,String brand,String colour,String os,String sim,String sensor)
	{
		
		super();
		this.cost = cost;
		this.storage = storage;
		this.ram = ram;
		this.camera = camera;
		this.buttons = buttons;
		this.brand = brand;
		this.colour = colour;
		this.os = os;
		this.sim = sim;
		this.sensor = sensor;
		
		}
	

}