package package1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		int num1 , num2 , num3;
		int choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1- Addition\n 2-Subtraction\n 3-Multiplication\n 4-Division\n");
		
		System.out.println("Choose any number of your choice between 1 to 4");
		choice = input.nextInt();
		
		System.out.println("Enter the first number");
		num1 = input.nextInt();
		
		System.out.println("Enter the first number");
		num2=input.nextInt();
		
		switch (choice) {
		case 1:
			num3= num1+num2;
			System.out.println("Addition of the two numbers :" + num3);
			break;
		case 2:
			num3= num1-num2;
			System.out.println("Subtraction of the two numbers :" + num3);
			break;
		case 3:
			num3= num1*num2;
			System.out.println("Multiplication of the two numbers :" + num3);
			break;
		case 4:
			num3= num1/num2;
			System.out.println("division of the two numbers :" + num3);
			break;
		    default:
		    	System.out.println("Invalid entry");
			    break;

		}
		
	}

}
