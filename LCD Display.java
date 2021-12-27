import java.util.Scanner;
class lcd4
{
  static void hor_dash(int n , int size , int s)
  {
   while(s>0)
   {
	if(s == size)
  	 System.out.print(" -");
	else
           System.out.print("-");
        s--;
   }
  System.out.println();
  s = size;
  }

static void vert_two_dash(int n , int size , int s)
 {
 int t = size;
 
 while(s > 0)
   {
     System.out.print("|");
     while(t > 0)
    {
      System.out.print(" "); 
      t--;                                                       
    }
   t = size;
   System.out.print("|");
   System.out.println();
   s--; 
  }
 
 }

static void vert_right_one_dash(int n , int size , int s)
 {
  s = size;
 int d = size;
 while(s > 0)
  {
   while(d > 0)
   {
     System.out.print("  ");	
     d--;
   }
   d = size;
   System.out.print("|");
   System.out.println();
   s--;
  }
 }

static void vert_left_one_dash(int n , int size , int s)
 {
  s = size;
  
 int e = size;
 while(s > 0)
  {
   System.out.print("|");
   while(e > 0)
   {
     System.out.print("  ");	
     e--;
   }
   
   System.out.println();
   s--;
  }
 }



public static void main(String args[])
{

int i = 0, j;
Scanner sc= new Scanner(System.in);   
System.out.println("How many digits are you going to enter ? : "); 
 int f = sc.nextInt();  

System.out.println("Enter size : "); 
 int size = sc.nextInt();
int s = size;

System.out.println(" Enter  digits: "); 
for(j = 0 ;j<f ;j++)
{
 int n = sc.nextInt();
 if(n== 2|| n==3 || n==5 || n==6 || n==7 || n==8 || n==9 || n==0) 
   hor_dash(n,size,s);
 
if(n==8 || n==9 || n==0 || n==4)
   vert_two_dash(n,size,s);
 
if(n== 1 || n==2 || n==3 ||  n==7 )
   vert_right_one_dash(n,size,s);
 
if(n==5 || n==6 )
   vert_left_one_dash(n,size,s);
 
if(n == 2|| n==3 || n==5 || n==6 || n==4 || n==8 || n==9)
   hor_dash(n,size,s);

if(n == 2)
  vert_left_one_dash(n,size,s);

if(n== 1 || n==5 || n==3 ||  n==7 ||  n==9 ||  n==4)
  vert_right_one_dash(n,size,s);

if( n==6 || n==8 || n==0)
  vert_two_dash(n,size,s);

if(n== 2|| n==3 || n==5 || n==6 ||  n==8 || n==9 || n==0)
  hor_dash(n,size,s);


}
}
}
