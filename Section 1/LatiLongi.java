package ad;
import java.util.Scanner;
import java.lang.*;
public class LatiLongi {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		String[] s=str.split(",");
		int []c=new int[n];
		int k=0;
		for(int i=0;i<n;i++){
			int count=0;
			int dec = Integer.parseInt(s[i]); 
			String binary = Integer.toBinaryString(dec);
			char []ch=binary.toCharArray();
			for(int j=0;j<ch.length;j++){
				if(ch[j]=='1'){
					count++;
				}
			}
			c[k]=count;
			k++;
		}
		int count1=0;
		for(int i=0;i<k;i++){
			for(int j=i+1;j<k;j++){
				if(c[i]>c[j]){
					count1++;
				}
			}
		}
		System.out.println(count1);
	    }

}
