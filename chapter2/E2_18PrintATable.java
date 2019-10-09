package chapter2;
/*
 * Write a program that displays the following table. Cast floating-point
 * numbers into integers.
 * 
 * Created by Ryan Simpson 9/12/2018
 */
public class E2_18PrintATable {
	public static void main(String[] args) {
		double a,b;
		
		System.out.println("a     b     pow(a, b)");
		for(int i = 1; i < 6; i++) {	
			a = i;
			b = i + 1;
			
			System.out.println((int)a + "     " + (int)b + "     " + (int)Math.pow(a, b));
		}
	}
}
