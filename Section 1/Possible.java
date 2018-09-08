package ad;
import java.util.Scanner;
public class Possible {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					count++;
				}
			}
		}
		
		
		if(str.length()/2==count){
			System.out.println("str.length()");
		}
		else{
			System.out.println("-1");
		}
	}
}
