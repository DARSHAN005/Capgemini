package Assignment_Problems;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner vd=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=vd.nextInt();
		if(year%400==0)
		{
			System.out.println(year + " is leap year");
		}
		else if(year%100==0)
		{
			System.out.println(year + " is not leap year");
		}
		else if(year%4==0)
		{
			System.out.println(year + " is leap year");
		}
		else 
			System.out.println(year+ " is not leap year");
	}

}
