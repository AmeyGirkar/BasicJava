package Loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PINinDB = 1234;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your ATM PIN - ");
		int PINentered = scanner.nextInt();
		while(PINentered != PINinDB) {
		System.out.println("PIN is incorrect. Please try again");
		 PINentered  = scanner.nextInt();
		}
		System.out.println("Welcome to ABC Bank");

	}

}
