package studio1;

import java.util.Scanner;

public class Average {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the first of two values to be averaged?");
		int n1 = scan.nextInt();
		System.out.println("What is the second of two values to be averaged?");
		int n2 = scan.nextInt();
		
		double avg = ((n1+n2)/2.0);
		System.out.println("The average of " + n1 + " and " + n2 + " is " + avg + ".");
		
	}

}