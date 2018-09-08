package ad;
import java.util.Scanner;
public class Chars {
     public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		String input2=sc.next();
		String g=input1.toLowerCase();
		String h=input2.toLowerCase();
		char[]ch2=g.toCharArray();
		char []ch3=h.toCharArray();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		int a=input1.length();
		int b=input2.length();
		char d=' ';
		String str="";
		String str1="";
		String output="";
		String str2="";
		String str3="";
		int count=0;
		char []ch=input1.toCharArray();
		char []ch1=input2.toCharArray();
		for(int i=0;i<a;i++){
			if(Character.isLowerCase(ch[i])){
				char f=Character.toUpperCase(ch[i]);
				str1+=f;
			}
			else{
				char f=Character.toLowerCase(ch[i]);
				str1+=f;
			}
		}
		for(int i=0;i<b;i++){
			if(Character.isUpperCase(ch1[i])){
				char f=Character.toLowerCase(ch1[i]);
				str2+=f;
			}
			else{
				char f=Character.toUpperCase(ch1[i]);
				str2+=f;
			}
		}
		int j=0,i;
		if(a==b){
			for(i=0;i<a;i++){
				for(j=0;j<b;j++){
					if(ch2[i]!=ch3[j]){
						if(ch2[i]<ch3[j])
							count++;
					}
				}
				if(count==1){
					break;
				}
			}
			if(count==1){
				 d=ch[a-1];
				 if(Character.isUpperCase(ch[a-1])){
					 d=Character.toLowerCase(ch[a-1]);
				 }
				 else{
					 d=Character.toUpperCase(ch[a-1]);
				 }
				str3+=str2;
				
			}
			else{
				d=ch1[b-1];
				if(Character.isUpperCase(ch1[b-1])){
					d=Character.toLowerCase(ch1[b-1]);
				}
				else{
					d=Character.toUpperCase(ch1[b-1]);
				}
				str3+=str1;
			}
		}
		else{
			if(a>b){
				 d=ch1[b-1];
				 if(Character.isUpperCase(ch1[b-1])){
					 d=Character.toLowerCase(ch1[b-1]);
				 }
				 else{
					 d=Character.toUpperCase(ch1[b-1]);
				 }
				str3+=str1;
			
			}
			else{
				 d=ch[a-1];
				 if(Character.isUpperCase(ch[a-1])){
					 d=Character.toLowerCase(ch[a-1]);
				 }
				 else{
					 d=Character.toUpperCase(ch[a-1]);
				 }
				str3+=str2;
			}
		}
		int[]rem=new int[10];
		int k=0;
		while(input3!=0){
			rem[k]=input3%10;
			k++;
			input3/=10;
		}
		int out=rem[input4-1];
		int out1=rem[k-input4];
		output+=d+str3+out1;
		output+=out;
	System.out.print(output);
	}
}