package ad;
import java.util.Scanner;
public class Maxmimum {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=Integer.toString(arr[i]).length();
		}
		int[] rem=new int[sum];
		int h=0;
		for(int i=0;i<n;i++){
			int temp=arr[i];
			while(temp!=0){
				rem[h]=temp%10;
				h++;
				temp/=10;
			}
		}
		int []out=new int[10];
		int k=0;
		int max=0;
		for(int i=0;i<sum;i++){
			int count=0;
			for(int j=i+1;j<sum;j++){
				if(rem[i]==rem[j]){
					count++;
				}
			}
			if(count==0){
				out[k]=rem[i];
				k++;
			}
		
		}
		int c=0;
        int max1=0;
		for(int i=0;i<k;i++){
			int count=0;
		for(int j=0;j<sum;j++){
			if(out[i]==rem[j]){
				count++;
			}
		}
         
		if(count>max){
			max=count;
			
		}
		}
	
		for(int i=0;i<k;i++){
			int count=0;
			for(int j=0;j<sum;j++){
				if(out[i]==rem[j]){
					count++;
				}
			}
			if(count==max){
				
				
				
				System.out.println(out[i]);
				if(out[i]>max1){
					max1=out[i];
				}
			}
			
		}
		
		System.out.println(max1);
	}

}
