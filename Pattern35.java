package com.megha.patterns;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}

	}

}
