package ad;
import java.util.Scanner;
public class Anagrams {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		char[] ch=str.toCharArray();
		char[]ch1=str1.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++){
			int count=0;
			for(int j=0;j<ch1.length;j++){
				if(ch[i]==ch1[j]){
					count++;
				}
				if(count==1){
					c++;
					break;
				}
			}
			}
		if(str1.length()==str.length()){
			if(c==str1.length());
			System.out.println("anagrams");
		}
		else{
			System.out.println("not");
		}
	}

}
