package ad;
import java.util.Scanner;
public class NumPalindrome {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
				int l=Integer.toString(input1).length();
				      int []arr=new int[l];
				int b=0;
				int k=l-1;
				int temp=input1;
				String str1="";
				while(temp!=0){
					arr[k]=temp%10;
					str1+=arr[k];
					k--;
					temp/=10;
				}
				StringBuffer s=new StringBuffer(str1);
				s.reverse();
				if(str1.equals(s.toString())){
					System.out.println("-1");
				}
				else{
					for(int j=0;j<l;j++){
					String str="";
			
				for(int i=0;i<l;i++){
					if(i!=j){
						str+=arr[i];
					}
				}
					StringBuffer sb=new StringBuffer(str);
					sb.reverse();
					if(str.equals(sb.toString())){
						b=j;
						break;
					}
					else{
						continue;
					}
				}
				System.out.println(arr[b]);
				}
	}

}
