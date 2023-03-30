package core3;

import java.util.Scanner;

public class area {
	
	Scanner sc = new Scanner(System.in);
		 public void rectanglearea() {
			 System.out.println(" length=");
			 int length= sc.nextInt();
			 
			 System.out.println("bredth=");
			 int bredth=sc.nextInt();
			 
			 int rectanglearea= length*bredth;
			 System.out.println("area of rectangle is:="+rectanglearea);
			 
			 }
		 public void circle(int r) {
			 double circle =3.14*r*r;
			 System.out.println("area of the circle is:"+circle);
			 
		 }
		 public void cylinder(int r,int h) {
			 double cylinder=3.14*r*r*h;
			 System.out.println("volume of cylinder is:"+cylinder);
		 }

}
