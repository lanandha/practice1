import java.util.*;
public class removedpalindrome {
	public static void main(String[] args) {
		int aa;
		Scanner ss= new Scanner (System .in);
        aa=ss.nextInt();
		String a =String.valueOf(aa);
        StringBuffer s2 =new StringBuffer(a);
        if(a.equals(s2.reverse().toString())) {
        	System.out.println("-1");
        }else
       for(int i=0;i<a.length();i++){
    	  String s = a .substring(0,i)+a.substring(i+1);
    	  StringBuffer sb =new StringBuffer(s);
    	  String s1  =sb.reverse().toString();
       if(s.equals(s1)){
        System.out.println(a.charAt(i));
        break;
        }
        }
  }}


