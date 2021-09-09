package java_1;

public class FirstAssign7 {

	public static void main(String[] args) {
		  int[] arr = {5,12,14,6,78,19,1,28,26,35,37,7,52,55,47};
		    int s = 19,t=0;
		    for(int i=0;i<15;i++){
		        if(arr[i]==s){
		            t=1;
		        }
		    }
		    if(t==1){
		        System.out.println("true");
		    }
		    else{
		        System.out.println("false");
		    }
	}

}
