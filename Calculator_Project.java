package java_Console_Projects;

import java.util.Scanner;

public class Calculator_Project {
	 public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Console Calculator!");

	        while (true) {
	            try {
	                System.out.print("\nEnter the first number: ");
	                double num1 = Double.parseDouble(scanner.nextLine());

	                System.out.print("Enter the second number: ");
	                double num2 = Double.parseDouble(scanner.nextLine());

	                System.out.println("Choose an operation:");
	                System.out.println("1. Addition (+)");
	                System.out.println("2. Subtraction (-)");
	                System.out.println("3. Multiplication (*)");
	                System.out.println("4. Division (/)");
	                System.out.println("5. Exit");
	                System.out.print("Enter your choice (1-5): ");

	                String choice = scanner.nextLine();
	                double result;

	                switch (choice) {
	                    case "1":
	                        result = num1 + num2;
	                        System.out.println("Result: " + result);
	                        break;
	                    case "2":
	                        result = num1 - num2;
	                        System.out.println("Result: " + result);
	                        break;
	                    case "3":
	                        result = num1 * num2;
	                        System.out.println("Result: " + result);
	                        break;
	                    case "4":
	                        if (num2 == 0) {
	                            System.out.println("Error: Division by zero is not allowed.");
	                        } else {
	                            result = num1 / num2;
	                            System.out.println("Result: " + result);
	                        }
	                        break;
	                    case "5":
	                        System.out.println("Exiting the calculator. Goodbye!");
	                        scanner.close();
	                        return;
	                    default:
	                        System.out.println("Invalid choice. Please select a valid option.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input. Please enter numeric values.");
	            }
	        }
	}
}
