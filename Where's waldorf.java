import java.util.*;
import java.io.IOException;
class w
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter word: ");
String word = sc.nextLine(); 

word = word.toLowerCase();


char ch = word.charAt(0);
int n = word.length();


System.out.println("No. of rows :");
int row = sc.nextInt();
System.out.println("No. of columns :");
int col = sc.nextInt();
int i , j;
char g[][] = new char[row][col];
  for(i = 0 ; i < row ; i++)
  {
   for(j = 0 ; j < col ; j++)
   {
     g[i][j] = sc.next().charAt(0);
     g[i][j] = Character.toLowerCase(g[i][j]);
   }
 }

   for(i = 0 ; i < row ; i++)
  {
   for(j = 0 ; j < col ; j++)
   {
     if(g[i][j] == ch)
        {
           if(col - j >= n)
           {
              if(rightrow(i,j,word,row,col,g,n) == 1)
                 break;
           } 
            if(j + 1 >= n)
           {
              if(leftrow(i,j,word,row,col,g,n)== 1)
                 break;
           } 
           if(row - i >= n)
           {
              if(downcol(i,j,word,row,col,g,n)== 1)
                 break;
           }   
           if(i+1 >= n)
           {
              if(upcol(i,j,word,row,col,g,n)== 1)
                 break;
           } 
           if((i + 1 >= n) && (col - j >= n))
           {
              if(rightupdi(i,j,word,row,col,g,n)== 1)
                 break;
           }
           if((row - i >= n) && (col - j >= n))
           {
              if(rightdowndi(i,j,word,row,col,g,n)== 1)
                 break;
           } 
           if((row - i >= n) && (j + 1 >= n))
           {
              if(leftdowndi(i,j,word,row,col,g,n)== 1)
                 break;
           } 
           if((i + 1 >= n) && (j + 1 >= n))
           {
              if(leftupdi(i,j,word,row,col,g,n)== 1)
                 break;
           }  
            
         }

    
   }
  
  }

 
}
 
static int rightrow(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = 0 , b = j , c = 2;
    for(a = 0 ; a < n ; a++ )
    {
       if(word.charAt(a) == g[i][b])
       {
         c = 1; 
         b++;
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
     if(c == 1)
      {
          i++;
          j++; 
          System.out.println(i+" "+j);
          return i;
      }  
     else
          return 0;
   }     	



static int leftrow(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = 0 , b = j , c = 2;
    for(a = 0 ; a < n ; a++)
    {
       if(word.charAt(a) == g[i][b])
       {
         c = 1; 
         b--;
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
     if(c == 1)
      {
          i++;
          j++;
          System.out.println(i+" "+j);
          return i;
      }  
     else
          return 0;
   } 

static int downcol(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = 0 , b = i , c = 2;
    for(a = 0 ; a < n ; a++)
    {
       if(word.charAt(a) == g[b][j])
       {
         c = 1; 
         b++;
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
     if(c == 1)
      {
          i++;
          j++;
          System.out.println(i+" "+j);
          return i;
      }  
     else
          return 0;
   }     	
    	
static int upcol(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = 0 , b = i , c = 2;
    for(a = 0 ; a < n ; a++)
    {
       if(word.charAt(a) == g[b][j])
       {
         c = 1;
         b--; 
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
     if(c == 1)
      {
          i++;
          j++;
          System.out.println(i+" "+j);  
          return i;
      }  
     else
          return 0;
   } 

static int rightupdi(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = i , b = j , c = 2 , d = 0;
   for(d = 0 ; d < n ; d++)
    {
    
       if(word.charAt(d) == g[a][b])
       {
         c = 1;
         b++;
         a--; 
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
  
     if(c == 1)
      {
          i++;
          j++;		
          System.out.println(i+" "+j);  
          return i;
      }  
     else
          return 0;
   }     	
    	
static int rightdowndi(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = i , b = j , c = 2 , d = 0;
   for(d = 0 ; d < n ; d++)
    {
    
       if(word.charAt(d) == g[a][b])
       {
         c = 1;
         a++;
         b++; 
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
  
     if(c == 1)
      {
          i++;
          j++;  
          System.out.println(i+" "+j); 
          return i;
      }  
     else
          return 0;
   }     	

static int leftdowndi(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = i , b = j , c = 2 , d = 0;
   for(d = 0 ; d < n ; d++)
    {
    
       if(word.charAt(d) == g[a][b])
       {
         c = 1;
         a++;
         b--; 
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
  
     if(c == 1)
      {
          i++;
          j++;
          System.out.println(i+" "+j); 
          return i;
      }  
     else
          return 0;
   }     	

static int leftupdi(int i , int j , String word , int row ,int col, char g[][], int n)
  {
    int a = i , b = j , c = 2 , d = 0;
   for(d = 0 ; d < n ; d++)
    {
    
       if(word.charAt(d) == g[a][b])
       {
         c = 1;
         a--;
         b--; 
         continue;
       }
       else
       {
          c = 0;
          break; 
       }
    }
   
     if(c == 1)
      {
          i++;
          j++; 
          System.out.println(i+" "+j);
          return i;
      }  
     else
          return 0;
   }     	
}
