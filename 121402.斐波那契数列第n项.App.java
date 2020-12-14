package pbc;

import java.math.BigInteger;
import java.util.*;

public class App {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	 
    int n=51;
    BigInteger[] fib=new BigInteger[n];
    fib[1]=BigInteger.valueOf(1);
    fib[2]=BigInteger.valueOf(1);
    int i,j;

    for(i=3;i<n;i++)
    {
       
        fib[i]=fib[i-1].add(fib[i-2]);
    }


    int m;
    while(cin.hasNext())
    {
        m=cin.nextInt();
        System.out.println(fib[m]);

    }
	
}
}
