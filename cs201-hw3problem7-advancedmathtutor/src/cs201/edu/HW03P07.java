package cs201.edu;

/*
Bryce DeBilzan
HOMEWORK 3 PROBLEM 7- "Advanced Math Tutor"
Presents menu to user and asks them what kind of problem they want to solve.
The first option generates two random values between 0 and 100, and asks user for the sum of the two
numbers. Displays whether or not the user got the question correct.
The second option generates two random values between 0 and 100, and asks user for the difference
of the two numbers. Displays whether or not the user got the question correct. 
NOTE: program is able to allow for subtraction problems which result in negative differences.
The third option generates two random values between 0 and 100, and asks user for the product of the
two numbers. Displays whether or not the user got the question correct.
The fourth option generates two random values between 0 and 100, and then randomly chooses which
math operation (addition, subtraction, or multiplication) to perform on those two numbers.
*/

import java.util.Scanner;
import java.util.Random;

public class HW03P07{
	public static void main(String[] args) {	      
		//Creates Scanner
		Scanner input = new Scanner(System.in);
	   
		//Generates first random number between 0 and 100
		Random rand1 = new Random();
		int number1 = rand1.nextInt(100) + 0;
		
		//Generates second random number between 0 and 100
		Random rand2 = new Random();
		int number2 = rand2.nextInt(100) + 0;
		
		//Generates third random number between 1 and 3
		Random rand3 = new Random();
		int number3 = rand2.nextInt(3) + 1;
		
		//Displays menu and records users choice
		System.out.println("Math Tutor Menu");
		System.out.println("1. Addition Problem");
		System.out.println("2. Subtraction Problem");
		System.out.println("3. Multiplication Problem");
		System.out.println("4. Random Problem");
		System.out.println("Enter your choice:");
		int choice = input.nextInt();
		
		//Addition problem
		if (choice == 1)
		{
			//Prompt the user to answer the addition question
			System.out.print("What is " + number1 + " + " + number2 + "? ");

			//Get the answer from the user
			int answer = input.nextInt();

			boolean isCorrect = (number1 + number2 == answer);
      		System.out.println("isCorrect is: " + isCorrect);
		
			//Display the results
			System.out.println(
			number1 + " + " + number2 + " = " + answer + " is " +  isCorrect);
		}
		
		//Subtraction problem
		else if (choice == 2)
		{
			//Prompt the user to answer the subtraction question
			System.out.print("What is " + number1 + " - " + number2 + "? ");

			//Get the answer from the user
			int answer = input.nextInt();

			boolean isCorrect = (number1 - number2 == answer);
      		System.out.println("isCorrect is: " + isCorrect);
		
			//Display the results
			System.out.println(
			number1 + " - " + number2 + " = " + answer + " is " +  isCorrect);
		}
		
		//Multiplication problem
		else if (choice == 3)
		{
			//Prompt the user to answer the multiplication question
			System.out.print("What is " + number1 + " * " + number2 + "? ");

			//Get the answer from the user
			int answer = input.nextInt();

			boolean isCorrect = (number1 * number2 == answer);
      		System.out.println("isCorrect is: " + isCorrect);
		
			//Display the results
			System.out.println(
			number1 + " * " + number2 + " = " + answer + " is " +  isCorrect);
		}
		
		//Random problem
		else if (choice == 4)
		{
			//Addition problem
			if (number3 == 1)
				{
					//Prompt the user to answer the addition question
					System.out.print("What is " + number1 + " + " + number2 + "? ");

					//Get the answer from the user
					int answer = input.nextInt();

					boolean isCorrect = (number1 + number2 == answer);
      				System.out.println("isCorrect is: " + isCorrect);
		
					//Display the results
					System.out.println(
					number1 + " + " + number2 + " = " + answer + " is " +  isCorrect);
				}
				
			//Subtraction problem
			else if (number3 == 2)
				{
					//Prompt the user to answer the subtraction question
					System.out.print("What is " + number1 + " - " + number2 + "? ");

					//Get the answer from the user
					int answer = input.nextInt();

					boolean isCorrect = (number1 - number2 == answer);
      				System.out.println("isCorrect is: " + isCorrect);
		
					//Display the results
					System.out.println(
					number1 + " - " + number2 + " = " + answer + " is " +  isCorrect);
				}
				
			//Multiplication problem
			else if (number3 == 3)
				{
					//Prompt the user to answer the multiplication question
					System.out.print("What is " + number1 + " * " + number2 + "? ");

					//Get the answer from the user
					int answer = input.nextInt();

					boolean isCorrect = (number1 * number2 == answer);
      				System.out.println("isCorrect is: " + isCorrect);
		
					//Display the results
					System.out.println(
					number1 + " * " + number2 + " = " + answer + " is " +  isCorrect);
				}
		}
	}
}
