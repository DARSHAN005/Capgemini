package Assignment_Problems;

import java.util.Scanner;

public class Cube_Rectancle {

	public static void main(String[] args) {
		Scanner vd=new Scanner(System.in);
		System.out.println("Enter the length of cube ");
		double a=vd.nextDouble();//arae of cube is 6*length*length
		System.out.println("Area of cube  = "+ 6*a*a +"sq unit");
		
		System.out.println("Enter the length of rectangle");
		double l=vd.nextDouble();
		System.out.println("Enter the breadth of rectangle");
		double b=vd.nextDouble();
		
		System.out.println("Area of rectangle  = "+ l*b +"sq unit");
		
	}

}
