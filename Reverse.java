import java.util.*;
public class Reverse{
    public static void main(String[]args){
        String a,a1,a2,a3;
        int i;
String rev="";
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        a1=a.replaceAll(" ","");
       // System.out.println(a1);
         int b=a1.length();
       /*  String []sa=a.split("");
        char ch=sa.charAt(b-1);
        //StringBuffer ss=new StringBuffer(a);
        //ss.reverse();
        */
        
        for(i=b-1;i>=0;i--){
            rev=rev+a1.charAt(i);
        }
        int c=rev.length();
        a2=rev.substring(0,1);
        a3=rev.substring(1,c);
        System.out.println(a2+" "+a3);
    }
}

//public class Reverse {


