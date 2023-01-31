package in.ineuron.main;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		int i =0,j=0,k=1;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		
		for(i=1;i<=n;i++)
		{
			if (i==1 || i==n) {
				for(j=1;j<=n;j++) {
					System.out.print("*");
				}
			} else {
				if(n%2==0) {
					if (i<=n/2) {
						for(j=n/2;j>=i;j--) {
							System.out.print("*");
						}
					}else {
						k++;
						for(j=1;j<=k;j++) {
							System.out.print("*");
						}
					}
				}else {
					if (i<=n/2) {
						for(j=n/2+1;j>=i;j--) {
							System.out.print("*");
						}
					}else {
						k++;
						for(j=1;j<=k;j++) {
							System.out.print("*");
						}
					}
				}
			}
			System.out.println();
		}	

	}

}
