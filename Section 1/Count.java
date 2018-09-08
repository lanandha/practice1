package ad;
import java.util.Scanner;
public class Count {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int num=1;
		int i;
		while(count<n){
			num=num+1;
		for(i=2;i<=num;i++){
			if(num%i==0){
				break;
			}
		}
		if(i==num){
		count++;
		
		}
		}
		System.out.print(num);
	}

}
