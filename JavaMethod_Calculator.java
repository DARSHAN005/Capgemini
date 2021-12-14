package Assignment_Problems;

import java.util.Scanner;

public class JavaMethod_Calculator {

	public static void main(String[] args) {
		Scanner vd=new Scanner(System.in);
		char choice;
		System.out.println("choose any one operation '1' for addition, '2'for subtraction '3' for multiplication '4'for division ");
		choice=vd.
		if(choice== '+')
		{
			addition();
		}
		if(choice== 2)
		{
		 subtraction();
		}
		if(choice== 3)
		{
			multiplication();
		}
		if(choice== 4)
		{
			division();
		}
	}
	 	public static void addition() {
	 		int num1, num2, res;
	 		System.out.println("addition");
	 		System.out.println("enter the fist num: ");
	 		Scanner vd=new Scanner(System.in);
	 		num1=vd.nextInt();
	 		System.out.println("enter the second num: ");
	 		num2=vd.nextInt();
	 		res=num1+num2;
	 		System.out.println(res);
		
	}
	 	public static void subtraction() {
	 		int num1, num2, res;
	 		System.out.println("subtraction");
	 		System.out.println("enter the fist num: ");
	 		Scanner vd=new Scanner(System.in);
	 		num1=vd.nextInt();
	 		System.out.println("enter the second num: ");
	 		num2=vd.nextInt();
	 		res=num1-num2;
	 		System.out.println(res);
	 	}
	 	public static void multiplication() {
	 		int num1, num2, res;
	 		System.out.println("multiplication");
	 		System.out.println("enter the fist num: ");
	 		Scanner vd=new Scanner(System.in);
	 		num1=vd.nextInt();
	 		System.out.println("enter the second num: ");
	 		num2=vd.nextInt();
	 		res=num1*num2;
	 		System.out.println(res);
	 	}
	 	public static void division() {
	 		int num1, num2, res;
	 		System.out.println("dividion");
	 		System.out.println("enter the fist num: ");
	 		Scanner vd=new Scanner(System.in);
	 		num1=vd.nextInt();
	 		System.out.println("enter the second num: ");
	 		num2=vd.nextInt();
	 		res=num1/num2;
	 		System.out.println(res);
	 	}
}
