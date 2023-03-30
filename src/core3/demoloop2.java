package core3;

import java.util.Scanner;

public class demoloop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number whitch you want to get factorial");
		
		int num = sc.nextInt();
		
		long fact = 1;
		
		for(int i=1; i<=num; i++) {
			
			System.out.println(i);
			
			fact= fact*i;
			}
		System.out.println("factorial of the number is =:"+fact);
		sc.close();
		}

}
