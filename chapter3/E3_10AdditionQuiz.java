package chapter3;
/*
 * Write a program to randomly generate an addition question
 * with two integers less than 100.
 *
 *Created by Ryan Simpson 9/18/2019
 */

import java.util.*;

public class E3_10AdditionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		// 3. Prompt the student to answer ”What is number1 + number2?”
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		input.close();

		// 4. Grade the answer and display the result
		if (number1 + number2 == answer)
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " should be " + (number1 + number2));
		}
	}

}
