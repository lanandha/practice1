package ad;
import java.util.Scanner;
public class UaserId {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		input1.length();
		int l2=input2.length();
		String o1="",o2="";
		int in1=0,in2=0;
		if(l1<l2){
			o1=input1.substring(l1-1);
			o2=input2;
		}else if(l1>l2){
			o1=input2.substring(l2-1);
			o2=input1;
		}else{
			char ch1[]=input1.toCharArray();
			char ch2[]=input2.toCharArray();
			for(int i=0;i<ch1.length;i++){
				if(ch1[i]!=ch2[i]){
					if(ch1[i]>ch2[i]){
						in1++;
						break;
					}else{
						in2++;
						break;
					}
				}
			}
			if(in1>in2){
				o1=input2.substring(l2-1);
				o2=input1;
			}else{
				o1=input1.substring(l1-1);
				o2=input2;
			}
		}
		String out=o1+o2,out1="";
		char ch[]=out.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(Character.isUpperCase(ch[i])){
				out1=out1+String.valueOf(ch[i]).toLowerCase();
			}else{
				out1=out1+String.valueOf(ch[i]).toUpperCase();
			}
		}
		String pin=String.valueOf(input3);
		int l=pin.length();
		int o3=Integer.valueOf(pin.charAt(input4-1)-48);
		int o4=Integer.valueOf(pin.charAt(l-input4)-48);
		String output=out1+""+o3+""+o4;
		return output;
	}

}
