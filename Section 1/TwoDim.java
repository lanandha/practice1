package ad;
import java.util.Scanner;
public class TwoDim {
     public static void main(String[] args){
    	int len=args.length;
    	if(len<4){
    		System.out.println("Please enter the number");
    	}
    	int [][]arr=new int[len][len];
    	int s=0;
    	for(int i=0;i<2;i++){
    		for(int j=0;j<2;j++){
    			arr[i][j]=Integer.parseInt(args[s]);
    			s++;
    		}
    	}
    	for(int i=1;i>=0;i--){
    		for(int j=1;j>=0;j--){
    			System.out.print(arr[i][j]+" ");
    		}
    		System.out.println();
    	}
     }
}