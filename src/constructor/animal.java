package constructor;

public class animal{ 

	public animal() {
		
//constructors can not be called it is intialize automatically when the object is 
//created
//constructors do not have any type
	//name of the constructor should be same as of the class name constructor
		
	// default constructor created by java compiler
		
//no argument constructor a constructor with no arguments paramterized constructor
		
	System.out.println("Constructor from the animal class");

	}
	public animal(int legs) {
		System.out.println("The no of leg this animal have is=:"+legs);
		
	}
     public animal(int eyes, String color) {
    	 System.out.println("The eyes and color of the animal is=:"+eyes+"...."+color);
     }
     
}
