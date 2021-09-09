package java_1;

import java.util.Scanner;

public class FirstAssign5 {

	public static void main(String[] args) {
		 int ctc;
		    float tax;
		    Scanner sc = new Scanner(System.in);
		    ctc = sc.nextInt();
		    if(ctc>0 && ctc<=180000){
		       tax = 0; 
		    }
		    else if(ctc>180000 && ctc <= 300000){
		        tax = (ctc*10)/100;
		    }
		    else if(ctc>300000 && ctc<=500000){
		        tax = (ctc*20)/100;
		    }
		    else{
		        tax = (ctc*30)/100;
		    }
		    System.out.println(tax);
		    
	}

}
