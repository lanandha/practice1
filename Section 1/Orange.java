package ad;
import java.util.Scanner;
public class Orange {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []arr=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.next();
		}
		String s="",t="",u="";
		String o="",m="",k="";
		String y="",p="",l="";
		for(int i=0;i<n;i++){
			int len=arr[i].length();
			if(len%3==0){
			     s=arr[i].substring(0,(len/3));
				t=arr[i].substring(len/3, len-(len/3));
			         u=arr[i].substring(len-(len/3),len);
				System.out.println(s+" "+t+" "+u);
			}
			else if(len%3==1){
				 o=arr[i].substring(0,(len/3));
				 m=arr[i].substring(len/3, len-(len/3));
				k=arr[i].substring(len-(len/3),len);
				System.out.println(o+" "+m+" "+k);
			}
			else{
				 y=arr[i].substring(0,(len/3));
				 p=arr[i].substring(len/3, len-(len/3));
			   l=arr[i].substring(len-(len/3),len);
				System.out.println(y+" "+p+" "+l);
			}
		}
		//System.out.println(s+t+l);
		//System.out.println(m+p);
		//System.out.println(u+k+y);
		
		
	}

}
