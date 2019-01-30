package laboratory12eisenstein;

public class Car {

	protected String make;
	protected String model;
	protected int year;
	protected double price;
	
	//Build specification B, no-arguments constructor.
	public Car() {
		super();
	}
	
	//Build specification C, constructor with four arguments.
	
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		
	}
	
	//Getters and Setters for the four fields above. 
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Car Make: "+ make + ", Model: "+ model + ", Year: " + year + ", Price: " + price;
	}
	
}

