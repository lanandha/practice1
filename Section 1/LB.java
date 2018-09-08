package ad;
import java.util.Arrays;
import java.util.Scanner;
public class LB {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] arr=str.toCharArray();
		int a[]=new int[str.length()];
		int k=0;
		int m=0;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				m=arr[i];
			}
			else{
				m=arr[i];
			}
			
				if (Character.isLetter(arr[i])){
				a[k]=i;
				k++;
			}
		}
		
		
					
		
	}

}
