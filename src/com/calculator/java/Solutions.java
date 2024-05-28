package com.calculator.java;

import java.util.Scanner;
public class Solutions {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//upcasting
		Calculator calculator = new CalculatorImpl();
		
		//Infinite loop
		while(true) {
			//This kind of program is called as Menu Driven Program
			System.out.println(" 1: Addition \n 2: Substration \n 3: Multiplication \n 4: Division \n 5: Exit");
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			
			//Local variables does not have default values, so initializing to 0.
			int x = 0;
			int y = 0;
			
			//Accepting x & y only when the choice is 1,2,3,4
			if(choice>=1 && choice<=4) {
				System.out.println("Enter the first number: ");
				x = scanner.nextInt();
				System.out.println("Enter the second number: ");
				y = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println("Sum of "+x+" & "+y+" is "+calculator.add(x, y));
				break;
			
			case 2:
				System.out.println("Sub of "+x+" & "+y+" is "+calculator.sub(x, y));
				break;
				
			case 3:
				System.out.println("Mul of "+x+" & "+y+" is "+calculator.mul(x, y));
				break;
				
			case 4:
				System.out.println("Div of "+x+" & "+y+" is "+calculator.div(x, y));
				break;
				
			case 5:
				System.exit(0);

			default:
				System.out.println("Invalid choice");
			}
			System.out.println("==================================");
		}
	}
}
