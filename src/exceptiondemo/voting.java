package exceptiondemo;

import java.util.Scanner;

public class voting {
 static Scanner sc = new Scanner(System.in);
	public static void vote() throws Exception {
		System.out.println("please enter your age ");
  int age = sc.nextInt();
  if(age<18) {
	  throw new Exception("you are not eligibile to vote");
	  
  }
  else {
	  System.out.println("you can vote");
  }
	
		
	}
	
		
	}


