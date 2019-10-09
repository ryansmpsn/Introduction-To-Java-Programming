package chapter5;

/*
 * Modify Listing 5.15 to display all
 * the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
 * per line. Numbers are separated by exactly one space.
 * 
 * 
 * Created by Ryan Simpson 10/8/2019
 */
public class E5_20PrimeNumbers {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 8;
		int count = 0, number = 2;
		
		System.out.println("The first 50 prime numbers are \n");
		
		while (number <= 1000) {
			boolean isPrime = true;
			
			for (int divisor = 2; divisor <= number / 2; divisor ++){
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime){
				count++;
				
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0){
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}
			number++;
		}
	}

}
