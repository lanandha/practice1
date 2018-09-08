package ad;
import java.util.Scanner;
public class Milestone {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int num=sc.nextInt();
		String []a=str.split(" ");
		int b=num%10;
	    int c=num/10; 
	    int len=a[b-1].length();
	    int x=len/2;
	    int len1=a[c-1].length();
	    int y=len/2;
	    String rev1="";
		String rev="";
		String str1=a[c-1];
		String str2=a[b-1];
		char[]ch1=str2.toCharArray();
		char []ch=str1.toCharArray();
		if(b!=0 && c!=0){
		if(len1%2==0){
			for(int i=0;i<y;i++){
				rev+=ch[i];
			}
		}
		else{
			for(int i=0;i<=y;y++){
				rev+=ch[i];
			}
		}
				if(len%2==0){
					for(int i=0;i<y;i++){
						rev1+=ch1[i];
					}
				}
				else{
					for(int i=0;i<=x;i++){
						rev1+=ch1[i];
					}
					
				}
				}
		System.out.print(rev+" "+rev1);
		String out="";
		String out1="";
	
		for(int i=len1-1;i>x;i--){
			out+=ch[i];
		}
		
	}


}
