package com.megha.patterns;

public class Pattern39 {

    public static void main(String[] args) {
        int n = 5;
        
        for (int i = n; i > 0; i--) {
            char ch = 'A';
            
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            // Print the hollow pyramid pattern
            for (int k = 0; k < (2 * i - 1); k++) {
                if (k == 0 || k == 2 * i - 2 || i == n) {
                    System.out.print(ch++);
                } else {
                    System.out.print(" ");
                    ch++;
                }
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
