package chapter5;
/*
 * Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line. The ASCII
 * table is shown in Appendix B. Characters are separated by exactly one space.
 * 
 * Created by Ryan Simpson 10/2/2019
 */

public class E5_15DisplayASCIITable {
	public static void main(String[] args) {
		int count = 0;

		for (int i = 33; i <= 126; i++) {
			count++;

			if (count % 10 == 0)
				System.out.println((char) i);
			else
				System.out.print((char) i + " ");
		}
	}
}