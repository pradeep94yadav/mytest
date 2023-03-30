package core2;

import java.util.Scanner;

public class vote1 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("please enter your age");
	    int age = sc.nextInt();
	    if (age<18) {
	    	System.out.println("you can not vote");
	    }
	    else {
	    	System.out.println("you can vote");
	    }
	    sc.close();
	}

}
