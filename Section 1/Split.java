package ad;
import java.util.Scanner;
public class Split {
       public static void main(String [] args){
    	   Scanner sc=new Scanner(System.in);
    	   String str=sc.nextLine();
    	   String[]a=str.split(" ");
              for(int i=0;i<a.length;i++){
            	  char []ch=a[i].toCharArray();
            	  for(int j=0;j<ch.length;j++){
            		  System.out.println(ch[j]);
            	  }
              }
       }
}
