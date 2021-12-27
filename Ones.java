import java.util.Scanner;
import java.lang.Math;
class ones3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			double i = 1 , p = 1;
			while(p % n != 0)
			{
				p += Math.pow(10 , i);
				i += 1;
			}
            System.out.println(i);
		}
	}
}	
