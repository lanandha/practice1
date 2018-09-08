package ad;
import java.util.Scanner;
public class Adder {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int len=Integer.toString(n).length();
		int[] arr=new int[len];
		int l=len-1;
		for(int i=0;i<len;i++){
			arr[l]=n%10;
			l--;
			n/=10;
		}
		int []out=new int[len];
		int k=0;
		for(int i=0;i<len;i++){
			int sum=0;
			for(int j=i;j<len;j++){
				sum=sum+arr[j];
			}
			out[k]=sum;
			k++;
		}
		int sum1=0;
		for(int i=0;i<k;i++){
			sum1+=out[i];
		}
		System.out.println(sum1);
	}

}
