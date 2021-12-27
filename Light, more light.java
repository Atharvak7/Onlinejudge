import java.util.Scanner;
import java.lang.Math;
class light2
{
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   for(int i = 0 ; i < n ; i++ )
	   {
		  double num = sc.nextInt();
		  double a = Math.sqrt(num);
		  
		  
		  if((a * a) == num)
		     System.out.println("Yes");
			else
              System.out.println("No");
	   }
   }
}
