package com.megha.patterns;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int count = i*(i+1)/2;
			for(int j=1;j<=i;j++)
			{
				if(count-j+1<=9)
				{
					System.out.print("0");
				}
				System.out.print(count-j+1+" ");
				if(i!=j)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
