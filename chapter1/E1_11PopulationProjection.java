package chapter1;

/*
 * The U.S. Census Bureau projects population based on the
 * following assumptions:
 * - One birth every 7 seconds
 * - One death every 13 seconds
 * - One new immigrant every 45 seconds
 * Assume the current population is 312,032,486 and one year has 365 days.
 *
 * Write a program to display the population for each of the next five years.
 *
 * Created by Ryan Simpson 7/6/18
 */


public class E1_11PopulationProjection {
	public static void main (String[] args){
		
		double birth = 7;
		double death = 13;
		double immigrant = 45;
		
		double population = 312032486;
		
		double secondsperyear = 60 * 60 * 24 * 365;
		
		double births = secondsperyear / birth;
		double deaths = secondsperyear / death;
		double immigrants = secondsperyear / immigrant;
		
		for(int i = 1; i <= 5; i++) {
		population += births + immigrants - deaths;
		System.out.println("Year " + i + " = " + (int)population);
		
		}
		
	}
}
