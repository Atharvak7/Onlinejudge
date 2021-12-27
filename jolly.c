#include<stdio.h>
#include<stdlib.h>
#include<string.h>
void main()
{
int n,i;
printf("Enter no. of numbers : \n");
scanf("%d",&n);                       
int a[n];
printf("Enter numbers : \n");
for(i = 0 ; i < n ; i++)
{
   scanf("%d",&a[i]);
}
int m = abs(a[1]-a[0]);
for(i = 1 ; i <= n ; i++)
{
  
  if(abs(a[i]-a[i-1]) <= m ) 
    {
      m = abs(a[i]-a[i-1]); 
    }  
  
      
   
  else
      break;
}
if(i == n)
  printf("Jolly");
else
  printf("Not Jolly");
}