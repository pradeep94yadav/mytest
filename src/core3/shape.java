package core3;

import java.util.Scanner;

class shape {

	Scanner sc = new Scanner(System.in);
	  public void sum() {
		   
		  System.out.println("num1:");
		  int num1 = sc.nextInt();
		   System.out.println("num2:");
		   int num2 = sc.nextInt();
		    
		   int sum= num1 + num2;
		   System.out.println("the sum of number is:"+sum);
		   
	  }
        public void sub(int num1,int num2) {
        	int sub=num1-num2;
        	System.out.println("the sub of number is:"+sub);
        	
        }
	  public void multi(int num1, int num2) {
		  int multi= num1*num2;
		  System.out.println("the multi  of number is:"+multi);
	  }
	  
	}


