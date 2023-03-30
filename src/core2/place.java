package core2;

import java.util.Scanner;

public class place {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the place1:=");
		String place1 = sc.next();
		
		System.out.println("enter the place2:=");
		String place2 = sc.next();
		
		if(place1.equals("sector20") && place2.equals("sector23"))
		    {
		      System.out.println("you are in noida");
		      }else {
		    	  
			System.out.println("yor are not");
		}
		
		sc.close();

	}

}
