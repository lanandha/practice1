package ad;
import java.util.Scanner;
public class Preassentment {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []split=str.split(" ");
		String[] str1=new String[split.length];
		for(int i=0;i<split.length;i++){
			StringBuffer sb=new StringBuffer(split[i]);
			sb.reverse();
			str1[i]=sb.toString();
		}
			if(split.length%2==0){
			for(int i=0;i<split[1].length();i++){
		
				
			}
		}
		
		
	}

}
