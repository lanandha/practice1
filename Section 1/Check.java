package ad;
import java.util.Scanner;
public class Check {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char [] ch=str.toCharArray();
		int len=str.length();
		int count=0;
		int count1=0;
		for(int i=0;i<len;i++){
			if(Character.isUpperCase(ch[i])){
               count++;
			}
			else{
				count1++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
