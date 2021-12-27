import java.util.Scanner;
class nap
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter no. of appointments : ");
int n =sc.nextInt();
int i , temp = 0 ;
double t[] = new double[20];
double max = 0 , b = 0;
for(i = 0 ; i < n*2 ; i=i+2)
{
    t[i] = sc.nextDouble();
    t[i+1] = sc.nextDouble();
    String str= sc.nextLine();
	 
}
t[n*2] = 18.00;

for(i = 2 ; i <= n*2 ; i=i+2)
{
	t[i] = t[i] - 1.00 + 0.60;
	t[i-1] = t[i-1] - 1.00 + 0.60;
	b = t[i] - t[i-1];
	if(b >= 0.40 )
	{
		b = b - 1.00 + 0.60;
	}	
	if(b > max)
	{
	    max = b;
		
		temp = i - 1;
	}	
}	

max = max*100;
t[temp] =  t[temp] + 1.00 - 0.60;
if(max < 60)	
{
	System.out.println(" the longest nap starts at " + t[temp] + " and will last for " +max+ " minutes ");
}
 
 else
 {
	 int d = (int)max;
	 int hr = d/60;
	 int m = d % 60;
	 System.out.println(" the longest nap starts at " + t[temp] + " and will last for " +hr+" hrs "+m+ " minutes ");
 } 
}
}
