package com.megha.patterns;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<(n-i);k++)
			{
				System.out.print((n-i)+" ");
			}
			System.out.println();
		}

	}

}
