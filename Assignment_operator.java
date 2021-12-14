package Assignment_Problems;

import java.util.Scanner;

public class Assignment_operator {

	public static void main(String[] args) {
		//static
		int a=32, b=42;
		System.out.println("Test case 1 ");
		a+=32;
		System.out.println(a);
		a-=32;
		System.out.println(a);
		a*=32;
		System.out.println(a);
		a/=32;
		System.out.println(a);
		a%=32;
		System.out.println(a);
		
		System.out.println();
		System.out.println("Test case 2");
		b+=21;
		System.out.println(b);
		b-=98;
		System.out.println(b);
		b*=42;
		System.out.println(b);
		b/=9;
		System.out.println(b);
		b%=22;
		System.out.println(b);
		System.out.println();
	
	
	//dynamic
		Scanner vd=new Scanner(System.in);
		int c, d;
		System.out.println("enter first number ");
		c= vd.nextInt();
		c+=32;
		System.out.println(c);
		c-=32;
		System.out.println(c);
		c*=32;
		System.out.println(c);
		c/=32;
		System.out.println(c);
		c%=32;
		System.out.println(c);
		
		System.out.println();
		System.out.println("enter another number  ");
		d=vd.nextInt();
		d+=21;
		System.out.println(d); 
		d-=98;
		System.out.println(d); 
		d*=43;
		System.out.println(d); 
		d/=9;
		System.out.println(d); 
		d%=22;
		System.out.println(d); 
	}

}
