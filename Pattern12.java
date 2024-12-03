package com.megha.patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i)+1;j++)
			{
				if(i==1 ||j==1 ||(i+j)==(n+1))
				{
					System.out.print(i+j-1+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
