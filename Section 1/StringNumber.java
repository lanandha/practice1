package ad;
import java.util.Scanner;
public class StringNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String []arr=str.split("\\s");
		int len=arr.length;
		int count=0;
		int count1=0;
	  //System.out.println(len);
		for(int i=0;i<len;i++){
			str=arr[i];
			char []ch=str.toCharArray();
			int len1=ch.length;
		//System.out.println(len1);
			for(int j=1;j<=len1;j++){
				if(len1%j==0){
					count++;
				}
			}
			
			if(count==2){
				count1++;
			}
			
		}
		System.out.println(count);
		System.out.print(count1);
		if(count1==len){
			//System.out.print("Special");
		}
		else{
	//		System.out.println("not a special");
		}
		
		
	}

}
