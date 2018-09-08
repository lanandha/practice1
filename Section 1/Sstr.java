package ad;
import java.util.Scanner;
public class Sstr {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String[] ch=new String[str.length()];
		for(int i=0;i<str.length();i++){
			ch[i]=str.substring(i,i+1);
		}
	int c=0;
	String[] s=new String[str.length()];
	int a=0;
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i].equalsIgnoreCase(ch[j])){
					count++;
                  if(count==1){
                	  s[a]=ch[i];
                	  a++;
                	  str=str.replaceAll(ch[i],"");
                	  break;
                  }
				}
			}
		}
		int b=0;
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i].equalsIgnoreCase(ch[j])){
					b++;
				}
			}
		}
		if(ch.length/2==b){
			System.out.println(ch.length);
		}
		else if(a>0){
		System.out.println(str.length()+1);
		}
		else{
			System.out.println("-1");
		}
	}

}
