package ad;
import java.util.Scanner;
public class MalayalamNew {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		  String str=sc.next();
		  int len=str.length();
		  String []str2=new String[len];
				String [] str1=new String[len];   
		  for(int i=0;i<str.length();i++){
			  str2[i]=str.substring(i,i+1);
		  }
		  for(int i=0;str.length()!=0;i++){
			  int count=0;
			  str1[i]=str.substring(0,1);
			  for(int j=0;j<len;j++){
				  if(str1[i].equalsIgnoreCase(str2[j])){
					  count++;
				  }
			  }
		  
		  System.out.println(str1[i]+" "+count);
				  str=str.replaceAll(str1[i],"");
		  }
		  
		
	}

}
