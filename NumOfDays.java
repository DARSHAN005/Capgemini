package Assignment_Problems;

import java.util.Scanner;

public class NumOfDays {

	public static void main(String[] args) {
		Scanner vd=new Scanner(System.in);
		int month;
		System.out.println("Enter the month number");
		month=vd.nextInt();
		
		switch(month)
		{
			case 1:
				System.out.println("month name is january");
				System.out.println("Number of days=31");
				break;
			case 2:
				System.out.println("month name is feb");
				System.out.println("Number of days=28");
				break;
			case 3:
				System.out.println("month name is march");
				System.out.println("Number of days=31");
				break;
			case 4:
				System.out.println("month name is april");
				System.out.println("Number of days=30");
				break;
			case 5:
				System.out.println("month name is may");
				System.out.println("Number of days=31");
				break;
			case 6:
				System.out.println("month name is june");
				System.out.println("Number of days=30");
				break;
			case 7:
				System.out.println("month name is july");
				System.out.println("Number of days=31");
				break;
			case 8:
				System.out.println("month name is august");
				System.out.println("Number of days=31");
				break;
			case 9:
				System.out.println("month name is september");
				System.out.println("Number of days=30");
				break;
			case 10:
				System.out.println("month name is october");
				System.out.println("Number of days=31");
				break;
			case 11:
				System.out.println("month name is november");
				System.out.println("Number of days=30");
				break;
			case 12:
				System.out.println("month name is december");
				System.out.println("Number of days=31");
				break;
		
		}
	}

}
