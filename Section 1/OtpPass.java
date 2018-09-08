package ad;
import java.util.Scanner;
public class OtpPass {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		String out="";
		int temp=n;
		int sum=0;
		int l=Integer.toString(n).length();
		if(l==3){
			for(int i=0;i<l;i++){
				int rem=temp%10;
				temp/=10;
				sum+=rem;
			}
			int x=sum;
			while(x>9){
				int s=x%10;
				x/=10;
				sum=s+x;
				x=sum;
			}
			if(sum==1){
				out+=1;
			}
			else if(sum%2==0){
				out+=x;
			}
			else{
				out+=x-1;
			}
			int y=n%10;
			//System.out.println(y);
			switch(y){
			case 1:out+="!";
				    break;
			case 2:out+="@";
			        break;
			case 3:out+="#";
			       break;
			case 4:out+="$";
			       break;
			case 5:out+="%";
			       break;
			case 6:out+="^";
			       break;
			case 7:out+="&";
			       break;
			case 8:out+="*";
				   break;
			case 9:out+="(";
			       break;
			case 0:out+=")";
			       break;
			}
			out+=str.substring(str.length()-1);
			int a=n%100;
			out+=a/10;
			System.out.println(out);
			
		}
	}

}
