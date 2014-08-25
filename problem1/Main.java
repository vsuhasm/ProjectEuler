/*
Project Euler Problem 1 : Mulitples of 3 and 5.
Author : Venkata Suhas Maringanti
Date : 8/26/2014
*/

public class Main{
	public static int sumOfMultiplesOf(int n, int i){
		int p = n/i;
		return i*(p*(p+1))/2;
	}

	public static void main(String args[]){
		int sum = 0;
		/*for(int i = 1; i<1000; i++)   //conventional method
			if(i%3 == 0 || i%5 == 0)
				sum += i;
		*/
		sum = sumOfMultiplesOf(999, 3) + sumOfMultiplesOf(999, 5) - sumOfMultiplesOf(999, 15); //faster method			
	System.out.println("The sum of all the multiples of 3 or 5 below 1000 is : " + sum);
	}
}
