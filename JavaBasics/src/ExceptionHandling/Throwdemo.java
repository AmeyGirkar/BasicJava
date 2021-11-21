package ExceptionHandling;

import java.util.Scanner;

public class Throwdemo {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.println("Please enter day: ");
		String day = k.nextLine();
		if(day.equals("Monday")) {
		throw new NullPointerException();
		}
		else {
		System.out.println("Weekend is coming!");
		}
		}

}
