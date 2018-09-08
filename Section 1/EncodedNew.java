package ad;
import java.util.Scanner;
public class EncodedNew {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		int max=0;
		if(n!=1){
		for(int i=0;i<n-1;i++){
			int c=1;
			if(arr[i]>arr[i+1]){
				count++;
				for(int j=i;j<n-1;j++){
					if(arr[j]>arr[j+1]){
						c++;
						i=j;
					}
					else{
						i=j;
						break;
					}
				}
				if(c>max){
					max=c;
				}
			}
		}
		
		System.out.println(count);
		System.out.println(max);
		}
		else{
			System.out.println("0 0");
		}
	}

}
