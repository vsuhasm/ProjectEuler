/*Project Euler Problem 4 : Largest Palindrome Product
Author : Venkata Suhas Maringanti
Date : 8/26/2014
*/

public class Main{
	static int lo = 100;
	static int hi = 999;
	static int lar = 0;
	public static void main(String args[]){
		int a = hi;
		int b = 0;
		for(int i = hi; i>=lo; i--){
			if(i%11 == 0){     //out of the two numbers being mltiplied, atleast one must be a multiple of 11.
				a = 999;   	
				b = 1;
			}
			else{
				a = 990;
				b = 11; 			
			}
			int j = a;
			while(j>=i){
				int t = i*j;
				if(t < lar)
					break;
				if(isPalindrome(t))
					if(t > lar)
						lar = t;
				j = j - b;
			}
		
		}
		System.out.println("The largest palindrome number formed by multiplying two 3 digit numbers is : " + lar);
		
	}	
	public static boolean isPalindrome(int n){
		int reversed = 0;
		int t = n;
		while(t>0){
			int r = t%10;
			reversed = 10*reversed + r;
			t /= 10;
		}
		if(reversed == n)
			return true;
		else 
			return false;
	}
}
						
