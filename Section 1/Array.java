package ad;
import java.util.Scanner;
public class Array {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len=Integer.toString(n).length();
		System.out.println(len);
		int []arr=new int[n];
	/*	for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}*/
		int l=0;
		int []arr1=new int[n];
		for(int i=0;i<n;i++){
		
				arr1[l]=arr[i];
				l++;
			}
		
	/*	for(int i=0;i<n;i++){
			System.out.println(arr1[i]);
		}*/
	}

}
