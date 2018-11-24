package garage;

public class Car extends Vehicle {

	private double gasTankCapacity;
	private double milesPerTank;
	
	public Car(String vType, String vMake, String vModel, String vColour, int year, int vPrice, int vSpeed, double capacity, double mph)
	{
		super(vType, vMake, vModel, vColour, year, vPrice, vSpeed);
		this.gasTankCapacity = capacity;
		this.milesPerTank = mph;
	}
		
	public double getMileage()
	{
		return milesPerTank/gasTankCapacity;
	}
		
}
