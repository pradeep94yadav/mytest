package core3;

import java.util.Scanner;

public class continoussum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to get all sum");
		int num = sc.nextInt();
	int sum =1;
		for(int i = 1; i<=num; i++){
			System.out.println(i);
			sum = sum+i;
			
		}
		System.out.println("the sum of the numbers is:"+sum);
	   sc.close(); 
	
		
		

	}

}
