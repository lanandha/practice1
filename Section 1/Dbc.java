package ad;
import java.util.Scanner;
public class Dbc {
	public static void main(String[] args){
		int b=args.length;
		if(b<=0){
			System.out.println("please enter the number");
		}
		int a=Integer.parseInt(args[0]);
		if(a==1){
			System.out.println(a+"is neither prime or composite");
		}
		int count=0;
		if(a>1){
			for(int i=1;i<=a;i++){
				if(a%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.print(a+" is a prime");
			}
			else{
				System.out.println(a+" not a prime");
			}
		}
		
	}

}
