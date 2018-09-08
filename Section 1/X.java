package ad;
import java.util.Arrays;
import java.util.Scanner;
public class X {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1="";
		String str2="";
		String []a=str.split(" ");
		for(int i=0;i<a.length;i++){
			int c=0;
			char []ch=a[i].toCharArray();
			for(int j=0;j<ch.length;j++){
				for(int k=j+1;k<ch.length;k++){
				if(ch[j]==ch[k]){
				c++;	
				}
				}
			}
			if(c>0){
				str1+=a[i];
			}
			else{
				str2+=a[i];
			}
		}
		str1=str1.toUpperCase();
		str2=str2.toUpperCase();
		String out="";
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for(int i=ch2.length-1;i>=0;i--){
			out+=ch2[i];
		}
		for(int i=ch1.length-1;i>=0;i--){
			out+=ch1[i];
		}
		System.out.println(out);
	}

	
}
