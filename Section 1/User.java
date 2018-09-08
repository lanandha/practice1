package ad;
import java.util.Scanner;
public class User {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int a=sc.nextInt();
		int len=Integer.toString(a).length();
		int b=sc.nextInt();
		int l=str.length();
		int l1=str1.length();
		String out="";
		if(l>l1){
			out+=str1.substring(l1-1,l1);
			out+=str;
		}
		else{
			out+=str.substring(l-1,l);
			out+=str;
		}
		int c=len-b;
		for(int i=0;i<len;i++){
			int rem=a%10;
			a/=10;
			if(i==c){
				out+=rem;
			}
			if(i==b-1){
				out+=rem;
			}
		}
		String out1="";
		char []ch=out.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(Character.isUpperCase(ch[i])){
			   out1+=Character.toLowerCase(ch[i]);
			}
			else if(Character.isLowerCase(ch[i])){
				out1+=Character.toUpperCase(ch[i]);
			}
			else{
				out1+=ch[i];
			}
		}
		System.out.println(out1);
	}

}
