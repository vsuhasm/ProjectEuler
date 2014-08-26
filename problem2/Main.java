/*Project Euler Problem 2 : Even fibonacci numbers
Author : Venkata Suhas Maringanti
Date : 8/26/2014
*/

public class Main{
	static int target = 4000000;
	static int cache[] = new int[target];
	public static void main(String args[]){
		int i = 0;
		int j = 1;
		int sum = 0;
		while(i<=target){
			i = fibonacci(j);
				if(i%2==0)
					sum += i;
			j++;
		}
		System.out.println("The sum of even valued fibonacci numbers less than 4 million is : " + sum);
	}
	public static int fibonacci(int n){
		if(cache[n-1]==0){
			if(n == 1 || n == 2){
				cache[n-1] = n;
				return n;
			}
			else
				cache[n-1] = fibonacci(n-1) + fibonacci(n-2);
		}
		return cache[n-1];
	}
}				
		

	
