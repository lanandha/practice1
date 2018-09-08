package ad;
import java.util.Scanner;
public class RepeatNumbers {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int temp=n;
		int sum=0;
		int []c=new int[10];
		for(int i=0;i<n;i++){
			int count=0;
			int d=arr[i];
			while(d!=0){
				int a=d%10;
				d=d/10;
				count++;
			}
			c[i]=count;
		    sum=sum+count;
		    }
		int []rem=new int[sum];
		int k=0;
		int temp1;
		for(int i=0;i<n;i++){
		  temp1=arr[i];
			while(temp1!=0){
				rem[k]=temp1%10;
				temp1=temp1/10;
				k++;
			}
			}
		int l=0;
		int count2=0;
		int []b=new int[10];
			for(int i=0;i<sum;i++){
				int count1=0;	
				for(int j=0;j<sum;j++){
					if(rem[i]==rem[j]){
						count1++;
					}
				}
				if(count1==1){
			
					b[l]=rem[i];
					count2++;
				
					l++;
				}
			}
		
			for(int i=0;i<count2;i++){
				for(int j=i+1;j<count2;j++){
					if(b[i]>b[j]){
					int g=b[i];
						b[i]=b[j];
						b[j]=g;
					}
				}
		}
			System.out.print(b[0]);
		
		
			
			
		
	}

}
