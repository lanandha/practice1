package ad;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args){
		Scanner cs=new Scanner(System.in);
		int n=cs.nextInt();
		while(n!=0){
			int b=n%10;
			n/=10;
			System.out.print(b);
			
		}
		
	}

}
