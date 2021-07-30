import java.util.*;
import java.lang.*;
import java.io.*;
class Primenumber01
{
            static int N=500000;
            public static int prime[]=new int[N];
            public static int arr[]=new int[N];
            public static void sieve()
            {
                for(int i=0;i<N;i++)
                {
                   prime[i]=1;
                }
                 prime[0]=0;
                 prime[1]=0;
                 for(int i=2;i*i<N;i++)
                {
                      if(prime[i]==1)
                      {
                         for(int j=i*i;j<N;j+=i)
                         {
                             prime[j]=0;
                         }
                      }
                }
         }
public static void main(String args[]) throws java.lang.Exception
{       
                sieve();  
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter n valve ");
                int t=sc.nextInt();
                for(int j=0;j<t;j++)
                {
                       int n=sc.nextInt();
                       if(prime[n]==1)
                       {
                                System.out.println("yes");
                       }  
                              else
                                System.out.println("no");
                }
}
}


Output______________________________________________________________________________
Enter t valve
3
17
yes
25
no
37
yes
