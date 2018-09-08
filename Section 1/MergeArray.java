package ad;
import java.util.Scanner;
public class MergeArray {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int []arr=new int[n];
		int []arr1=new int[n1];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		  int count=0;
		int c=n+n1;
		int []arr2=new int[c];
		
		for(int i=0;i<n;i++){
			arr2[i]=arr[i];
			count++;
		}
		  for(int i=0;i<n1;i++){
				arr2[count++]=arr1[i];	
		}
		//  for(int i=0;i<c;i++){
		 // System.out.println(arr2[i]);
		  //}

         			for(int i=0;i<c;i++){
				for(int j=i+1;j<c;j++){
					if(arr2[i]>arr2[j]){
						int a=arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=a;
					}
				}
				System.out.print(arr2[i] +" ");
			}
		
		
	
		
				
	}

}
