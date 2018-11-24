package garage;

public abstract class Vehicle {

	protected String type;
	protected String make;
	protected String model; 
	protected String colour;
	protected int yearMake;
	protected int price;
	protected int speed;
	
	////Constructors//////////
	public Vehicle(String vColour,String vType, String vMake, String vModel, int year, int vPrice, int vSpeed)
	{
		this.type = vType;
		this.make = vMake;
		this.model = vModel;
		this.colour = vColour;
		this.yearMake = year;
		this.price = vPrice;
		this.speed = vSpeed;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public String getColour()
	{
		return this.colour;
	}
	
	public int getYearMake()
	{
		return this.yearMake;
	}
	
	public abstract double getMileage();
		
}
