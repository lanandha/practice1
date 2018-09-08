package ad;
import java.util.Scanner;
public class Otp {
	    public static void main(String[] args){
	        Scanner sc=new Scanner(System.in);
	        String name=sc.next();
	        long n=sc.nextLong();
	        //int num=(int)n;
	        //System.out.print(num);
	        String type=sc.next();
	        int h=String.valueOf(n).length();
	            String a=type.substring(0,2);
	            System.out.print(a);
	            int b=h/2;
	            long []rem=new long[h];
	           int k=0;
	            while(n!=0){
	             rem[k]=n%10;
	             k++;
	             n/=10;
	            }
	          System.out.print(rem[k-1]);
	           long c=0;
	            for(int i=5;i<0;i--){
	                c+=rem[i];
	            }
	          //  System.out.println(c);
	           long d=0;
	            while(c>9){
	               long f=c%10;
	                long g=c/10;
	                d=f+g;
	            }
	           System.out.print(d);
	            char []ch=name.toCharArray();
	            System.out.print(ch[0]);
	            long sum=0;
	            for(int i=7;i<h;i++){
	                sum+=rem[i];
	            }
	            
	           long y=0;
	            while(sum>9){
	               long x=sum%10;
	              long z=sum/10;
	                y=x+z;
	            }
	           System.out.print(y);
	            System.out.print(ch[ch.length]);
	           System.out.print(rem[0]);
	        
	    
	}


}
