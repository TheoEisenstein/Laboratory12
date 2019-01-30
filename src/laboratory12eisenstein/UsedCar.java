package laboratory12eisenstein;



	public class UsedCar extends Car {
		
		protected double mileage;
		
		public UsedCar() {
			
		}
		
		public UsedCar(String make, String model, int year, double price, double mileage) {
			this.make = make;
			this.model = model;
			this.year = year;
			this.price = price;
			this.mileage = mileage;
		
		
	}
	
		public double getMileage() {
			return mileage;
		}

		public void setMileage(double mileage) {
			this.mileage = mileage;
		}
		
	@Override
	public String toString() {
		return "Used Car Make: "+ make + ", Model: "+ model + ", Year: " + year + ", Price: " + price + ", Mileage: " + mileage;
	}
	}