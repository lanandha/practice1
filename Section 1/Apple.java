package ad;
import java.util.Scanner;
public class Apple {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len=Integer.toString(n).length();
		int []rem=new int[len+1];
		int k=len-1;
		if(n>9){
			while(n!=0){
				rem[k]=n%10;
				k--;
				n/=10;
			}
			int sum=0;
			int x=0;
			for(int i=0;i<len;i++){
		  
				for(int j=0;j<rem[i+1];j++){
					if(j==0){
					 x=rem[i];
					}
					else{
					x=(x*rem[i]);
					}
				}
				sum+=x;
			}
			System.out.println(sum);
		}
	}

}
