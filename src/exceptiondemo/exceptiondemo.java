package exceptiondemo;

import java.util.Scanner;

public class exceptiondemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your number1=:");
		int num1 = sc.nextInt();
		
		System.out.println("your number2=");
		int num2 = sc.nextInt();
		try {
		int div = num1/num2;
		System.out.println("The divison is="+div);
		}catch(Exception e) {
		

	}
System.out.println("The code terminate here");
sc.close();
}
}
