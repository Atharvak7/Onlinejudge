import java.util.Scanner;
class euclid
{
	public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp , q = 1 , r = 1 , i = 2;
		if(a < b)
		{
			temp = a;
			a = b;
			b = temp;
		}
		int[] s = new int[30];
		int[] t = new int[30];
		s[0] = 1;
		s[1] = 0;
		t[0] = 0;
		t[1] = 1;
		while(a % b != 0)
		{
			q = a / b ;
			r = a % b ;
			s[i] = s[i-2] - q*s[i-1];
			t[i] = t[i-2] - q*t[i-1];
			a = b;
			b = r;
			i++;
		}
		
		System.out.println(s[i-1] + " " + t[i-1] + " " + gcd(a,b));
		
		
		
	}
}
