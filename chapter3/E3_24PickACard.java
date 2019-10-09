package chapter3;
/*
 * Write a program that simulates picking a card from a deck
 * of 52 cards.
 * 
 * Created by Ryan Simpson 9/20/2019
 */

public class E3_24PickACard {
	public static void main(String[] args) {

		int rank = (int) (Math.random() * 13) + 1;
		int suit = (int) (Math.random() * 4) + 1;
		String rankPick = "";
		String suitPick = "";

		switch (rank) {
		case 1:
			rankPick = "Ace";
			break;
		case 2:
			rankPick = "2";
			break;
		case 3:
			rankPick = "3";
			break;
		case 4:
			rankPick = "4";
			break;
		case 5:
			rankPick = "5";
			break;
		case 6:
			rankPick = "6";
			break;
		case 7:
			rankPick = "7";
			break;
		case 8:
			rankPick = "8";
			break;
		case 9:
			rankPick = "9";
			break;
		case 10:
			rankPick = "10";
			break;
		case 11:
			rankPick = "Jack";
			break;
		case 12:
			rankPick = "Queen";
			break;
		case 13:
			rankPick = "King";
			break;
		}

		switch (suit) {
		case 1:
			suitPick = "Clubs";
			break;
		case 2:
			suitPick = "Hearts";
			break;
		case 3:
			suitPick = "Diamonds";
			break;
		case 4:
			suitPick = "Spades";
			break;
		}

		System.out.println("The card you picked is " + rankPick + " of " + suitPick + ".");
	}
}
