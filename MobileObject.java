package Assignments;

public class MobileObject 
{
	//Declaring Variables
	String Model;
	String color;
	double price;
	//Creating Constructor
	public MobileObject(String model, String color, double price) {
		super();
		Model = model;
		this.color = color;
		this.price = price;
	}
	////Creating method
	void MobileDetails()
	{
		System.out.println("Mobile Model is: "+Model);
		System.out.println("Mobile color is: "+color);
		System.out.println("Mobile price is: "+price);
	}
	public static void main(String[] args)
	{
		MobileObject obj1=new MobileObject("Vivo","Blue",15000);
		MobileObject obj2=new MobileObject("Redmi","White",20000);
		MobileObject obj3=new MobileObject("One+","Blue",40000);
		System.out.println("=======================");
		obj1.MobileDetails();
		System.out.println("=======================");
		obj2.MobileDetails();
		System.out.println("=======================");
		obj3.MobileDetails();
		System.out.println("=======================");
		
	}

}
