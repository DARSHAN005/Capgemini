package Assignment_Problems;

import java.util.Scanner;

public class Decreement_operator {

	public static void main(String[] args) {
		//static
		int a=10, b=20;
		a++;
		b++;
		System.out.println("post increement of a " + a);
		System.out.println("post increement of b " + b);
		
		
		++a;
		++b;
		System.out.println("pre increment of a "+ a);
		System.out.println("pre increment of b "+ b);
		System.out.println();
		
		
		//dynamic
		Scanner vd=new Scanner(System.in);
		int  c,d;
		System.out.println("enter a number ");
		c=vd.nextInt();
		c++;
		System.out.println("post increement "+ c);
		System.out.println("enter another number");
		d=vd.nextInt();
		d++;
		System.out.println("post increement "+ d);
		
		

	}
}
