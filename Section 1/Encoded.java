package ad;
import java.util.Scanner;
public class Encoded {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n+1];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int []arr1=new int[n];
		int h=n-2;
		//arr1[h]=arr[n-1];
		for(int i=n-1;i>0;i--){
			arr1[h]=arr[i]-arr[i-1];
			if(arr1[h]<0){
				arr1[h]=(-1)*arr1[h];
			}
			arr[i-1]=arr1[h];
			h--;
			//System.out.println(arr1[i]);
		}
		arr1[n-1]=arr[n-1];
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr1[i];
		}
		System.out.println(arr1[0]);
		System.out.println(sum);
	}

}
