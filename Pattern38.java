package com.megha.patterns;
import java.util.*;

public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(ch++ +" ");
				}
			}
			else
			{
				int m=ch+i-1;
				for(int j=1;j<=i;j++)
				{
					
					System.out.print((char)m--+" ");
					ch++;
				}
			}
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		double m=3.1428698763455673045675780;
		System.out.println(m);
	}

}
