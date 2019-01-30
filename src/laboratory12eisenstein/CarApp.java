package laboratory12eisenstein;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		System.out.println("We make a list of cars now.");
		System.out.println("How many cars do you want to list?");
		
		Scanner scnr = new Scanner(System.in);
		int inputNoCars = scnr.nextInt();

		
		
		//Make initial list based on how many cars they will enter.
		
		
		List<Car> cars = new ArrayList<>(inputNoCars);
		
	
		//I seem to have a basic misunderstanding of scanner. I've tried playing around
		//with a few of the different commands, nextLine would put several prompts at the same time
		//scnr.next wouldn't catch a two word model....So I settled on this.
		
			for (int i = 0; i < inputNoCars; i++) {
			
				System.out.println("Please enter the car "+ (i+1) +" Make: ");
				
				Car carTemplate = new Car();
				
				String input1 = scnr.next();
				carTemplate.setMake(input1);
				
				System.out.println("Please enter the car "+ (i+1) + " Model: ");
				String input2 = scnr.next();
				carTemplate.setModel(input2);
				
				System.out.println("Please enter the car "+ (i+1) + " Year: ");
				int input3 = scnr.nextInt();
				carTemplate.setYear(input3);
				
				System.out.println("Please enter the car "+ (i+1) + " Price: ");
				double input4 = scnr.nextDouble();
				carTemplate.setPrice(input4);
				
				cars.add(i, carTemplate);
			}
		
		for(int y = 0; y < inputNoCars; y++) {
			System.out.println((y+1)+ " "+cars.get(y));
		}
			
			/*
		String make = scnr.nextLine();
		String model = scnr.nextLine();
		int year = scnr.nextInt();
		double price = scnr.nextDouble();
		*/
			
			}
	
	
		
	}

			
			/*
			for (int i = 0; i < 5; i++) {
				System.out.println("Please enter make of car"+ (i+1) +": ");
				String a = scnr.nextLine();
				cars.get(i).setMake(a);
				System.out.println("Please enter model of car" + (i+1) + ": ");
				String b = scnr.nextLine();
				cars.get(i).setModel(b);
				System.out.println("Please enter year of car" + (i+1) + ": ");
				int c = scnr.nextInt();
				cars.get(i).setYear(c);
				System.out.println("Please enter price of car"+ (i+1) + ": ");
				double d = scnr.nextDouble();
				cars.get(i).setPrice(d);
			*/
			
			
	
	



