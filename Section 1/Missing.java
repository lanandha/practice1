package ad;
import java.util.Scanner;
public class Missing {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	 int a=arr[0]-arr[1];
		 for(int i=0;i<n-1;i++){
			 int c=arr[i]-arr[i+1];	
			 if(a==c){
				 
			 }
		 }
		
	}

}
