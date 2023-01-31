package in.ineuron.main;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		int i =0,j=0;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc .nextInt();
		for (i = 1; i <= n ; i++) {
			for (j = 1;j <=n; j++) {
				System.out.print(i);	
			}
			System.out.println();
		}

	}

}
