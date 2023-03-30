package exceptiondemo;

public class mainclass2 {

	public static void main(String[] args) throws Exception {
	
voting vv = new voting();
try {
	vv.vote();

}catch (Exception e) {
	e.printStackTrace();
}
vv.vote();

	}

}
