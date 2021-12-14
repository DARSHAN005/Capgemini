package Assignment_Problems;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		 Scanner vd =new Scanner(System.in);
		 
		 
		 //static
		 int num1=10, num2=20;
		 int res=num1*num2;
		 System.out.println("multiplication of two numbers " + res );
		 
		 //dynamic
		 System.out.print("enter first number ");
		 int num3=vd.nextInt();
		 System.out.println("enter second number ");
		 int num4=vd.nextInt();
		 System.out.println("Result "+ num3*num4);
	}

}


