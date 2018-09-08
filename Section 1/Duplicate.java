package ad;
import java.util.Scanner;
public class Duplicate {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int v=n;
		 String [] b=new String[n];
		int k=0;
		for(int i=0;i<v;i++){
			int c=0;

			for(int j=0;j<=i;j++){
				if(arr[i]==arr[j]){
					c++;
				}
			}
			if(c==1){
			System.out.println(arr[i]);
	
		//	System.out.println(i);
		
			}
		
		}
		
		/*for(int i=0;i<k;i++){
		System.out.println(b[i]);
		}
		
			for(int j=0;j<n;j++){
			if(b[0]==arr[j]){
				count++;
			}
			System.out.println(b[0]+" "+count);
			}
		
		if(count==0){
			System.out.print("no duplicate array");
		}*/
		
			
		
		
	}

}
