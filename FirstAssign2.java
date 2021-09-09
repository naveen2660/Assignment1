package java_1;

import java.util.Scanner;

public class FirstAssign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100 ;
		int temp = n;
		int digitsCount = 0;
		int sum = 0;
		for(n=100;n<999;n++) {
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
			
		
		while(temp!=0) {
			temp = temp/10;
			digitsCount++;
		}
		
		temp = n;
		
		while(temp!=0) {
			sum += Math.pow(temp%10, digitsCount);
			temp = temp/10;
		}
		
		if(n<100 || n>999) {
			System.out.println("Unexpected number");
		}
		else if(n==sum) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not an Amstrong number.");
		}
		
	

		}

	}

}
