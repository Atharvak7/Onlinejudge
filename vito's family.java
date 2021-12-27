import java.util.Scanner;
import java.lang.Math;
class vito
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    int i , min = 30000 ,temp = 0 , dist = 0 , j;
    for(i = 0 ; i < n ; i++)
    {
      a[i] = sc.nextInt();
    }
    for(i = 0 ; i < n ; i++)
    {
       temp = a[i];
       for(j = 0 ; j < n ; j++)
      {
       dist = dist + Math.abs(a[j] - temp);
      }
      if(dist <= min)
         min = dist;
      dist = 0; 
    }
   System.out.println(min);
}
}
