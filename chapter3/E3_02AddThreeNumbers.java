package chapter3;
/*
 * Write a program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 * 
 * Created by Ryan Simpson 9/22/2018
 */

import java.util.*;
public class E3_02AddThreeNumbers {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int random1 = (int)(System.currentTimeMillis() % 10);
		int random2 = (int)(System.currentTimeMillis() / 7 % 10);
		int random3 = (int)(System.currentTimeMillis() / 3 % 10);
		
		System.out.println("What is the sum of " + random1 + " + "
		+ random2 + " + " + random3 + "?"  );
		
		int answer =  input.nextInt();
		int total = random1 + random2 + random3;
		
		System.out.println(random1 + " + "+ random2 + " + " + 
		random3 + " = " + answer + " is " + (answer == total));
		
		input.close();
		
	}
}
