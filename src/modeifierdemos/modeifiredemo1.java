package modeifierdemos;

public class modeifiredemo1 {
//globally accessible
	public void method() {
		System.out.println("public method");
		

	}
//can be accessed in the class only
	private void method1() {
		System.out.println("Private method");
	}
	//you can access in the same package,if you want to access outside the package
	//you need to inherit the class
	protected void method2() {
		System.out.println("protected method2");
		
	}
	//it can be accessed in the package only
	void method3() {
		System.out.println("Deafult method");
		
	}
	public static void main(String[] args) {
		modeifiredemo1 mm = new modeifiredemo1();
		mm.method();
		mm.method1();
		mm.method2();
		mm.method3();
	}
}


