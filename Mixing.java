import java.util.*;
public class Mixing {
 public static void main(String[]args){
	 String s="",s1,s2="";
	 Scanner sc=new Scanner(System.in);
	 int i,c=0,c1=0,k,j,count=0;;
	 s1=sc.nextLine().toUpperCase();
	 String r1[]=s1.split(" ");
	 for(i=0;i<r1.length;i++){
		 count=0;
		 char ch[]=r1[i].toCharArray();
		for(j=0;j<ch.length;j++){
			 for(k=0;k<ch.length;k++){
		 if(ch[j]==ch[k]){
			 count++;
		 }
			 }
		 }
			 if(ch.length==count){
				 s+=r1[i];
			 }
			 else{
				 s2+=r1[i];
			 }
	 }
	 char cc[]=s.toCharArray();
	 char cd[]=s2.toCharArray();
	 Arrays.sort(cc);
	 Arrays.sort(cd);
	 for(i=cc.length-1;i>=0;i--){
		 System.out.print(cc[i]);
	 } for(i=cd.length-1;i>=0;i--){
		 System.out.print(cd[i]);
	 }
}
}
