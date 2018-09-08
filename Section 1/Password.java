package ad;
import java.util.Scanner;
public class Password {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String output="";
		int temp;
		temp=n;
		int temp2;
		temp2=temp;
		int count=0;
		int sum=0;
		int sum1=0;
		String str=sc.next();
		int len=str.length();
		while(temp2!=0){
			int a=temp2%10;
			count++;
			temp2/=10;
		}
		if(count==3 && len==4){
		while(n!=0){
			int a=n%10;
			sum=sum+a;
			n=n/10;
		}
		while(sum!=0){
			int b=sum%10;
			sum1=sum1+b;
			sum=sum/10;
       }
		output=output+sum1;
		char out=' ';
		int temp1;
		temp1=temp;
		n=temp;
		n=n%10;
		switch(n){
		case 1:
			out='!';
			break;
		case 2:
			out='@';
			break;
		case 3:
			out='#';
			break;
		case 4:
			out='$';
			break;
		case 5:
			out='%';
			break;
		case 6:
			out='^';
			break;
		case 7:
			out='&';
			break;
		case 8:
			out='*';
			break;
		case 9:
		out='(';
		break;
		case 0:
			out=')';
			break;
	    }
		output=output+out;
		output+=str.charAt(len-1);
		int c=temp1%100;
		int d=c/10;
		output+=d;
		System.out.println(output);
		}
		else{
			System.out.println("INVALID INPUT");
		}
		
	}

}
