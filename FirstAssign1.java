package java_1;

import java.util.Scanner;
public class FirstAssign1 {

	public static void main(String[] args) {
		

		

		
				
				     Scanner sc = new Scanner (System.in);
						int n = sc.nextInt();
						int temp = n;
						int digitsCount = 0;
						int sum = 0;
						
						while(temp!=0) {
							temp = temp/10;  
							digitsCount++;
						}
						
						temp = n;
						
						while(temp!=0) {
							sum += Math.pow(temp%10, digitsCount);
							temp = temp/10;
						}
						
						if(n==sum) {
							System.out.println("Amstrong number.");
							
						}
						else {
							System.out.println("Not an Amstrong number.");
						}
						
					
				
				
			}

		

	}


