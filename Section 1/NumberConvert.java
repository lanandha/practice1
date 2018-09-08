package ad;
import java.util.Scanner;
public class NumberConvert {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		
		long h=Long.parseLong(input1);
	      long l=Long.parseLong(input2);
		long a=h+l;
		String str=Long.toString(a);
		System.out.println(str);
	}

}
