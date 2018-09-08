package ad;

import java.util.Scanner;
public class Encode {
 public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int b=sc.nextInt();
	    str=str.toLowerCase();
	    String out="";
	    char[]ch1=str.toCharArray();
	    for(int i=0;i<ch1.length-1;i+=2){
	       if((ch1[i]>=33 && ch1[i]<=47) ||(ch1[i]>=58 && ch1[i]<=64)){
	            out+=ch1[i];
	            i--;
	        }
	        else {
	        int a=(int)ch1[i+1];
	       a=a-48;
	        for(int j=0;j<a;j++){
	            out+=ch1[i];
	               }
	        }
	    }
	    System.out.println(out);
	    char[] ch=out.toCharArray();
	    for(int i=0;i<ch.length;i++){
	        if(i==b){
	            System.out.print(ch[i]);
	        }
	    }
	        }
}
	    



