package ad;
import java.util.Scanner;
public class World {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[]a=str.split(" ");
		int sum1[]=new int[a.length];
		int []arr=new int[a.length];
		int m=0;
		String str1="";
		for(int i=0;i<a.length;i++){
			int sum=0;
			char [] ch=a[i].toCharArray();
			int b=ch.length/2;
			int c=ch.length-1;
				if(ch.length%2==0){
					for(int j=0;j<b;j++){
				       
						sum=sum+(ch[j]-ch[c-j]);
						
				}
				
				}
				else{
					for(int j=0;j<b;j++){
						sum+=(ch[j]-ch[c-j]);
					}
					if(ch[b]>96){
					sum+=(ch[b]-96);
					}
					else{
						sum+=(ch[b]-64);
					}
				}
				
				str1+=sum;
			
		}
		System.out.println(str1);
	}

}
