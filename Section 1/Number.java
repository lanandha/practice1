package ad;
import java.util.Scanner;
public class Number {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		int []arr1=new int[10];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int b=0;
		int h=0;
		for(int i=0;i<arr.length;i++){
			int temp1=0;
			int temp2=0;
			 b=String.valueOf(arr[i]).length();
			 if(b<=3){
				 arr1[h]=arr[i];
				 h++;
			 }
			 if(b>3){
				 int []rem=new int[10];
				 int m=b;
				 int k=b;
					 int temp=arr[i];
					 while(temp!=0){
						 rem[k]=temp%10;
						 k--;
						 temp/=10;
					 }
					 for(int j=0;j<=b-1;j++){
						
						 temp1=(temp1*10)+rem[j];
					 }
					 arr1[h]=temp1;
					 h++;
						for(int y=2;y<=b;y++) {
							temp2=(temp2*10)+rem[y];
						}
				 arr1[h]=temp2;
				 h++;
			 }
	    }
		for(int i=0;i<h;i++){
			System.out.println(arr1[i]);
		}
		int max=0;
		for(int i=0;i<h;i++){
			if(arr1[i]>max){
				max=arr1[i];
			}
		}
		System.out.println(max);
	}

}
