package ad;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int []arr=new int[n];
		String []arr1=new String[n1];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++){
			arr1[i]=sc.next();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr);
			for(int i=0;i<n;i++){
			System.out.println(arr[i]);
			}
			for(int i=0;i<n1;i++){
				System.out.println(arr1[i]);
			}
	}

}
