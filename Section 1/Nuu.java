package ad;
import java.util.Scanner;
public class Nuu {
	public static void main(String[] args){
		Scanner cs=new Scanner(System.in);
		int n=cs.nextInt();
		int temp=n;
		int sum=0;
		int a=0;
		int out=1;
		int len=Integer.toString(n).length();
		for(int i=1;i<len;i++){
			out=out*10;
		}
		temp=temp-(temp/10)*10;
	     a=n/out;
		int x=temp-a;
		if(x<0){
			x=(-1)*x;
		}
		if(temp>a){
			int c=n+(x*out);
			int d=c-x;
			System.out.println(d);
		}
		else{
			int c=n-(x*out);
			int d=c+x;
			System.out.println(d);
		}
	}
	
}
