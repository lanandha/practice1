package ad;
import java.util.Scanner;
public class Length {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		   String str=sc.nextLine();
		   String []a=str.split(" ");
		   int sum=0;
		   int sum1=0;
		   int sum2=0;
		   for(int i=0;i<a.length;i++){
			   sum+=a[i].length();
		   }
		 //  System.out.println(sum);
		   while(sum>9){
			   int temp=sum%10;
			   sum/=10;
			   sum1=sum+temp;
			   
		   }
		   while(sum1>0){
			   int temp=sum1%10;
			   sum1/=10;
			   sum2=sum1+temp;
			   System.out.println(sum2);
		   }
		   
	}

}
