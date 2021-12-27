import java.util.Scanner;
class archi
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String a[] = {"1","2","4","8","16","32","64","128","256","512","1024","2048","4096","8192","16384","32768","65536","131072","262144","524288","1048576","2097152","4194304","8388608","16777216","33554432","67108864","134217728","268435456","536870912","1073741824","2147483648"};
int n = sc.nextInt();
String N = Integer.toString(n);
int j = N.length();
int temp = -1; 
for(int i = 0 ; i < 31 ; i++)
  {
     if(a[i].length() < j)
        continue;
     else
    {
     String s = a[i].substring(0,j);
     if(s.equals(N))
     {
       temp = i;
       break;
     }
    }
  }
if(temp == -1)
   System.out.println("no power of 2");
else
   System.out.println(temp);
}
}
