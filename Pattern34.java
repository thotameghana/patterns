package com.megha.patterns;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			char ch='A';
			for(int k=1;k<=i;k++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}

	}

}
