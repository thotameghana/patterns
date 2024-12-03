package com.megha.patterns;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(n-i);k++)
			{
				System.out.print((i+k)+" ");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-i);j++)
			{
				System.out.print(" ");
			}
			int count=n-i;
			for(int k=0;k<=i;k++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}

	}

}
