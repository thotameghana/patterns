package com.megha.patterns;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			char ch='A';
			for(int j=0;j<(n-i);j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}

	}

}