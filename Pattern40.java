package com.megha.patterns;

public class Pattern40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			char ch='A';
			for(int j=0;j<(n-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				if(k==0 || k == 2*i-2)
				{
					System.out.print(ch++);
				}
				else
				{
					System.out.print(" ");
					ch++;
				}
			}
			System.out.println();
		}
		
		for (int i = n; i > 0; i--) {
            char ch = 'A';
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                if (k == 0 || k == 2 * i - 2 ) {
                    System.out.print(ch++);
                } else {
                    System.out.print(" ");
                    ch++;
                }
            }         
            System.out.println();
		}

	}

}
