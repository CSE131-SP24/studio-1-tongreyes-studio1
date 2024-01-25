package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year to see whether it is a leap year.");
		int n1 = scan.nextInt();
		boolean divisible = ((n1%4 == 0)&& !(n1%100 == 0)) || (n1%400 == 0) ;
		System.out.println(n1 + " is a leap year: " + divisible);
	

	}

}
