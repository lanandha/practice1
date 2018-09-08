package ad;
import java.util.Scanner;
public class StringSplit {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []a=str.split(" ");
		for(int i=0;i<a.length;i++){
	     char[] ch=a[i].toCharArray();
	     for(int m=0;m<ch.length;m++){
	    	 System.out.println(ch[i]);
	     }
			int temp=ch.length;
			int count=0;
			for(int j=0;j<ch.length;j++){
				for(int k=j+1;k<ch.length;k++){
			if(ch[j]==ch[k]){
						ch[k]=ch[ch.length-1];
						k--;
				        temp--;
				        count++;
					
				}
				
		//	System.out.print(ch[k]);
				}
			}
			//for(int l=0;l<count;l++){
				//System.out.print(ch[l]);
			
			//	}
			
		}
		
	}

}
