package ad;
import java.util.Scanner;
public class Largest {
	public static void main(String[] args){
		int len=args.length;
		if(len<9){
			System.out.println("please enter the number");
		}
        int [][]arr=new int[len][len];	
        int s=0;
        for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
        		arr[i][j]=Integer.parseInt(args[s]);
        		s++;
        	}
        }
        int max=0;
        	for(int i=0;i<=0;i++){
        	    for(int j=0;j<=0;j++){
        	    	max=arr[i][j];
        	    }
        	}
        	for(int i=0;i<3;i++){
        		for(int j=0;j<3;j++){
        			if(arr[i][j]>max){
        				max=arr[i][j];
        			}
        		}
        	}
        	System.out.println(max);
        
	}

}
