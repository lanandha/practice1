package practice;
import java.util.Scanner;
public class join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String date=String.join("/","24","8","2018");
		//String time=String.join(":","06","50p.m");
//System.out.println("Date"+"="+date+" "+"Time"+"="+time);
		String s6;
		Scanner in=new Scanner(System.in);
		s6=in.next();
		String s=s6.replace("*","");
		/*boolean s1=s.startsWith("j");
		boolean s2=s.endsWith("t");
	System.out.println(s1);
	System.out.println(s2);*/
		boolean s3=s.contains("101");
		boolean s4=s.contains("1010");
		boolean s5=s.contains("101110");
		System.out.println(s3+" "+s4+" "+s5);
	}
}
