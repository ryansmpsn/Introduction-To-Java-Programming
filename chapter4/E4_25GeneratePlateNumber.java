package chapter4;

/*
 * Write a program to generate a plate number.
 * 
 * Created by Ryan Simpson 9/25/2019
 */

public class E4_25GeneratePlateNumber {
	public static void main(String[] args) {

		char ch1 = (char) (Math.random() * 26 + 'A');
		char ch2 = (char) (Math.random() * 26 + 'A');
		char ch3 = (char) (Math.random() * 26 + 'A');

		int n1 = (int) (Math.random() * 10);
		int n2 = (int) (Math.random() * 10);
		int n3 = (int) (Math.random() * 10);
		int n4 = (int) (Math.random() * 10);

		System.out.println("Your plate number is: " + ch1 + ch2 + ch3 + n1 + n2 + n3 + n4);
	}
}