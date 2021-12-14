package Assignments;

public class AnimalObject
{
	String name;
	String Sound;
	int NoOfLegs;
	public AnimalObject(String name, String sound, int noOfLegs) {
		super();
		this.name = name;
		Sound = sound;
		NoOfLegs = noOfLegs;
	}
	void AnimalDetails()
	{
		System.out.println("Animal Name: "+name);
		System.out.println("Animal Sound: "+Sound);
		System.out.println("Animal NoOfLegs: "+NoOfLegs);
	}
	public static void main(String[] args) 
	{
		AnimalObject obj1=new AnimalObject("Dog","Bow...Bow...",4);
		AnimalObject obj2=new AnimalObject("Cat","meow...meow...",4);
		AnimalObject obj3=new AnimalObject("Snake","ssssuu...ssssuuu...",0);	
	    System.out.println("=========================");
		obj1.AnimalDetails();
		System.out.println("=========================");
	    obj2.AnimalDetails();
	    System.out.println("=========================");
	    obj3.AnimalDetails();
	    System.out.println("=========================");
	}

}
