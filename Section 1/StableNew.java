package ad;
import java.util.Arrays;
import java.util.Scanner;
public class StableNew {
	public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();

				int h=0;
				int o=0;
				int sum=0;
				int sum1=0;
				int arr[]=new int [5];
				for(int i=0;i<n;i++){
					arr[i]=sc.nextInt();
				}
				int arr1[]=new int[5];
				int arr2[]=new int[5];
				int arr3[]=new int[5];
				int rem[]=new int [10];
				for(int i=0;i<5;i++){
					int temp=arr[i];
					int k=0;
					while(temp!=0){
						rem[k]=temp%10;
						k++;
						temp/=10;
					}
					int l=0;
					for(int j=0;j<k;j++){
						int count=0;
						for(int m=0;m<=j;m++){
							if(rem[j]==rem[m]){
								count++;
							}
						}
						if(count==1){
							arr1[l]=rem[j];
							l++;
						}
					}
					int []c=new int[l];
					for(int j=0;j<l;j++){
						int count=0;
						for(int m=0;m<k;m++){
							if(arr1[j]==rem[m]){
								count++;
							}
						}
						if(count>0){
							c[j]=count;
						}
					}
					int count=0;
					for(int j=0;j<l-1;j++){
						if(c[j]==c[j+1]){
							count++;
						}
					}
					if(count==l-1){
						arr2[o]=arr[i];
						sum+=arr2[o];
						o++;
					}
					else{
						arr3[h]=arr[i];
						sum1+=arr3[h];
						h++;
					}
				}
				
				int min=sum-sum1;
				
				System.out.println(min);
			
		
	}

}
