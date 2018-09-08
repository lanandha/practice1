package ad;
import java.util.Scanner;
public class Building {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []a=str.split(" ");
		for(int i=0;i<a.length;i++){
			String out="";
			String out1="";
			char ch[]=a[i].toCharArray();
				for(int j=0;j<ch.length;j++){
				if(j%2==0){
					out+=ch[j];
				}
				else{
					out1+=ch[j];
				}
			}
				StringBuffer sb=new StringBuffer(out1);
				sb.reverse();
				System.out.println(out+sb);
	 }
		
	}

}
