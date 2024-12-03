package com.megha.patterns;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(j==0 || i==0 || (i+j)==(n-1))
				{
					System.out.print(i+j+1);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
