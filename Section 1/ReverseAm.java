package ad;
import java.util.Scanner;
public class ReverseAm {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String out="";
		String[]a=str.split(" ");
		for(int i=a.length-1;i>=0;i--){
			StringBuffer sb=new StringBuffer(a[i]);
			out+=sb.reverse();
		}
		System.out.println(out);
		String str1="";
		int h=0;
	for(int i=0;i<a.length;i++){
		/*if(i==0){
		 h=a[i].length();
		 str1+=out.substring(0,h);
		}*/
	
			int k=h+a[i].length();
			str1+=out.substring(h,k);
			h=k;
		
	if(i<a.length){
		str1+=" ";
	}
	}
	
	System.out.println(str1);
	}

}
