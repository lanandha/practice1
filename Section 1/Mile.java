package ad;
import java.util.Scanner;
public class Mile {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=sc.nextInt();
		int b=n%10;
		int a=n/10;
		String []str1=str.split(" ");
		String s=str1[a-1];
		int len=s.length();
		char []ch=str1[a-1].toCharArray();
		int mid=len/2;
		String t=str1[b-1];
		int len1=t.length();
		char[]ch1=str1[b-1].toCharArray();
		int mid1=len1/2;
		String c=s.substring(mid,len);
		String d=t.substring(mid1,len1);
	//	System.out.print(c+d);
		char []arr=new char[10];
		int k=0;
		char[]arr1=new char[10];
		int l=0;
		String rev="";
		String rev1="";
		if(len%2==0){
			for(int i=0;i<mid;i++){
				rev+=ch[i];
				
			}
		}
			else
			{
				for(int i=0;i<=mid;i++){
					rev+=ch[i];
				}
			
			}
		StringBuffer sb=new StringBuffer(rev);
		sb.reverse();
		
		if(len1%2==0){
			for(int i=0;i<mid1;i++){
				rev1+=ch1[i];
				
			}
		}
		else{
			for(int i=0;i<=mid1;i++){
				rev1+=ch1[i];
			}
		}
		StringBuffer buf=new StringBuffer(rev1);
		buf.reverse();
	/*	for(int i=k-1;i>=0;i--){
			rev+=arr[i];
		}
		for(int i=l-1;i>=0;i--){
			rev1+=arr1[i];
		}*/
		System.out.print(c+sb+" "+d+buf);
	}

}
