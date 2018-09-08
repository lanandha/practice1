package ad;
import java.util.Scanner;
public class Not {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
				int sum=0;
				for(int i=0;i<n;i++){
					int count=0;
					for(int j=1;j<=i;j++){
						if(i%j==0){
							count++;
						}
					}
					if(count>2){
						sum+=arr[i];
						System.out.println(arr[i]);
					}
				}
				System.out.println(sum);
			
	}

}
