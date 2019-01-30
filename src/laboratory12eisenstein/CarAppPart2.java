package laboratory12eisenstein;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAppPart2 {

	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		boolean buy = true;
		boolean run = true;
		
		
		
		
		
	
		List<Car> cars2 = new ArrayList<>();
			cars2.add( new Car("Ford","Fusion", 1999, 500));
			cars2.add( new Car("Ford","Truck", 2000, 1500));
			cars2.add( new Car("Toyota","Prius",2015, 2000));
			cars2.add( new UsedCar("Honda","CRV", 2008, 1500, 100000));
			cars2.add( new UsedCar("Honda","Accord", 2007, 1000, 200000));
			cars2.add( new UsedCar("Scion","xD", 2006, 500, 2323232));
			
		while(run=true){	
			
			for(int i = 0; i < cars2.size(); i++) {
				System.out.println((i+1) + ". " +cars2.get(i));
				
			}
			
			
			
		System.out.println("\nPlease select a car by number to view it's details: ");
		
			int input = scnr.nextInt();
		
			//Minus one to match array list ordering which starts at 0.
		System.out.println(cars2.get(input-1));
		
		System.out.println("Would you like to purchase this car? y/n or q for quit");
		String getUserChoice1 = scnr.next();
		if (getUserChoice1.equals("y")){
			cars2.remove(input-1);
		}else if(getUserChoice1.equals("n")){
			buy = false;
		}else {
			run = false;
			
		}
		
	}

}
}
