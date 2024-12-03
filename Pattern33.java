package com.megha.patterns;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=2;k<i;k++)
			{
				System.out.print("*");
			}
			for(int k=2;k<i;k++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=2;k<i;k++)
			{
				System.out.print("*");
			}
			for(int k=2;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(n-i)+1;k++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=(n-i)+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
