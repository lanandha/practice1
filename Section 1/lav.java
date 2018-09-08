package ad;
import java.util.*;
public class lav {
	public static void main(String[] args){
		int n,i,j,c;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int a[]=new int[n];
for (i=0;i<n;i++)
{
 a[i]=in.nextInt();
}
 for(i=0;i<n;i++)
 {
	 int count=0;
	 for(j=0;j<n;j++)
	 {
		 if(a[i]==a[j])
		 count++;
	
		 
	 }
	 if(count==1)
	 {
	 
	 System.out.println(a[i]);
	 }
 }
 
 


	}
}
	