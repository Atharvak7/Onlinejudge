import java.util.Scanner;
class flapjack
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int i , loc = 0 , j = 0 ;
System.out.println("Enter no.of elements : ");
int n = sc.nextInt();
int a[] = new int[n];
int l = n;
for(i = n - 1 ; i >= 0 ; i--)
{
  a[i] = sc.nextInt();
}

while(loc < n)
{
   for(j = 0 ; j < n ; j++)
   {
         if(a[j] == l)
        {
           i = j;
           break;
         
       } 
   }
 
if(i == loc)
         {
           loc++;
           l--;
           continue;    
         } 
      
 if((i == n - 1) && (loc > 0))
    flip(a , loc , n);
 else if(i == n - 1)
    flip(a , 0 , n);
 else
  {
     flip(a , i , n);
     flip(a , loc , n);
  }
 
loc++;
l--;
      
}
System.out.println("0");

}

static void flip(int a[] , int pos , int n)
{
 
 int q[] = new int[n]; 
 int top = n -1 ,c = 0;
 while(top >= pos)
 {
  q[c] = a[top];
  c++;
  top--;
 } 
top = pos;
c = 0;
 while(top < n)
 {
   a[top] = q[c];
   top++;
   c++;
 }

pos = pos + 1;
System.out.println(pos);

}
}  
