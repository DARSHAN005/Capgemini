package Assignment_Problems;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner vd=new Scanner(System.in);
			System.out.println("Enter the first num");
			num1=vd.nextInt();
			System.out.println("Enter the second num");
			num2=vd.nextInt();
			System.out.println("Enter the third num");
			num3=vd.nextInt();
			if(num1>num2 && num1>num3)
			{
				System.out.println("first num is larger");
			}
			else if(num2>num1 && num2>num3)
			{
				System.out.println("Second number is larger");
			}
			else if(num3>num1 && num3>num2)
			{
				System.out.println("Third number is larger");
			}
	}

}
