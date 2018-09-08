package ad;
import java.util.Scanner;
public class PassNew {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int []rem=new int[50];
	int k=0;
	int count=0;
	for(int i=0;i<n;i++){
		int temp=arr[i];
		while(temp!=0){
			rem[k]=temp%10;
			k++;
			temp/=10;
			count++;   
		}
		
	}
	/*for(int i=0;i<rem.length;i++){
		System.out.print(rem[i]);
	}*/
	for(int i=0;i<count;i++){
		for(int j=i+1;j<count;j++){
			if(rem[i]<rem[j]){
				int a=rem[i];
				rem[i]=rem[j];
				rem[j]=a;
			}
			
		}
	}
	System.out.print(rem[0]);
	
	
	for(int i=0;i<3;i++){
		for(int j=i;j<count;j+=3){
			if(rem[i]>rem[j]){
				int a=rem[i];
				rem[i]=rem[j];
				rem[j]=a;
			}
		}
		System.out.print(rem[i]);
	}
	
	
	
	}
	

}
