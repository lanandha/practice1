package ad;
import java.util.Scanner;
public class Conversion {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int len1=str.length();
		int len=str1.length();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String str2=sb.substring(0,len+1);
		StringBuffer sb2=new StringBuffer(str2);
		sb2.reverse();
		String str4=sb2.toString();
		String rem=sb.substring(len+1, len1);
		StringBuffer s=new StringBuffer(rem);
		s.reverse();
		String rem1=s.toString();
		StringBuffer sb1=new StringBuffer(str1);
		sb1.reverse();
		StringBuffer sb3=new StringBuffer(sb1);
		sb3.reverse();
		String str3=sb3.substring(0,len);
		System.out.println(str4);
		System.out.println(str3);
		long l=Long.parseLong(str4);
		long l1=Long.parseLong(str3);
		long h=l+l1;
		String out=Long.toString(h);
		System.out.println(rem1+out);
	}

}
