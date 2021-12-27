import java.util.Scanner;
import java.lang.*;
class carm
{
	static int z = 2;
    public static boolean isPrime(int n)
    {
	   if (n == 0 || n == 1) 
	     return false;
	   if (n == z)
		return true;
	   if (n % z == 0) 
	    return false;
	z++;
	return isPrime(n);
    }
	
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int primes[] = {2 ,3 ,5 ,7 ,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67, 71, 73, 79, 83, 89, 97};
		if((n % 2 == 0) || (isPrime(n) == true))
		  System.out.println(n + " is normal");
		else
		{
			int c = 0 , i = 0 , temp = n; 
			while((c <= 3) && (i < 25))
			{
				if(n % primes[i] == 0)
				{
					n = n / primes[i];
					c++;
				}
				i++;
			}
			if(c == 3)
			  System.out.println(temp + " is carmicheal");
		}		
		
		
		
	}
}
