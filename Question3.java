package in.ineuron.main;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		int i = 0, j=0, k=0, c=-1;
		
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		
		if (n%2==0) {
			for (i = 1; i < n-1 ; i++) {
				System.out.print("*");
				for(j=n/2-1;j>=i;j--) {
					System.out.print("*");	
				}
				for(k=c;k>=1;k--) {
					System.out.print(" ");
				}
					
			if (i<n/2) {
				c=c+2;
			}else if (i==n/2) {
				c++;
			}			
			if(i==1) {
				for(j=i;j<n/2;j++) {
					System.out.print("*");
				}
			}else {
				for(j=i;j<=n/2;j++) {
					System.out.print("*");
				}	
			}
			System.out.print("*");
			System.out.println();
			}

			for(i=1;i<=n;i++) {			
				System.out.print("*");
			}

		}else {
			for (i = 1; i < n-1 ; i++) {
				System.out.print("*");
				for(j=n/2;j>=i;j--) {
					System.out.print("*");	
				}
					for(k=c;k>=1;k--) {
						System.out.print(" ");
					}
					
				if (i<=n/2) {
					c=c+2;
				}
				

				if(i==1) {
					for(j=i;j<n/2;j++) {
						System.out.print("*");
					}
				}else {
					for(j=i;j<=n/2;j++) {
						System.out.print("*");
					}	
				}
				System.out.print("*");
				System.out.println();
			}

			for(i=1;i<=n;i++) {			
				System.out.print("*");
			}
		}
	}

}
