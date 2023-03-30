package core2;

import java.util.Scanner;

public class Scannerdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the num1:=");
		int a = sc.nextInt();
		
		System.out.println("enter the num2:=");
		int b = sc.nextInt();
		
		int sum = a+b;
		System.out.println("The sum of the two numbers is=:"+sum);
		sc.close();
		
	}
}
		
		

	
