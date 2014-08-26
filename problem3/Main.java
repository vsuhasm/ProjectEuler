/*Project euler Problem 3 : Largest prime factor
Author Venkata Suhas Maringanti
Date : 8/26/2014
*/

public class Main{

	static long target = 600851475143L;
	//static long cache[] = new long[6008514751143];
	public static void main(String args[]){
		long l = 0;
		if(isPrime(target))
			 l = target;
		else{
			for(long i = 2; i*i<target; i++)
				if(target%i == 0)   //in order to find factors we only need to check until sqrt(n).
					if(isPrime(i))
						if(l<i)
							l = i;
		}
		System.out.println("The largest prime factor of " + target + " is : " + l);	
	}
	public static boolean isPrime(long n){
		//if(cache[n-1]==0){
			for(int i = 2; i<n; i++){
				if(n%i == 0){
					//cache[n-1] = -1;
					return false;
				}
			}
			//cache[n-1] = 1;
		//}
		//if(cache[n-1] == -1)
			//return false;
		//else
			return true;
	}
}		
