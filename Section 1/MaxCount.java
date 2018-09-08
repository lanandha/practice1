package ad;
import java.util.Scanner;
public class MaxCount {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int l=0;
		int count2=0;
		int []c=new int[n];
		for(int i=0;i<n;i++){
			int count=0;
			for(int j=0;j<=i;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==1){
			c[l]=arr[i];
			l++;
			count2++;
			}
			}
		int []d=new int[count2];
		int k=0;
		for(int i=0;i<count2;i++){
			int count3=0;
			for(int j=0;j<n;j++){
				if(c[i]==arr[j]){
					count3++;
				}
			}
			d[k]=count3;
			k++;
		}
		for(int i=0;i<count2;i++){
			for(int j=i;j<count2;j++){
				if(d[i]<d[j]){
					int f=d[i];
					d[i]=d[j];
					d[j]=f;
				}
				
			}
		}
		System.out.print(d[0]);
	
			
	}

}
