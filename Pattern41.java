package com.megha.patterns;

public class Pattern41 {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(n-i+1);k++) {
				if(k==1 || i==1 || k==n-i+1) {
					System.out.print(n-k+2-i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
