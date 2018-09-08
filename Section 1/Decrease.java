package ad;
import java.util.Scanner;
public class Decrease {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int e=0;
	if(n!=1){
		for(int i=0;i<n-1;i++){
		int cnt=1;
		if(arr[i]>arr[i+1]){
		c++;
		for(int j=i;j<n-1;j++){
		if(arr[j]>arr[j+1]){
		cnt++;
		i=j;
		}
		else{
			i=j;
		break;
		}
		}
		if(cnt>e){
			
			
		e=cnt;
		}
		}
		}
		
		System.out.println(c);
		System.out.println(e);
		
		}
		
	else{
	System.out.println("0 0");	
	}
		
		}

}
