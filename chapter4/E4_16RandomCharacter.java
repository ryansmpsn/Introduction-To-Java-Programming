package chapter4;
/*
 * Write a program that displays a random uppercase letter using the Math.random() method.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

public class E4_16RandomCharacter {
	public static void main(String[] args) {
		char ch = (char) (Math.random() * 26 + 'A');
		System.out.println(ch);
	}
}