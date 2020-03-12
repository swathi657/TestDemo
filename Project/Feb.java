import java.io.*;
import java.util.*;
class Feb
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int n1=1,n2=1,n3;
      System.out.println(n1);
      System.out.println(n2);
   for(int i=0;i<n;i++)
   {
      n3=n1+n2;
      System.out.println(n3);
      n1=n2;
      n2=n3;
    }
   }
}
      