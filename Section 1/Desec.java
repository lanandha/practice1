package ad;
import java.util.Arrays;
import java.util.Scanner;
public class Desec {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int []arr=new int[a];
		int[] arr1=new int[b];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++){
			arr1[i]=sc.nextInt();
		}
		int []arr2=new int[a+b];
		int count=0;
		int k=0;
		for(int i=0;i<a;i++){
			count++;
			arr2[k]=arr[i];
			k++;
		}
		if(count==a){
			for(int i=0;i<b;i++){
				arr2[k]=arr1[i];
				k++;
			}
		}
		Arrays.sort(arr2);
		for(int i=k-1;i>=0;i--){
		System.out.println(arr2[i]);
		}
	}

}
