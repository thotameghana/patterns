package com.megha.patterns;

public class Pattern5 {
	public static void main(String args[])
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
	}
}
