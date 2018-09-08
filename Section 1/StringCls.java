package ad;
import java.util.Scanner;
public class StringCls {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] s=str.split("");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		for(int i=0;i<s.length;i+=2){
			int a=Integer.parseInt(s[i+1]);
			for(int j=1;j<=a;j++){
				System.out.print(s[i]);
			}
			System.out.println();
		}
	}

}
