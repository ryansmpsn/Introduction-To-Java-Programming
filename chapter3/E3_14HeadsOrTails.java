package chapter3;
/*
 * Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails.
 * 
 * Created by Ryan Simpson 9/19/2019
 */

import java.util.*;

public class E3_14HeadsOrTails {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Heads or Tails? \nEnter 0 for heads 1 for tails: ");
		int choice = input.nextInt();
		
		int coin = (int) (Math.random() * 2.0);
		
		if (coin == choice) {
			System.out.print("You guessed correct it landed on ");
			switch (choice) {
			case 0:
				System.out.print("heads."); break;
			case 1:
				System.out.print("tails."); break;
			}
		}
		else if (coin == 0)
			System.out.println("Your guessed wrong. \nThe coin landed on heads.");
		else if (coin == 1)
			System.out.println("Your guessed wrong. \nThe coin landed on tails.");
		
		input.close();
	}
}