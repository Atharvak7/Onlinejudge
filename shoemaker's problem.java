import java.util.Scanner;
class s
{
	public static void main(String[] args)
	{
		int n , i , time , fine , min , j;
		double temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of  jobs : ");
		n = sc.nextInt();
		double a[] = new double[n];
		double b[] = new double[n];
		System.out.println("Enter time and fine : ");
		 for(i = 0 ; i < n ; i++)
		  {
			time = sc.nextInt();
			fine = sc.nextInt();
			a[i] = (double) time/fine;
			b[i] = a[i];
		  }
		 
          for(i = 0; i < n - 1 ;  i++) 
		  { 
	           min = i;
		       for(j = i+1 ; j < n ; j++)
			   {
                    if(a[j] < a[min]) 
					{
                        min = j;
                    }
               }
              
			    
             if(min != i) 
			 {
                   temp = a[min];
                   a[min] = a[i];
                   a[i] = temp;
               }
		  }
		  
		  for(i = 0; i < n  ;  i++) 
		  { 
		     for(j = 0; j < n  ;  j++) 
		     { 
			    if(a[i] == b[j])
				{
					b[j] = 0;
					min = j + 1;
				   System.out.println(min);
				   
				}  
			 }
		  } 
		  
		  
	   }
   }
