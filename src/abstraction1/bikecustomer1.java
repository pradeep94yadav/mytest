package abstraction1;

public class bikecustomer1 implements Bike {
	public void gear() {
		System.out.println("Gear is 5");
	}

	@Override
	public void breaking() {
		System.out.println("Disc break");
		
	}

	@Override
	public void clutch() {
       System.out.println("Smooth clutch");
		
	}
	
}
