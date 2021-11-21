package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		try {
		System.out.println("Please enter a number: ");
		int num1 = k.nextInt();
		System.out.println("Please enter another number: ");
		int num2 = k.nextInt();
		System.out.println("Result of division = " + (num1/num2));
		}
		
		catch(ArithmeticException e) {
			System.out.println("please do not enter zero in denominator");
			}

		catch(InputMismatchException e) {
			System.out.println("Please enter only integer input");
			}

		catch(Exception e) {
			System.out.println("Please enter a valid input");
		}
		
		finally {
			System.out.println("Today is monday");
		}
		

		}
	
}
