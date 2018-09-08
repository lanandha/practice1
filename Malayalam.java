import java.util.Scanner;
public class Malayalam {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=str.toLowerCase();
		int len=str1.length();
		int k=0;
		int count2=0;
		char []d=new char[10];
		int []arr=new int[len];
		char []ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++){
			int a=(int)ch[i];
			int count=0;
			for(int j=0;j<=i;j++){
				int b=(int)ch[j];
				if(a==b){
					count++;
				}
				}
			if(count==1){
				count2++;
				char c=(char)ch[i];
				d[k]=c;
				k++;
			}
		}
		for(int i=0;i<count2;i++){
			int count3=0;
			for(int j=0;j<len;j++){
				if(d[i]==ch[j])
					count3++;
			}
			System.out.println(d[i]+" "+count3);
		}
		
	}

}
