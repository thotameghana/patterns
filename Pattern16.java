package com.megha.patterns;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			int count=1;
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(j<i)
				{
					System.out.print(count+++" ");
				}
				else
				{
					System.out.print(count--+" ");
				}
			}
			System.out.println();
		}

	}

}
