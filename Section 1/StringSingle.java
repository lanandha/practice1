package ad;
import java.util.Scanner;
public class StringSingle {
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		String str1="";
		String []a=str.split("\\s");
		for(int i=0;i<a.length;i++){
			str1+=a[i];
		}
		char ch1=' ';
		char []ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++){
			int count=0;
			int b=(int)ch[i];
			for(int j=0;j<ch.length;j++){
				int c=(int)ch[j];
				if(b==c){
					count++;
				}
			}
			if(count==1){
				ch1=(char)b;
				System.out.print(ch1);
			}
		}
		
	}

}
