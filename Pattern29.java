package com.megha.patterns;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		int count=1;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				if(count<=9)
//				{
//					System.out.print("0");
//				}
//				System.out.print(count+++" ");
//			}
//			System.out.println();
//		}
		String s1="MEGHAnA";
		String s2="Meghana";
		int m=s1.compareToIgnoreCase(s2);
		if(m==0)
		{
			System.out.println("Strings are equal");
		}
		else if(m>0)
		{
			System.out.println("s1>s2");
		}
		else {
			System.out.println("s2>s1");
		}
		char[] ch= {'a','b','c'};
		
		System.out.println(ch);
	}

}
