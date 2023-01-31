package in.ineuron.main;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		int i = 0, j=0, k=0, c=0;
		
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		
		c=n;
		for (i = 1; i <= n ; i++) {
				if (i==n) {
					for (j = 1;j <i; j++) {
						System.out.print("*");
					}
					for (k = c;k>i; k--) {
						System.out.print(" ");
					}
					c--;
					for (k = c;k>i; k--) {
						System.out.print(" ");
					}
					for (j = 1;j <i; j++) {
						System.out.print("*");
					}
				}else {
					for (j = 1;j <=i; j++) {
						System.out.print("*");
					}
					
					for (k = c;k>j; k--) {
						System.out.print(" ");
					}
					//c--;
					for (k = c;k>j; k--) {
						System.out.print(" ");
					}
					for (j = 1;j <=i; j++) {
						System.out.print("*");
					}
				}
				
				
			System.out.println();
		}
	}

}
