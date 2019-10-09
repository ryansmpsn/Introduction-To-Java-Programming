package chapter2;
/*
 * Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of years.
 * 
 * Created by Ryan Simpson 9/11/2018
 */

import java.util.*;

public class E2_11PopulationProjection {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double birth = 7;
		double death = 13;
		double immigrant = 45;
		double population = 312032486;
		double secondsperyear = 60 * 60 * 24 * 365;

		double births = secondsperyear / birth;
		double deaths = secondsperyear / death;
		double immigrants = secondsperyear / immigrant;
		
		System.out.println("Enter the number of years: ");
		int years = input.nextInt();
		
		for (int i = 1; i <= years; i++) {
			population += births + immigrants - deaths;
		}
		
		input.close();
		System.out.println("The population in " + years + " years is " + (int) population);
	}

}
