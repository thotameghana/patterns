package com.megha.patterns;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//int ch=65;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
		String s1="Tap";
		String s2="Acad";
		System.out.println(s1.charAt(0)>s2.charAt(0));

	}

}
