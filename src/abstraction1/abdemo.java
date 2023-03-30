package abstraction1;

public class abdemo {

	public static void main(String[] args) {
		customer1 cc = new customer1();
		cc.rem();
		cc.rom();
		cc.processor();
		
System.out.println("..............................");

	

    customer2 pd = new customer2();
    pd.rem();
    pd.rom();
    pd.processor();
System.out.println("..............................");
		bikecustomer1 dd = new bikecustomer1();
		dd.gear();
		dd.breaking();
		dd.clutch();
	}
}