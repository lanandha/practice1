package ad;
import java.util.Scanner;
public class AddBetween {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int b=0;
		int c=0;
		for(int i=0;i<n;i++){
			if(arr[i]==6){
				b=i;
			}
			if(arr[i]==7){
				c=i;
			}
		}
		int sum=0;
		if(b<c){
			for(int i=0;i<b;i++){
				sum=sum+arr[i];
				
			}
			for(int i=c+1;i<n;i++){
				sum=sum+arr[i];
			}
			System.out.println(sum);
		}
		else{
			for(int i=0;i<n;i++){
				sum=sum+arr[i];

			}
			System.out.print(sum);
		}
	}

}
