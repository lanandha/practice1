package ad;
import java.util.Scanner;
public class Filter {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String []a=str.split("_");
		String str1=sc.next();
		String []b=str1.split(":");
		int c=0;
	/*	for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}*/
		//System.out.println(a[0]);
		//System.out.println(a[1]);
		for(int i=0;i<b.length;i++){
			String h=b[i].substring(0,a[0].length());
			String v=b[i].substring(b[i].length()-a[1].length(), b[i].length());
			//System.out.println(h);
			//System.out.println(v);
				if(a[0].equalsIgnoreCase(h) && a[1].equalsIgnoreCase(v)){
					c++;
					if(c>1){
					System.out.print(":");
					}
					System.out.print(b[i]);
			    }
				
		        }
	}

}
